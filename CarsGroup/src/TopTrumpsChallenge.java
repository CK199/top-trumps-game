import java.util.Scanner;

public class TopTrumpsChallenge {
	
	public static void main(String[]args) {
		Cars car1 = null;
		Cars car2 = null;
		
		Audi A3 = new Audi("Audi", "A3", 2f, 130, 140, 6.6f, 24375);
		Audi A4 = new Audi("Audi", "A4", 3f, 141, 150, 5.2f, 29505);
		BMW Series7 = new BMW("BMW", "7 Series", 3f, 255, 390, 5.7f, 69510); 
		BMW Series8 = new BMW("BMW", "8 Series", 3f, 155, 460, 3.8f, 69225);
		Mercedes EClass = new Mercedes("Mercedes", "E Class", 3f, 156, 385, 5.6f, 69999);
		Mercedes SClass = new Mercedes("Mercedes", "S Class", 3f, 159, 399, 3.9f, 71000);
		
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("User 1, please enter your name: ");
		String user1 = keyboardInput.nextLine();
		System.out.println(user1 + ", please choose your car: ");
		String user1Car = keyboardInput.nextLine();
		System.out.println("You selected " + user1Car + "!");
		
		System.out.println("User 2, please enter your name: ");
		String user2 = keyboardInput.nextLine();
		System.out.println(user2 + ", please choose your car: ");
		String user2Car = keyboardInput.nextLine();
		System.out.println("You selected " + user2Car + "!");
		
		System.out.println("Choose a category: ");
		String category = keyboardInput.nextLine();
		System.out.println("You selected " + category + "!");
		
		if (user1Car.equals("A3")) {
			car1 = A3;
		} else if (user1Car.equals("A4")) {
			car1 = A4;
		} else if (user1Car.equals("Series7")) {
			car1 = Series7 ;
		} else if (user1Car.equals("Series8")) {
			car1 = Series8;
		} else if (user1Car.equals("EClass")) {
			car1 = EClass;
		} else if (user1Car.equals("SClass")) {
			car1 = SClass;
		} else {
			System.out.println("Error");
		}
		
		if (user2Car.equals("A3")) {
			car2 = A3;
		} else if (user2Car.equals("A4")) {
			car2 = A4;
		} else if (user2Car.equals("Series7")) {
			car2 = Series7;
		} else if (user2Car.equals("Series8")) {
			car2 = Series8;
		} else if (user2Car.equals("EClass")) {
			car2 = EClass;
		} else if (user2Car.equals("SClass")) {
			car2 = SClass;
		} else {
			System.out.println("Error");
		}
		
		if (category.equals("acceleration")) {
			A3.acceleration(car1, car2);
		} else if (category.equals("top speed")) {
			A3.topSpeed(car1, car2);
		} else if (category.equals("engine size")) {
			A3.engineSize(car1, car2);
		} else if (category.equals("price")) {
			A3.price(car1, car2);
		} else if (category.equals("horsepower")) {
			A3.horsePower(car1, car2);
		} else {
			System.out.println("Error");
		}
	}

}