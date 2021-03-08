package com.company;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // Connection connection = null;
      //  Statement stmt = null;
       // ResultSet rs = null;

        //DB obj_ConnectDB = new DB();
        //connection = obj_ConnectDB.getConnection();

        while(true) {
            System.out.println();
            System.out.println("Aloha, my friend!");
            System.out.println("I will do whatever you want!");
            System.out.println("Choose wish:");
            System.out.println("1. Get all customers");
            System.out.println("2. Check my order");
            System.out.println("3. View products");
            System.out.println("4. Get all items");
            System.out.println("5. Company revenue");
            System.out.println("0. Exit");

            System.out.println("Enter wish 1-5");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if (choice==1) {
                Customers.getAllCustomers();
            }
           else if (choice==2) {
                Orders.getCheckMyOrder();
           }
            else if (choice==3) {
                Products.getViewProducts();
            }
//            else if (choice==4) {
//                removeMedicineByIdMenu();
//            }
//            else if (choice==5) {
//                getAllMedicineList();
//            }
            else {
                break;
            }




        }
    }
}
