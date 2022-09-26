package com.ttn.javaAssignment;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String finalAnswer = "";

		while (true) {
			String userInput = scn.nextLine();
			if (userInput.equals("XDONE")) {
				System.out.println(finalAnswer);
				break;
			}
			finalAnswer += userInput + " ";
		}
	}
}
