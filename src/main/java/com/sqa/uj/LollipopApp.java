/**
 * File Name: LollipopApp.java<br>
 * Kaur, UJ<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 7, 2017
 */
package com.sqa.uj;

import com.sqa.uj.helpers.*;

/**
 * LollipopApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Kaur, UJ
 * @version 1.0.0
 * @since 1.0
 */
public class LollipopApp {

	static String appName = "Lollipops";

	static double totalLollipops;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String user = AppBasics.welcomeUserAndGetName(appName);
		countNumOfLollipops();
		AppBasics.farewellUser(appName, user);
	}

	/**
	 *
	 */
	private static void countNumOfLollipops() {
		totalLollipops = AppBasics.requestDouble("How many lollipops do you have to start?");
		totalLollipops = totalLollipops - AppBasics.requestDouble("How many lollipops rotten?");
		totalLollipops += AppBasics.requestDouble("How many lollipops did Krusty the Clown give you?");
		totalLollipops /= AppBasics.requestDouble("How many children have to share the lollipops?");
		System.out.println("It seems each child will have " + totalLollipops + " lollipop(s) each!");
	}
}
