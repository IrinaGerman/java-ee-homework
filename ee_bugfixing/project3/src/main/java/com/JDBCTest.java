package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Connection connection = DriverManager.getConnection(
        "jdbc:h2:file:E:/projects/java-ee-homework/ee_bugfixing/project3/src/main/resources/test_db",
        "root", "root");
    PreparedStatement preparedStatement =

        //prepareStatement + пробел после name
        connection.prepareStatement("select id, name "
            + "from users");
    ResultSet resultSet = preparedStatement.executeQuery();
    while (resultSet.next()) {
      //заменить columnIndex, чтобы начинался не с 0, а с 1
      System.out.println("id=" + resultSet.getInt(1));
      System.out.println("name=" + resultSet.getString(2));
    }

  }
}
