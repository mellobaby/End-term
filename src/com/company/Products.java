package com.company;
import java.sql.*;
import java.util.ArrayList;

public class Products extends Items {
    private String product_category_name;
    private double product_name_length;
    private double product_description_length;
    private double product_photos_qty;
    private double product_weight_g;
    private double product_length_cm;
    private double product_name_height_cm;
    private double product_widght_cm;

    public static ArrayList<Products> getViewProducts() {
        Connection connection = null;

        try{
            connection = DB.getConnection();
            PreparedStatement pr3 = connection.prepareStatement("SELECT Items.price, Products.product_category_name,Products.product_name_length FROM Products inner join Items on Products.product_id=Items.product_id;\n");
            ResultSet resultSet = pr3.executeQuery();

            ArrayList<Products> products = new ArrayList<>();

            while (resultSet.next()) {

                   String req_pro = resultSet.getString("product_category_name");
                   int req_price = resultSet.getInt("price");
                   double req_len = resultSet.getDouble("product_name_length");

                   System.out.println("Product name: " + req_pro);
                   System.out.println("Price: " + req_price);
                   System.out.println("Product name length: " + req_len);
                   System.out.println("*********************-----Products!-----**************************");


            }
            return products;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



    public Products(String product_id, String product_category_name, double product_description_length, double product_name_length, double product_photos_qty, double product_weight_g, double product_length_cm, double product_name_height_cm, double product_widght_cm) {
        super(product_id);
        this.product_category_name = product_category_name;
        this.product_name_length = product_name_length;
        this.product_description_length = product_description_length;
        this.product_photos_qty = product_photos_qty;
        this.product_weight_g = product_weight_g;
        this.product_length_cm = product_length_cm;
        this.product_name_height_cm = product_name_height_cm;
        this.product_widght_cm = product_widght_cm;
    }

    public Products(String product_category_name) {
        super(product_category_name);
    }

    public String getProduct_category_name() {
        return product_category_name;
    }

    public double getProduct_name_length() {
        return product_name_length;
    }

    public double getProduct_description_length() {
        return product_description_length;
    }

    public double getProduct_photos_qty() {
        return product_photos_qty;
    }

    public double getProduct_weight_g() {
        return product_weight_g;
    }

    public double getProduct_length_cm() {
        return product_length_cm;
    }

    public double getProduct_name_height_cm() {
        return product_name_height_cm;
    }

    public double getProduct_widght_cm() {
        return product_widght_cm;
    }

    public void setProduct_category_name(String product_category_name) {
        this.product_category_name = product_category_name;
    }

    public void setProduct_name_length(double product_name_length) {
        this.product_name_length = product_name_length;
    }

    public void setProduct_description_length(double product_description_length) {
        this.product_description_length = product_description_length;
    }

    public void setProduct_photos_qty(double product_photos_qty) {
        this.product_photos_qty = product_photos_qty;
    }

    public void setProduct_weight_g(double product_weight_g) {
        this.product_weight_g = product_weight_g;
    }

    public void setProduct_length_cm(double product_length_cm) {
        this.product_length_cm = product_length_cm;
    }

    public void setProduct_name_height_cm(double product_name_height_cm) {
        this.product_name_height_cm = product_name_height_cm;
    }

    public void setProduct_widght_cm(double product_widght_cm) {
        this.product_widght_cm = product_widght_cm;
    }
}