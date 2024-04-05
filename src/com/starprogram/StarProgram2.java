package com.starprogram;

/**
 * @Author : Harshitha.D
 * @Created: Apr 5, 2024
 * @File : StarProgram2.java
 * @Description : ****** * * ****** * * ******
 */
public class StarProgram2 {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < 6; i++) {
				if (i == 5) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();

		}
		for (int i = 0; i < 6; i++) {
			System.out.print("*");
		}
		System.out.println();

		for (int j = 0; j < 2; j++) {
			System.out.println("*");

		}
		for (int i = 0; i < 6; i++) {
			System.out.print("*");
		}
	}
}
