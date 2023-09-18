/*
 * Lab3_Task2_Francine_Vo.java
 * Francine Vo
 * 01253035
 * 09/16/2023
 */
import java.util.Scanner;

public class Lab3_Task2_Francine_Vo {

	public static void main(String[] args) {
		// Declare variables: hours, fee
		double hours, fee;

		// Prompt user for hours parked
		System.out.print("How many hours were you parked for? ");

		// Read in hours parked
		Scanner input = new Scanner(System.in);
		hours = input.nextDouble();
		input.close();

		// Handle Invalid Inputs
		if (hours <= 0) {
			System.out.println("Did you even park here?");
		} 
		else if (hours > 24) {
			System.out.println("You've been towed.");
			System.out.println("Next time use the long-term parking garage.");
		}
		// Calculate bill amount with given calculation logic
		else {
			if (hours <= 3) {
				fee = 5.0;
			} else if (hours <= 9) {
				fee = 6 * Math.floor(hours + 1);
			} else {
				fee = 60.0;
			}
			System.out.printf("Please pay $%.2f", fee);
		}
	}
}