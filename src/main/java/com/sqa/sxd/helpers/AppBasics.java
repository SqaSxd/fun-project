/**
 * File Name: AppBasics.java<br>
 * Deng, Stephanie(Xiaofan)<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 2, 2017
 */
package com.sqa.sxd.helpers;

import java.util.Scanner;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Deng, Stephanie(Xiaofan)
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Helper method which farewells the user at the end of an application to
	 * say Thank you and widh them well.
	 *
	 * @param name
	 *            Name of user
	 * @param appName
	 *            Name of the Application
	 */
	public static void fareWellUser(String name, String appName) {
		System.out.println("Thank you " + name + ", for using the " + appName + " Application. Have a great Day!");
	}

	/**
	 * Helper method which greets the user and welcome them to the Application.
	 * This method then takes their name and return it to the calling method.
	 *
	 * @param appName
	 *            Name of the Application
	 * @return name Name of the user
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Welcome to my " + appName + " Application");
		System.out.print("Could I get your name please? ");
		return scanner.nextLine();
	}
}
