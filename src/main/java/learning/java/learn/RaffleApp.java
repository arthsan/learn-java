package learning.java.learn;

import java.util.Random;

public class RaffleApp {

    public static void main(String[] args) {

        Random dice = new Random();
        String people[] = {"Arthur" , "Daniela", "Raphael", "Filipe", "Rodrigo", "Karen", "Keila"};
        int raffle = dice.nextInt(people.length);
        String winner = people[raffle];

        System.out.println("Winner is: " + winner);
    }
}
