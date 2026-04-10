package com.practice.basics;
import java.util.Scanner;

public class Calculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one value");
		double x = sc.nextDouble();
		System.out.println("Enter second value");
		double y = sc.nextDouble();
		System.out.println("Select any operator /*-+");
		char op = sc.next().charAt(0);
		switch (op) {
		case '+':
			System.out.println(x+y);
			break;
		case '-':
			System.out.println(x-y);
			break;
		case '*':
			System.out.println(x*y);
			break;
		case '/':
			if(y!=0) {
			System.out.println(x/y);
		} else {
			System.out.println("Error");
			
		}
			break;
			
		default:
			System.out.println("Please select only given operator");
			break;
	}
		sc.close();
	}
}