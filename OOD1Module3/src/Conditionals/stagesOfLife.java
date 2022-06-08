package Conditionals;

public class stagesOfLife {

	public static void main(String[] args) {
		int age = 35;
		
		if(age < 2) {
			System.out.println("you're a baby");
		} else if (age < 4) {
			System.out.println("You are a toddler");
		} else if(age < 13) {
			System.out.println("You are a child");
		} else if (age < 20) {
			System.out.println("YOu are a teenager");
		} else if (age < 65) {
			System.out.println("You are a working age adult");
		} else {
			System.out.println("You are a pensioner");
		}
	}

}
