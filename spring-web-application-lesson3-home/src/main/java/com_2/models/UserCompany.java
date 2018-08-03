package com.models;

public class UserCompany {

  private User user;
  private Company company;

  public UserCompany(User user, Company company) {
    this.user = user;
    this.company = company;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  @Override
  public String toString() {
    return "UserCompany{" +
        "user=" + user +
        ", company=" + company +
        '}';
  }
}
