package learning.java.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {

		boolean myBool = true;
		int myAge = 28;
		float height = 1.8f;
		double weight = 79.82;
		char myLetter = 'a';
		String myName = "Arthur";

		System.out.print("\\Hello/ \"World\" \n");
		System.out.println(myName.toUpperCase() + " Age: " + myAge);
		System.out.println("Characters: " + myName.length());
		System.out.println(myName.replace("r", "k"));
		System.out.println(myName.equals("Arthur"));

		String theNum = "20";
		int theNumh = Integer.parseInt(theNum);

		System.out.println("Newtons: " + (int)Math.ceil(theNumh*weight) + "N");

		Random person = new Random();
		int age = person.nextInt(6);
		System.out.println(age);

		System.out.println("My age?: " + (myAge == 10));
		System.out.println("My age?: " + (myAge == 28));

		if (4 == age || myLetter == 's') {
			System.out.println("Seu dado caiu no 5!");
		} else if (5 == age){
			System.out.println("Caiu no 6! Parabéns!");
		}
		else {
			System.out.println("Você perdeu!");
		}

		switch (myName) {
			case "Tomás": System.out.println("1"); break;
			case "Arthur": System.out.println("2"); break;
			default: System.out.println("Write a name");
		}

		int[] nums;
		nums = new int[5];
		nums[0] = 8;
		System.out.println(nums.length);

		String[][] cities = {
				{"São Paulo", "Recife", "Rio"},
				{"Miami", "New York", "Orlando"}
		};

		int counter = 0;

		for (int i = 0; i < cities.length; i += 1) {
			for (int j = 0; j < cities[i].length; j += 1) {
				counter += 1;
				if (cities[i][j] == "New York") {
					System.out.println("Here there is: " + counter);
					break;
				}
			}
		}

		System.out.println(Arrays.toString(cities[0]));

		for (int i = 0; i < myName.length(); i += 1) {
			if (i == 3) {
				char x = myName.charAt(i);
				String msg = Character.toString(x);
				String Msg = msg.toUpperCase();
				String newName = myName.replace(msg, Msg);
				System.out.println(newName);
			}
		}

		ArrayList<String> countries = new ArrayList<String>();

		countries.add("Brazil");
		countries.add("USA");
		countries.add("Italy");
		countries.add(1, "Equator");

		System.out.println(countries.get(0));
		countries.remove(0);
		System.out.println(countries);

	}

}
