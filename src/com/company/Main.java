package com.company;

//This file connects Java application to Postgresql Database using JDBC Driver!

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    static Connection con;

    public static void main(String[] args) {
	// write your code here
        try{
            Class.forName("org.postgresql.Driver");
            String dbType = "jdbc:postgresql:";
            String dbUrl = "//127.0.0.1:5432/";
            String dbName = "SELab";
            String dbUser = "swarajkumar";
            String dbPass = "Enter your Postgre Password";
            con = DriverManager.getConnection(dbType+dbUrl+dbName,dbUser,dbPass);
            System.out.println("Connected Successfully!");
            if(con.isClosed()){
                System.out.println("Connection is still closed!");
            }else{
                System.out.println("Connected....");
            }
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": "+e.getMessage());
            System.exit(0);
        }

        StudentLogic sl = new StudentLogic();
        sl.setVisible(true);
        sl.setBounds(500,300,400,400);
        sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
