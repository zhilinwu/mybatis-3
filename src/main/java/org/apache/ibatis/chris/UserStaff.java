package org.apache.ibatis.chris;

public class UserStaff {

  private String id;
  private String userName;
  private String phone;
  private String password;
  private int status;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "UserStaff{" + "id='" + id + '\'' + ", userName='" + userName + '\'' + ", phone='" + phone + '\''
        + ", password='" + password + '\'' + ", status=" + status + '}';
  }
}
