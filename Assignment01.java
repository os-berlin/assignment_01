package com.coderscampus.assignment01;

import java.util.Random;
import java.util.Scanner;

public class Assignment01 {

    public static void main (String[] args) {

        Random random = new Random();
        int target = random.nextInt(100) + 1;

        Scanner scanner = new Scanner (System.in);
        int userInput = 0;
        int attempts = 1;
        boolean lose = true;
        
        while (userInput != target && attempts <= 5) {
            System.out.print("Pick a number between 1 and 100: ");
            userInput = scanner.nextInt();

            if (userInput < 1 || userInput > 100) {
                System.out.println("Your guess is not between 1 and 100, please try again");
            } else if (userInput > target) {
                System.out.println("Please pick a lower number");
                attempts++;
            } else if (userInput < target) {
                System.out.println("Please pick a higher number");
                attempts++;
            } else if (userInput == target) {
                System.out.println("You win!");
                lose = false;
            }
        }

        if (lose) {
            System.out.println("You lose!");
            System.out.println("The number to guess was: " + target);
        }
    }
}
