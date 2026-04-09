package com.practice;

import java.util.Scanner; // Input lene ke liye zaroori hai

public class ScannerExample {
    public static void main(String[] args) {
        // Scanner ka object banayein
        Scanner sc = new Scanner(System.in);

        System.out.println("Aapka naam kya hai?");
        String name = sc.nextLine(); // String input

        System.out.println("Aapki age kya hai?");
        int age = sc.nextInt(); // Integer input

        System.out.println("Namaste " + name + "! Aap " + age + " saal ke hain.");
        
        sc.close(); // Good practice to close scanner
    }
}
