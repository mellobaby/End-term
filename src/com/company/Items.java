package com.company;
import  java.util.ArrayList;
import java.sql.*;
public class Items extends Orders{
    private  int order_item_id;
    private String product_id;
    private String seller_id;
    private String shipping_limit_date;
    private float price;
    private float freight_value;



    public Items(String order_id, int order_item_id,String product_id,String seller_id,String shipping_limit_date,float price,float freight_value){
        super(order_id);
        this.order_item_id=order_item_id;
        this.product_id=product_id;
        this.seller_id=seller_id;
        this.shipping_limit_date=shipping_limit_date;
        this.price=price;
        this.freight_value=freight_value;
    }

    public static ArrayList<Items> getAllItems() {
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


    public Items(String product_id) {
        super(product_id);
    }

    public int getOrder_item_id() {
        return order_item_id;
    }
    public String getProduct_id() {
        return product_id;
    }
    public String getSeller_id() {
        return seller_id;
    }
    public String getShipping_limit_date() {
        return shipping_limit_date;
    }
    public float getPrice() {
        return price;
    }
    public float freight_value() {
        return freight_value;
    }
    public void setOrder_item_id(int order_item_id) {
        this.order_item_id=order_item_id;
    }
    public void setProduct_id(String product_id) {
        this.product_id=product_id;
    }
    public void setSeller_id(String seller_id) {
        this.seller_id=seller_id;
    }
    public void setShipping_limit_date(String shipping_limit_date) {
        this.shipping_limit_date=shipping_limit_date;
    }
    public void setPrice(float price) {
        this.price=price;
    }
    public void setFreight_value(float freight_value) {
        this.freight_value=freight_value;
    }
}

