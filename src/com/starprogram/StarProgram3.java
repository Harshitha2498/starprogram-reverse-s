package com.starprogram;

import java.util.Scanner;

/**
 * @Author : Harshitha.D
 * @Created: Apr 5, 2024
 * @File : StarProgram3.java
 * @Description :
 * 
 */
public class StarProgram3 {
	public static void main(String[] args) {
		int value;
		System.out.println("enter a odd number and greater than 3");
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt();
		for (int i = 0; i < value; i++) {
			if (i == 0 || i == value / 2 || i == value - 1) {
				for (int j = 0; j < value - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else if (i <= value / 2) {
				for (int j = 0; j < value - 1; j++) {
					if (j == value - 2) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				System.out.println();
			} else {
				System.out.println("*");
			}
		}
		sc.close();
	}
}
