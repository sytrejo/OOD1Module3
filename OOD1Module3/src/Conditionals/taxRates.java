package Conditionals;

public class taxRates {

	public static void main(String[] args) {
		int salary = 75000;
		
		if(salary > 150000) {
			System.out.println("45%");
			
		} else if (salary > 50000) {
			System.out.println("40%");
			
		} else if (salary > 12500) {
			System.out.println("20%");
			
		} else {
			System.out.println("0%");
		}

	}

}
