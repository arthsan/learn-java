package learning.java.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

	}

}
