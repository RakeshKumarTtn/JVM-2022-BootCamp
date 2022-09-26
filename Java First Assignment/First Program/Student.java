package com.ttn.javaAssignment;

public class Student {
	private static String firstName = "Rakesh";
	private static String lastName = "Kumar";
	private static int age = 26;

	static {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
	}

	public static void showDetails() {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
	}

	public static void main(String[] args) {
		Student.showDetails();
		System.out.println(Student.firstName);
		System.out.println(Student.lastName);
		System.out.println(Student.age);
	}
}




