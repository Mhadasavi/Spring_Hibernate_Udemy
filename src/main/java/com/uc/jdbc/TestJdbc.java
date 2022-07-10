package com.uc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String... args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/omi";
        String user = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Connection established successfully");
        }
        catch(Exception exception) {
            System.out.println(exception);
        }
    }
}
