package com.company;

import java.util.Scanner;

public class FriendsAndFamily {

    public static void main(String[] args) {

        // FirstPart();
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("\nEnter list price: ");
            double listPrice = input.nextDouble();

            System.out.print("Enter discount %: ");
            double disc = input.nextDouble();

            System.out.println("Final price is " + listPrice * (1 - disc / 100));
        } while (true);
    }

    public static void FirstPart(){

        System.out.println("Alex");
        System.out.println("Groove str. 22");
        System.out.println("Kvartira 36");
        System.out.println("Russia");
    }
}
