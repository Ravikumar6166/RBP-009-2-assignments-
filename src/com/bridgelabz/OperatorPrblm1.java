package com.bridgelabz;

import java.util.Scanner;

public class OperatorPrblm1 {

	static void checkMaxAndMin(int a, int b, int c) {

		int result1 = a + b * c;
		int result2 = c + a / b;
		int result3 = a % b + c;
		int result4 = a * b + c;

		System.out.println("Result1 is " + result1);
		System.out.println("Result2 is " + result2);
		System.out.println("Result3 is " + result3);
		System.out.println("Result4 is " + result4);

		int max = 0;
		int min = 0;

		if (result1 > result2 && result1 > result3 && result1 > result4) {
			max = result1;
			System.out.println("Max is " + max);
		} else if (result1 < result2 && result1 < result3 && result1 < result4) {
			min = result1;
			System.out.println("Min is " + min);
		}
		if (result2 > result1 && result2 > result3 && result2 > result4) {
			max = result2;
			System.out.println("Max is " + max);
		} else if (result2 < result1 && result2 < result3 && result2 < result4) {
			min = result2;
			System.out.println("Min is " + min);
		}
		if (result3 > result1 && result3 > result2 && result3 > result4) {
			max = result3;
			System.out.println("Max is " + max);
		} else if (result3 < result1 && result3 < result2 && result3 < result4) {
			min = result3;
			System.out.println("Min is " + min);
		}
		if (result4 > result1 && result4 > result2 && result4 > result3) {
			max = result4;
			System.out.println("Max is " + max);
		} else if (result4 < result1 && result4 < result2 && result4 < result3) {
			min = result4;
			System.out.println("Min is " + min);
		}

	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = scan.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = scan.nextInt();
		System.out.print("Enter 3rd number : ");
		int c =scan.nextInt();
		checkMaxAndMin(a, b, c);

	}
}
