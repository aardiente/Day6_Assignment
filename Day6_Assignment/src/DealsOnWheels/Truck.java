package DealsOnWheels;

public class Truck extends Vehicle {

	public Truck() {
		// TODO Auto-generated constructor stub
		super();
		this.objType = vType.Truck;
	}

	public Truck(String color, int numOfWheels, String model) {
		super(color, numOfWheels, model);
		// TODO Auto-generated constructor stub
		this.objType = vType.Truck;
	}

	
	public void truckThings()
	{
		System.out.println("I do truck things.");
	}
	
	@Override
	public String toString()
	{
		return "Truck " + super.toString();
	}
}
