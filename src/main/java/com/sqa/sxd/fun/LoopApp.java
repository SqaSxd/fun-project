package com.sqa.sxd.fun;

import java.util.Scanner;

import com.sqa.sxd.helpers.AppBasics;

public class LoopApp {

	private static String appName = "Fun with Loops";

	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		doForLoopExercise();
		doWhileLoopExerciese();
		evalGradeAverage();
		AppBasics.fareWellUser(name, appName);
	}

	/**
	 * Write a Java program which prints out a count from 1 to 100, than prints
	 * the numbers 200-100, and finally prints 10-1000 with only numbers evenly
	 * divided by 10. Use the for loop to do these and do not use the %
	 * operator.
	 */
	private static void doForLoopExercise() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			if (i < 100)
				System.out.print(",");
		}
		System.out.print("\n");
		for (int i = 200; i >= 100; i--) {
			System.out.print(i);
			if (i > 100)
				System.out.print(",");
		}
		System.out.print("\n");
		System.out.println("Print 1-?:");
		int userNum = AppBasics.requestInt("What number do you want to count to?", 1, 10000);
		for (int i = 1; i <= userNum; i++) {
			System.out.print(i);
			if (i < userNum)
				System.out.print(",");
		}
		System.out.print("\n");
	}

	/**
	 * Write a Java program which prints all even number from 1 to 100, then all
	 * odd numbers between 300-400, and finally prints 30-333 with only numbers
	 * evenly divided by 3 . Use a while loop for this exercise. You will also
	 * want to use an if condition and use the % operator to check if a number %
	 * 2 is equal to 0 and print it if that is the case.
	 */
	private static void doWhileLoopExerciese() {
		int number = 2;
		while (number <= 100) {
			System.out.print(number);
			number += 2;
			if (number < 100)
				System.out.print(",");
		}
		System.out.print("\n");
		number = 301;
		while (number <= 400) {
			System.out.print(number);
			number += 2;
			if (number < 400)
				System.out.print(",");
		}
		System.out.print("\n");
		number = 30;
		while (number <= 333) {
			System.out.print(number);
			number += 3;
			if (number < 333)
				System.out.print(",");
		}
		System.out.print("\n");
	}

	/**
	 * Write a method which prints the grade average for a user based on a user
	 * supplied set of grade values. Repeat execution until user has no more
	 * items to be graded. Use a do while for this exercise. You will also have
	 * to use two variables to hold the current accumulated grade points as well
	 * as the total number of grades entered so that the average will be
	 * totalGradePoints / numTotalGrades. Other things covered in this exercise:
	 * Scanner, Integer.parseInt.
	 */
	private static void evalGradeAverage() {
		int count = 0;
		double totalGrade = 0.0;
		Scanner scanner = new Scanner(System.in);
		boolean more_grade = true;
		String input;
		while (more_grade) {
			totalGrade += AppBasics.requestDouble("Please enter a new grade: ");
			count += 1;
			more_grade = AppBasics.requestBoolean("Do you have more grade? ");
		}
		System.out.println("The average grade is: " + (totalGrade / count));
	}
}
