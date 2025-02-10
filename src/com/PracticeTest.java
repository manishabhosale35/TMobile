package com;

import java.util.Scanner;

public class PracticeTest {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your first number");
			int num1 = sc.nextInt();
			System.out.println("Enter your second number");
			int num2 = sc.nextInt();
			System.out.println("Enter your third number");
			int num3 = sc.nextInt();
			int max = getMaxNumber(num1, num2, num3);
			System.out.println("MaxNumber Number is :" + max);

			
		}

		public static int getMaxNumber(int a, int b, int c) { // for maximum number calculation
			int max = a;
			if (b > max) {
				max = b;
			}
			if (c > max) {
				max = c;
			}
			return max;
		}

	}
