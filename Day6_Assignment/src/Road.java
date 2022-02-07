import DealsOnWheels.*;

public class Road
{

	public static void main(String[] args) 
	{
		Vehicle[] vList = { new Vehicle(), new Car("Tesla", 4, "Red"), new Truck("Ford", 4, "Black"), new Bus("Yutong", 8, "Yellow") };

		for(Vehicle obj : vList)
		{
			obj.displayVehicleInfo();
			
			switch(obj.objType)
			{
				case Car:
					Car c = (Car)obj;
					c.carThings();
					break;
				case Truck:
					Truck t = (Truck)obj;
					t.truckThings();
					break;
				case Bus:
					Bus b = (Bus)obj;
					b.busThings();
					break;
				case Vehicle:
					System.out.println("Yeah I can do anything.");
					break;
				default:
					System.out.println("You screwed up, I should never reach this point. You prob need to set objType in your constructor");
			}
			
			System.out.println();
		}
		
	}

}
