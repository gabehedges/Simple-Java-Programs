
public class TestPump {

	public static void main(String[] args) {
		GasPump pump = new GasPump();
		pump.setTankCap(150);
		pump.addToReserves(125);
		pump.setPrice(2.25);
		
		//Overadd fuel
		double amountAdded = pump.addToReserves(65);
		System.out.println("There are " + amountAdded + " gallons added to the fuel reserve");
		
		//Overdraw fuel
		double amountPumped = pump.dispense(155);
		System.out.println(amountPumped + " gallons were dispensed." + "\n");
		
		//Add valid amount of fuel
		System.out.println(pump.addToReserves(25) + " and " + pump.addToReserves(35.6) + " gallons of fuel were added to the reserve. The current fuel in tank is " + pump.fuelLevel() + "\n");
		
		//Dispense valid amount of fuel
		double amountDispensed = pump.dispense(20);
		double cost = amountDispensed*pump.getPrice();
		System.out.println(amountDispensed + " gallons were dispensed at a cost of $" + cost + ". The current fuel in tank is " + pump.fuelLevel() + " gallons.");
		
	}

}
