package com.bridgelabz;

import java.util.Scanner;

public class OperatorPrblm3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = scan.nextInt();
		System.out.println("Enter value of b");
		int b = scan.nextInt();
		System.out.println("Enter value of c");
		int c = scan.nextInt();

		isQuadratic(a, b, c);

	}

	private static void isQuadratic(int a, int b, int c) {
		// TODO Auto-generated method stub
		double delta = Math.sqrt(b * b - (4 * a * c));
		System.out.println((-b + (delta)) / (2 * a));
		System.out.println((-b - (delta)) / (2 * a));
	}

}
