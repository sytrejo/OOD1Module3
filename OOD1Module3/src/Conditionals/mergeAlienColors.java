package Conditionals;

public class mergeAlienColors {

	public static void main(String[] args) {
		
		String alienColor = "green";
		
		if (alienColor.equals("green")) {
			System.out.println("you've just earned 5 points");
		}
		
		else if (alienColor.equals("red")) {
			System.out.println("you've just earned 10 poits");
		}
		
		else if (alienColor.equals("yellow")) {
			System.out.println("you've just earned 15 points");
		} 
		
		else {
			System.out.println("invalid color");
		}
		

	}

}
