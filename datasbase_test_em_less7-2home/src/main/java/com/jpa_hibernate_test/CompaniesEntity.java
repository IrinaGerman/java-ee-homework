package com.jpa_hibernate_test;

import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANIES", schema = "PUBLIC", catalog = "DB_LESS7")
public class CompaniesEntity {

  private int id;
  private String name;
  private int code;
  private int banknumber;
  private int accountnumber;
  private List<UsersEntity> usersEntityList;

  @Id
  @Column(name = "ID")
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Basic
  @Column(name = "NAME")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Basic
  @Column(name = "CODE")
  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  @Basic
  @Column(name = "BANKNUMBER")
  public int getBanknumber() {
    return banknumber;
  }

  public void setBanknumber(int banknumber) {
    this.banknumber = banknumber;
  }

  @Basic
  @Column(name = "ACCOUNTNUMBER")
  public int getAccountnumber() {
    return accountnumber;
  }

  public void setAccountnumber(int accountnumber) {
    this.accountnumber = accountnumber;
  }


  @OneToMany(mappedBy = "companiesEntity")
  public List<UsersEntity> getUsersEntityList() {
    return usersEntityList;
  }

  public void setUsersEntityList(List<UsersEntity> usersEntityList) {
    this.usersEntityList = usersEntityList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompaniesEntity that = (CompaniesEntity) o;
    return id == that.id &&
        code == that.code &&
        banknumber == that.banknumber &&
        accountnumber == that.accountnumber &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id, name, code, banknumber, accountnumber);
  }

  @Override
  public String toString() {
    return "CompaniesEntity{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", code=" + code +
        ", banknumber=" + banknumber +
        ", accountnumber=" + accountnumber +
        '}';
  }
}
