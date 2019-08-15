package learning.java.learn;

import java.util.Random;

public class GameEvenOdd {

    public static void main(String[] args) {

        Random rdn = new Random();
        int p1 = rdn.nextInt(9);
        int p2 = rdn.nextInt(9);

        System.out.println("Player 1: " + p1);
        System.out.println("Player 2: " + p2);

        int play = p1 + p2;

        if (play % 2 == 0) {
            System.out.println("Player 1 - EVEN won");
        } else {
            System.out.println("Player 2 - ODD won");
        }

    }
}
