package com.ttn.javaAssignment;

import java.util.Scanner;

public class UserMenu {

	static double pi = 22/7d;
	static {
		System.out.println("1: Calculate Area of Circle");
		System.out.println("2: Calculate Circumference of a Circle");
		System.out.println("3: Exit");
	}

	public static void calculateArea(double radius) {
		double area = pi * radius * radius;
		System.out.println(area);
	}

	private static double userInputedRadius() {
		System.out.println("Enter Radius of Circle");
		Scanner scn = new Scanner(System.in);
		return scn.nextDouble();
	}

	public static void calculateCircumference(double radius) {
		double circumference = 2 * pi * radius;
		System.out.println(circumference);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int userInput = scn.nextInt();

		switch (userInput) {
		case 1:
			double radius = userInputedRadius();
			UserMenu.calculateArea(radius);
			break;
		case 2:
			radius = userInputedRadius();
			UserMenu.calculateCircumference(radius);
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Enter Valid Input");

		}
	}
}









