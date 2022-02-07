package DealsOnWheels;

public class Vehicle 
{
	// Instance Variables
	private String color;
	private int numOfWheels;
	private String model;
	public vType objType;
	
	public enum vType
	{
		Car, Truck, Bus, Vehicle
	};
	
	// Constructors
	public Vehicle()
	{
		this.color = "N/A";
		this.numOfWheels = 2;
		this.model = "Could be a bike, maybe not...";
		this.objType = vType.Vehicle;
	}
	
	public Vehicle(String model, int numOfWheels, String color) 
	{
		this.color = color;
		this.numOfWheels = numOfWheels;
		this.model = model;
	}
	
	// Getters / Setters

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public int getNumOfWheels() 
	{
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) 
	{
		this.numOfWheels = numOfWheels;
	}

	public String getModel() 
	{
		return model;
	}

	public void setModel(String model) 
	{
		this.model = model;
	}
	
	// Methods
	public void displayVehicleInfo()
	{
		System.out.println(this.toString());
	}

	
	
	@Override
	public String toString()
	{
		return "Model: " + this.model + " has " + this.getNumOfWheels() + " wheels and is the color " + this.color;
	}
}
