package com.jpa_hibernate_test;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USERS", schema = "PUBLIC", catalog = "DB_LESS7")
public class UsersEntity {

  private int id;
  private String name;
  private int age;
  private CompaniesEntity companiesEntity;

  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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
  @Column(name = "AGE")
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @ManyToOne
  @JoinColumn(name = "company_id")
  public CompaniesEntity getCompaniesEntity() {
    return companiesEntity;
  }

  public void setCompaniesEntity(CompaniesEntity companiesEntity) {
    this.companiesEntity = companiesEntity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersEntity that = (UsersEntity) o;
    return id == that.id &&
        age == that.age &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id, name, age);
  }

  @Override
  public String toString() {
    return "UsersEntity{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", companiesEntity=" + companiesEntity +
        '}';
  }
}
