package com_2.models;

public class Company {

  private String name;
  private int code;
  private int bankNumber;
  private int accountNumber;

  public Company(String name, int code, int bankNumber, int accountNumber) {
    this.name = name;
    this.code = code;
    this.bankNumber = bankNumber;
    this.accountNumber = accountNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public int getBankNumber() {
    return bankNumber;
  }

  public void setBankNumber(int bankNumber) {
    this.bankNumber = bankNumber;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  @Override
  public String toString() {
    return "Company{" +
        "name='" + name + '\'' +
        ", code=" + code +
        ", bankNumber=" + bankNumber +
        ", accountNumber=" + accountNumber +
        '}';
  }
}
