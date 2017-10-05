/**
 * File Name: FlowControlApp.java<br>
 * Deng, Stephanie(Xiaofan)<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 2, 2017
 */
package com.sqa.sxd;

import java.util.Scanner;

import com.sqa.sxd.helpers.AppBasics;

/**
 * FlowControlApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Deng, Stephanie(Xiaofan)
 * @version 1.0.0
 * @since 1.0
 */
public class FlowControlApp {

	private static String appName = "Flow Control App";

	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		evalNumberAgainst10();
		determineMonthBasedOnInt();
		evalGrade();
		AppBasics.fareWellUser(name, appName);
	}

	/**
	 *
	 */
	private static void determineMonthBasedOnInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter month in value(1-12): ");
		String input = scanner.nextLine();
		int number = Integer.parseInt(input);
		String month;
		switch (number) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "Febuary";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		default:
			month = "Wrong Input";
			break;
		}
		System.out.println("The month you entered is: " + month);
	}

	/**
	 * Write a program that can ask the user for a grade value and print the
	 * associated grade letter. 7-10 -->> A 4-6 -->> B 0-3 -->> C others -->> D
	 */
	/*
	 * private static void evalGrade() { Scanner scanner = new
	 * Scanner(System.in);
	 * System.out.print("Please enter hom many grades you want to evaluate: ");
	 * String input = scanner.nextLine(); int totalCount =
	 * Integer.parseInt(input); double totalGrade = 0.0; for (int i = 0; i <
	 * totalCount; i++) { System.out.print("Please enter a grade: "); totalGrade
	 * += Integer.parseInt(scanner.nextLine()); }
	 * System.out.println("The average grade is: " + (totalGrade / totalCount));
	 * }
	 */
	private static void evalGrade() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a grade value(0-10): ");
		String input = scanner.nextLine();
		int number = Integer.parseInt(input);
		switch (number) {
		case 0:
		case 1:
		case 2:
		case 3:
			System.out.println("Grade C");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Grade B");
			break;
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("Grade A");
			break;
		default:
			System.out.println("Grade D");
			break;
		}
	}

	/**
	 * Write a function which takes an int parameter and print the message on
	 * screen that "number is greater than 10" otherwise it should print "number
	 * is smaller than 10" (Can you support if the parameter is equal to 10?)
	 */
	private static void evalNumberAgainst10() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number to evaluate against 10: ");
		String input = scanner.nextLine();
		int number = Integer.parseInt(input);
		if (number > 10) {
			System.out.println("number is greater than 10");
		} else if (number < 10) {
			System.out.println("number is smaller than 10");
		} else {
			System.out.println("it's 10");
		}
	}
}
