/**
	* Lesson: Nested Ifs
	* Author: Mr. Kalisz
	* Date Created: March 23, 2023
	* Date Last Modified: March 23, 2023
	*/

import java.util.Scanner;

class Note {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int num;
		System.out.print("Input an integer: ");
		num = input.nextInt();

		input.nextLine(); //clear scanner
		String word;
		System.out.print("Input a word: ");
		word = input.nextLine();

		//nested ifs - Putting an if inside of an if

		// if (num > 5) {
		// 	if (num < 8) {
		// 		//num > 5 and num < 8
		// 		System.out.println("Here");
		// 	}
		// }

		// //Use a compound if statement instead of a nested if when they are equivalent
		// if (num > 5 && num < 8) {
		// 	System.out.println("Here");
		// }


		//Option one: Executing code between conditions
		if (num > 5) {
			System.out.println("5"); //runs when its greater than 5, and happens between the two conditions
			if (num < 8) { //runs only when both conditions are true
				//num > 5 and num < 8
				System.out.println("Here");
			}
		}

		//Option 2: Repeated conditions
		//Rather than repeat num > 1, 3+ times

		// Don't do this
		// if (num > 1 && word.endsWith("y")) {
		// 	System.out.println("ies");
		// }
		// else if (num > 1 && word.endsWith("ife")) {
		// 	System.out.println("ives");
		// }
		// else if (num > 1 && word.endsWith("ey")) {
		// 	System.out.println("eys");
		// }
		// else if (num == 1) {
		// 	System.out.println("Not plural");
		// }

		if (word > 1) {
			if (word.endsWith("y")) {
				System.out.println("ies");
			}
			else if (word.endsWith("ife")) {
				System.out.println("ives");
			}
			else if (word.endsWith("ey")) {
				System.out.println("eys");
			}
		}
		else if (num == 1) {
			System.out.println("Not plural");
		}
		
		
		//nested vs compound booleans
		//faster vs slower
	}
}