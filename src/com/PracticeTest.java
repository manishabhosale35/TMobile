package com;

import java.util.Scanner;

public class PracticeTest {

		public static void main(String[] args) {


			Scanner sc = new Scanner(System.in);

			System.out.println("Enter a number");
			int num = sc.nextInt();

			// by using if else
			if (num % 2 == 0) {
				System.out.println("Num is Even number");
			} else {
				System.out.println("Num is odd Number");
			}
			System.out.println("===============================================================");
			// by using Ternary Operator

			String EvenOdd = (num % 2 == 0) ? "even" : "odd";
			System.out.println(" num is " + EvenOdd + " Number");
			
			
		}

	}
