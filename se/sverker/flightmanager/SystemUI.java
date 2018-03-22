package se.sverker.flightmanager;

import java.util.Scanner;

public class SystemUI {

	// Start the applications UI
	public void start() {

		// Loop-condition
		boolean isRunning = true;
		
		// Try-with-resources to auto-close scanner on error or exit
		try(Scanner scanner = new Scanner(System.in)) {

			// Run at least once.
			do {

				// Inner loop error handling
				try {
					System.out.println("Welcome! \nPlease select ticket type : ");
					System.out.println("Economy : [1]    Business : [2]");
					String keyboard = scanner.next();

					switch (keyboard) {

						case "0":
							System.out.println("Exiting program...");
							isRunning = false;
							break;
							
						case "1":
							System.out.println("Economy ticked selected. \nAssigning seat...");
							isRunning = false;
							break;
							
						case "2":
							System.out.println("Business ticked selected. \nAssigning seat...");
							isRunning = false;
							break;
							
						default:
							System.out.println(keyboard + " is not a valid option. Please try again.");

					}

					// Catch any and all program-specific exceptions here to de-clutter your switch-case
					// in case of checked and/or custom exceptions.

				} catch (Exception e) {
					System.out.println("Exception caught in inner try : " + e.getMessage());

				}

			} while (isRunning);

		} catch (Exception e) {
			System.out.println("Exception caught in outer try : " + e.getMessage());

		} finally {

			// Any tasks needed for cleaning up/saving/etc should be performed here.
			// The scanner auto-closes so don't worry about that.

		}

	}

}
