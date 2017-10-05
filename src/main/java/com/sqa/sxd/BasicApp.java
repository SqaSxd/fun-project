/**
 * File Name: BasicApp.java<br>
 * Deng, Stephanie(Xiaofan)<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 2, 2017
 */
package com.sqa.sxd;

import com.sqa.sxd.helpers.AppBasics;

/**
 * BasicApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Deng, Stephanie(Xiaofan)
 * @version 1.0.0
 * @since 1.0
 */
public class BasicApp {

	private static String appName = "Basic App";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		doSomething();
		AppBasics.fareWellUser(name, appName);
	}

	/**
	 *
	 */
	private static void doSomething() {
		System.out.println("Doing something...");
	}
}
