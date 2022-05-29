package com.udemy.aplication;

import com.udemy.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Product in stock: ");
        product.quantity = sc.nextInt();
        System.out.println("---------------------------");
        System.out.println("Products data: " + product);
        System.out.println("---------------------------");
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Update data: " + product);
        System.out.println("---------------------------");

        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Update data: " + product.name
                + ", $ "
                + String.format("%.2f", product.price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", product.totalValueInStock()));
        System.out.println("---------------------------");

        sc.close();

    }
}
