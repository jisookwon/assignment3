package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner keyboard = new Scanner(System.in);

	    System.out.print("Enter your name : ");
	    String firstInitial = keyboard.next();
        String lastName = keyboard.nextLine();

        System.out.print("Enter your address : ");
        int houseNumber = keyboard.nextInt();
        String streetName = keyboard.nextLine();

        System.out.print("Enter your City : ");
        String city = keyboard.next();

        System.out.print(firstInitial + " " + lastName + " " +houseNumber + " ");
        System.out.println(streetName + " " + city); // write your code here
    }

}
