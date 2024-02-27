package com.codesoft;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int minNum = 1;
		int maxNum = 100;
		int maxAttempts = 5;
		int score = 0;

		while (true) {
			int guessNumber = random.nextInt(maxNum) + minNum;
			System.out.println("Guess the number between " + minNum + " and " + maxNum + ":");

			for (int attempts = 0; attempts < maxAttempts; attempts++) {
				int guess = scanner.nextInt();

				if (guess == guessNumber) {
					System.out.println("Congratulations! You guessed the correct number.");
					score++;
					break;
				} else if (guess < guessNumber) {
					System.out.println("Too low! Try again.");
				} else {
					System.out.println("Too high! Try again.");
				}
			}

			System.out.println("The correct number is: " + guessNumber);
			System.out.println("Your score: " + score);

			System.out.println("Do you want to play again? (yes/no):");
			String playAgain = scanner.next();
			if (!playAgain.equalsIgnoreCase("yes")) {
				break;
			}
		}

		scanner.close();
	}
}
