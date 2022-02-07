package DealsOnWheels;

public class Bus extends Vehicle {

	public Bus() {
		// TODO Auto-generated constructor stub
		super();
		this.objType = vType.Bus;
	}

	public Bus(String color, int numOfWheels, String model) {
		super(color, numOfWheels, model);
		this.objType = vType.Bus;
	}

	public void busThings()
	{
		System.out.println("I do bus things.");
	}
	
	@Override
	public String toString()
	{
		return "Bus " + super.toString();
	}
}
