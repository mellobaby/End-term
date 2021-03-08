package com.company;

import java.sql.*;
import java.util.ArrayList;

public class Customers extends Orders {
    private String cust_uni_id;
    private int cust_zip_code_prefix;
    private String cust_city;
    private String cust_state;

    Customers(String cust_id, String cust_uni_id, int cust_zip_code_prefix, String cust_city, String cust_state) {
        super(cust_id);
        this.cust_uni_id = cust_uni_id;
        this.cust_zip_code_prefix = cust_zip_code_prefix;
        this.cust_city = cust_city;
        this.cust_state = cust_state;
    }

    public static ArrayList<Customers> getAllCustomers() {
        Connection connection = null;

        try{
            connection = DB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Customers");

            ResultSet resultSet = preparedStatement.executeQuery();

            ArrayList<Customers> customers = new ArrayList<>();

            while (resultSet.next()) {

                    String req_cust = resultSet.getString("cust_id");
                    String req_uni = resultSet.getString("cust_unique_id");
                    int req_zip = resultSet.getInt("cust_zip_code_prefix");
                    String req_city = resultSet.getString("cust_city");
                    String req_state = resultSet.getString("cust_state");

                    System.out.println("Customer ID: " + req_cust);
                    System.out.println("Customer unique ID: " + req_uni);
                    System.out.println("Customer zip code prefix: " + req_zip);
                    System.out.println("Customer city: " + req_city);
                    System.out.println("Customer state: " + req_state);
                    System.out.println("*********************-----NEXT-----**************************");


            }
            return customers;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getCust_uni_id() {
        return cust_uni_id;
    }

    public int getCust_zip_code_prefix() {
        return cust_zip_code_prefix;
    }

    public String getCust_city() {
        return cust_city;
    }

    public String getCust_state() {
        return cust_state;
    }

    public void setCust_uni_id(String cust_uni_id) {
        this.cust_uni_id = cust_uni_id;
    }

    public void setCust_zip_code_prefix(int cust_zip_code_prefix) {
        this.cust_zip_code_prefix = cust_zip_code_prefix;
    }

    public void setCust_city(String cust_city) {
        this.cust_city = cust_city;
    }

    public void setCust_state(String cust_state) {
        this.cust_state = cust_state;
    }
}
