package com.practice.basics;
import java.util.Scanner;
public class CheckOddEven{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		if(x%2==0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}	
	}
	
}
