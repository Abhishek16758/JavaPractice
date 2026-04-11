package com.practice.basics;
import java.util.*;
public class MonthChallenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("Is month mein 31 days hote hain");
			break;
		case 2:
			System.out.println("February mein 28 ya 29 days hote hain.");
			break;
		case 4: case 6: case 9: case 11:
            System.out.println("Is month mein 30 days hote hain.");
            break;
		default:
            System.out.println("Invalid month! Kripya 1 se 12 ke beech hi dalein.");
    
		}
		sc.close();
		
	}
}
