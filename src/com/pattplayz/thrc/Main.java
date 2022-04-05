package com.pattplayz.thrc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the following information:");

        System.out.println("Please enter your first name:");
        String firstName = input.next();

        System.out.println("Please enter your last name:");
        String lastName = input.next();

        System.out.println("Please enter your year of birth (yyyy):");
        int dobYear = input.nextInt();

        System.out.println("Please enter your month of birth (mm):");
        int dobMonth = input.nextInt();

        System.out.println("Please enter your day of birth (dd):");
        int dobDay = input.nextInt();

        System.out.println("Calculating target heart rate.....");

        HeartRates user = new HeartRates(firstName, lastName, dobMonth, dobDay, dobYear);
        System.out.println("Your recommended target heart rate is " + user.calculateTargetHR() + " bpm.");
    }
}
