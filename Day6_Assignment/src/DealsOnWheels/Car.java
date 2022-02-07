package DealsOnWheels;

public class Car extends Vehicle {

	public Car() {
		// TODO Auto-generated constructor stub
		super();
		this.objType = vType.Car;
	}

	public Car(String color, int numOfWheels, String model) 
	{
		super(color, numOfWheels, model);
		// TODO Auto-generated constructor stub
		this.objType = vType.Car; // I should have a constructor for this but I'm being lazy
	}

	public void carThings()
	{
		System.out.println("I do car things.");
	}
	
	@Override
	public String toString()
	{
		return "Car " + super.toString();
	}
}
