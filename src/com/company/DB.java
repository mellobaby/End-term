package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Connection getConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","3003");
            return connection;
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        return null;
    }

}
