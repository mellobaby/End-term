package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Orders {
    private String order_id;
    private String cust_id;
    private String order_status;
    private String order_purchase_timestamp;
    private String order_approved_at;
    private String order_delivered_carrier_date;
    private String order_delivered_cust_date;
    private String order_estimated_delivery_date;

    Orders(String order_id,String cust_id,String order_status,String order_purchase_timestamp,String order_approved_at,String order_delivered_carrier_date,String order_delivered_cust_date,String order_estimated_delivery_date){
        this.order_id=order_id;
        this.cust_id=cust_id;
        this.order_status=order_status;
        this.order_purchase_timestamp=order_purchase_timestamp;
        this.order_approved_at =order_approved_at;
        this.order_delivered_carrier_date=order_delivered_carrier_date;
        this.order_delivered_cust_date=order_delivered_cust_date;
        this.order_estimated_delivery_date=order_estimated_delivery_date;
    }

    Orders(String order_id){
        this.order_id = order_id;
    }

    public static ArrayList<Orders> getCheckMyOrder() {
        Connection connection = null;
        Scanner oID = new Scanner(System.in);


            System.out.print("Please, write your order ID: ");
            String new_ID = oID.nextLine();

            try {
                connection = DB.getConnection();
                PreparedStatement pr1 = connection.prepareStatement("SELECT * FROM Orders");

                ArrayList<Orders> orders = new ArrayList<>();

                PreparedStatement pr2 = connection.prepareStatement("select *from Orders  where order_id = ?");

                pr2.setString(1, new_ID);
                ResultSet resultSet = pr2.executeQuery();
                System.out.println("Your Order: " + new_ID);

                while (resultSet.next()) {

                    String requested_status = resultSet.getString("order_status");
                    String app_date = resultSet.getString("order_approved_at");
                    String requested_ID = resultSet.getString("cust_id");
                    String req_pur = resultSet.getString("order_purchase_timestamp");
                    String req_car = resultSet.getString("order_delivered_carrier_date");
                    String req_del = resultSet.getString("order_delivered_cust_date");
                    String req_est = resultSet.getString("order_estimated_delivery_date");

                    System.out.println("Order status: " + requested_status);
                    System.out.println("Approved at: " + app_date);
                    System.out.println("Customer ID: " + requested_ID);
                    System.out.println("Order purchase timestamp: " + req_pur);
                    System.out.println("Order delivered carrier date: " + req_car);
                    System.out.println("Order delivered customer date: " + req_del);
                    System.out.println("Order estimated delivery date: " + req_est);


                    System.out.println("********************************************************");
                }
                return orders;

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }





    public String getOrder_id() {
        return order_id;
    }
    public String getCust_id() {
        return cust_id;
    }
    public String getOrder_status() {
        return order_status;
    }
    public String getOrder_purchase_timestamp() {
        return order_purchase_timestamp;
    }
    public String getOrder_approved_at() {
        return order_approved_at;
    }
    public String getOrder_delivered_carrier_date() {
        return order_delivered_carrier_date;
    }
    public String getOrder_delivered_cust_date() {
        return order_delivered_cust_date;
    }
    public String getOrder_estimated_delivery_date() {
        return order_estimated_delivery_date;
    }
    public void setOrder_id(String order_id) {
        this.order_id=order_id;
    }
    public void setCust_id(String cust_id) {
        this.cust_id=cust_id;
    }
    public void setOrder_status(String order_status) {
        this.order_status=order_status;
    }
    public void setOrder_purchase_timestamp(String order_purchase_timestamp) {
        this.order_purchase_timestamp=order_purchase_timestamp;
    }
    public void setOrder_approved_at(String approved_at) {
        this.order_approved_at=order_approved_at;
    }
    public void setOrder_delivered_carrier_date(String order_delivered_carrier_date) {
        this.order_delivered_carrier_date=order_delivered_carrier_date;
    }
    public void setOrder_delivered_cust_date(String order_delivered_cust_date) {
        this.order_delivered_cust_date=order_delivered_cust_date;
    }
    public void setOrder_estimated_delivery_date(String order_estimated_delivery_date) {
        this.order_estimated_delivery_date=order_estimated_delivery_date;
    }


}
