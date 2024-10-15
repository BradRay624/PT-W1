package Week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		int availablePlaneSeats = 23;
		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		

		
		// 2. Create a variable to hold the cost of groceries at checkout
		double groceriesCost = 69.52;
		
		// 3. Create a variable to hold a person's middle initial
		char middleInital = 'S';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHotOutside = false;
		
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Brad";
		
		// 6. Create a variable to hold a street address
		String streetAddress = "509 Reagan Road";

		// 7. Print all variables to the console
		System.out.println("Available seats left on the plane: " + availablePlaneSeats);
		System.out.println("your total comes to " + groceriesCost);
		System.out.println("My middle inital is " + middleInital);
		System.out.println(isHotOutside);
		System.out.println(customerFirstName);
		System.out.println(streetAddress);
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		availablePlaneSeats = 23 - 2;
		System.out.println(availablePlaneSeats);
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		//groceriesCost = groceriesCost + 2.15;
		groceriesCost += 2.15;
		System.out.println(groceriesCost);
		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		// why doesn't this one  work? middleInital -= 'S' + 'R';
		middleInital = 'R';
		System.out.println(middleInital);
		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		// why doesn't this work? isHotOutside = "true";
		//isHotOutside = true;
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside);
		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String customersFullName = customerFirstName + " " + middleInital + " Ray";
		System.out.println(customersFullName);
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		//String customerIntroduction = "Hello everyone, this is Brad R Ray and he currently lives at " + streetAddress;
		String customerIntroduction = "Hello everyone, this is " + customersFullName + " and he currently lives at " + streetAddress;
		System.out.println(customerIntroduction);
	}
}