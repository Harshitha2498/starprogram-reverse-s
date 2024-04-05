package com.starprogram;

/**
 * @Author : Harshitha.D
 * @Created: Apr 5, 2024
 * @File : StarProgram.java
 * @Description : 
//  ******
//       *
//       *
//  ******
//  *
//  *
//  ******
 */
public class StarProgram {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			if (i == 0 || i == 3 || i == 6) {
				for (int j = 0; j < 6; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else if (i == 1 || i == 2) {
				for (int j = 0; j < 6; j++) {
					if (j == 5) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				System.out.println();
			} else if (i == 4 || i == 5) {
				System.out.println("*");
			}
		}
	}
}
