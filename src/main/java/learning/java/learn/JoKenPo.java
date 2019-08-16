package learning.java.learn;

import java.util.Random;

public class JoKenPo {

    public static void main(String[] args) {

        // rock = 0
        // scissor = 1
        // paper = 2

        Random dice = new Random();
        int p1 = dice.nextInt(3);
        int p2 = dice.nextInt(3);

        // Player 1
        if (p1 == 0) {
            System.out.println("Player 1 = " + "Rock");
        } else if (p1 == 1) {
            System.out.println("Player 1 = " + "Scissor");
        } else {
            System.out.println("Player 1 = " + "Paper");
        }

        // Player 2
        if (p2 == 0) {
            System.out.println("Player 2 = " + "Rock");
        } else if (p2 == 1) {
            System.out.println("Player 2 = " + "Scissor");
        } else {
            System.out.println("Player 2 = " + "Paper");
        }

        // Play
        if (p1 == p2) {
            System.out.println("Draw");
        } else if ((p1 == 0 && p2 == 1) || (p1 == 1 && p2 == 2) || (p1 == 2 && p2 == 0)) {
            System.out.println("Player 1 won!");
        } else {
            System.out.println("Player 2 won!");
        }
    }

}
