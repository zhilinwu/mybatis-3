package org.apache.ibatis.chris;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.reflection.Reflector;
import org.apache.ibatis.reflection.ReflectorFactory;
import org.apache.ibatis.reflection.invoker.Invoker;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Main {

  public static void main(String[] args) throws Exception {

    InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    SqlSession session = sqlSessionFactory.openSession();
    try {

      UserStaff userStaff = session.selectOne("org.apache.ibatis.chris.UserStaffMapper.getUserStaff");
      System.out.println(userStaff);

    } finally {
      session.close();
    }
    Configuration configuration = new Configuration();
    ReflectorFactory reflectorFactory = configuration.getReflectorFactory();
    Reflector reflector = reflectorFactory.findForClass(UserStaff.class);
    Invoker invoker = reflector.getGetInvoker("userName");
    UserStaff userStaff = new UserStaff();
    Object[] params = { "123" };
    invoker.invoke(userStaff, params);
    System.out.println(userStaff);
  }

}
