package com.jdbc;

import com.models.Company;
import com.models.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcTest {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {

    Class.forName("org.h2.Driver");

    Connection connection = DriverManager.getConnection(
        "jdbc:h2:file:E:/projects/java-ee-homework/db_less5", "root", "root");

    PreparedStatement preparedStatement = connection
        .prepareStatement("select NAME, AGE from USERS");

    ResultSet resultSet = preparedStatement.executeQuery();

    List<User> userList = new ArrayList<User>();

    while (resultSet.next()) {
      // String userId = resultSet.getNString(1);
      String userName = resultSet.getNString(2);
      String age = resultSet.getNString(3);
      userList.add(new User(userName, Integer.parseInt(age)));
    }

    PreparedStatement preparedStatement1 = connection
        .prepareStatement("select NAME, CODE, BANKNUMBER, ACCOUNTNUMBER");

    ResultSet resultSet1 = preparedStatement1.executeQuery();

    List<Company> companyList = new ArrayList<Company>();

    while (resultSet1.next()) {
      String companyName = resultSet1.getNString(2);
      String code = resultSet1.getNString(3);
      String bankNumber = resultSet1.getNString(4);
      String accountNumber = resultSet1.getNString(5);
      companyList.add(new Company(companyName, Integer.parseInt(code),
          Integer.parseInt(bankNumber), Integer.parseInt(accountNumber)));
    }
    connection.close();
  }
}
