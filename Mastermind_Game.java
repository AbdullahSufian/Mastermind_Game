/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Abdula Sofian
 */
public class Mastermind_Game {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

       System.out.println("Choose the numbers that make the set of numbers whole (consisting of four digits)");
        System.out.println("Be careful, you have ten attempts!!!");
        Code code = new Code();
        Random random = new Random();
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int randomInt = random.nextInt(8);
            randomString.append(String.valueOf(randomInt));
        }
        String goal = randomString.toString();


        boolean stats  = false;

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter your try");
            code.setAttempt(input.next());

            for (int j = 0; j < 4; j++) {
                if (code.getAttempt().charAt(j) == goal.charAt(j)) {
                    System.out.println(goal.charAt(j) + " is found in the correct place");
                } else {
                    for (int k = 0; k < 4; k++) {
                        if (code.getAttempt().charAt(k) == goal.charAt(j)) {
                            System.out.println(goal.charAt(j) + " is found but not in the correct place");
                            break;
                        }
                    }
                }
            }

            if (code.getAttempt().equals(goal)) {
                stats = true;
            }

            if (stats) {
                System.out.println("Congratulations! You guessed the code.");
                break;
            } else {
                System.out.println("Sorry, you didn't guess the code.");
            }
            if(i==9 && stats==false)
                System.out.println(goal);

        }
    }

}




