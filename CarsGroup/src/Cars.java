public class Cars {

	String make;
	String model;
	float engineSize;
	int topSpeed;
	int horsePower;
	float acceleration;
	int price;

	public Cars(String Make, String Model, float EngineSize, int TopSpeed, int HorsePower, float Acceleration, int Price) {
		make = Make;
		model = Model;
		engineSize = EngineSize;
		horsePower = HorsePower;
		acceleration = Acceleration;
		price = Price;
		topSpeed = TopSpeed;
	}
	
	public int gethorsePower() {
		return horsePower;
	}

	public String getModel() {
		return model;
	}
	
	public float getEngineSize() {
		return engineSize;
	}
	
	public int getTopSpeed() {
		return topSpeed;
	}
	
	public int getHorsePower() {
		return horsePower;
	}
	
	public float getAcceleration() {
		return acceleration;
	}
	
	public int getPrice() {
		return price;
	}
	
	void engineSize(Cars car1, Cars car2) {
		if (car1.getEngineSize() > car2.getEngineSize()) {
			System.out.println(car1.getModel());
		} else {
			System.out.println(car2.getModel());
		}
	}
	
	void horsePower(Cars car1, Cars car2) {
		if (car1.gethorsePower() > car2.gethorsePower()) {
		System.out.println(car1.getModel());
		} else {
		System.out.println(car2.getModel());
		}
	}
	
	void acceleration(Cars car1, Cars car2) {
		if (car1.getAcceleration() > car2.getAcceleration()) {
		System.out.println(car1.getModel());
		} else {
		System.out.println(car2.getModel());
		}
	}
	
	void price(Cars car1, Cars car2) {
		if (car1.getPrice() > car2.getPrice()) {
		System.out.println(car1.getModel());
		} else {
		System.out.println(car2.getModel());
		}
	}
	
	void topSpeed(Cars car1, Cars car2) {
		if (car1.getTopSpeed() > car2.getTopSpeed()) {
		System.out.println(car1.getModel());
		} else {
		System.out.println(car2.getModel());
		}
	}
}

class Audi extends Cars {

	public Audi(String Make, String Model, float EngineSize, int TopSpeed, int HorsePower, float Acceleration, int Price) {
		super(Make, Model, EngineSize, TopSpeed, HorsePower, Acceleration, Price);
	}

	void tuneEngine() {
		horsePower =+ 10;
		acceleration += 3;
	}
}

class BMW extends Cars {

	public BMW(String Make, String Model, float EngineSize, int TopSpeed, int HorsePower, float Acceleration, int Price) {
		super(Make, Model, EngineSize, TopSpeed, HorsePower, Acceleration, Price);
	}

	void tuneEngine() {
		horsePower =+ 10;
		acceleration += 3;
	}
}

class Mercedes extends Cars {

	public Mercedes(String Make, String Model, float EngineSize, int TopSpeed, int HorsePower, float Acceleration, int Price) {
		super(Make, Model, EngineSize, TopSpeed, HorsePower, Acceleration, Price);
	}

	void tuneEngine() {
		horsePower =+ 10;
		acceleration += 3;
	}
}
