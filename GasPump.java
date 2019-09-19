public class GasPump {
	private double tankCapacity;
	private double fuelInTank;
	private double costPerGal;
	

  public GasPump() {
    tankCapacity = 0;
    fuelInTank = 0;
    costPerGal = 0;
  }

  // write accessor and mutator for the current price per gallon
  public double getPrice() {
	  return this.costPerGal;
  }
  public void setPrice(double price) {
	  this.costPerGal = price;
  }

  // write an accessor for the current amount in the fuel reserve
  public double fuelLevel() {
	  return this.fuelInTank;
  }


  // write accessor and mutator for the maximum capacity of the pump
  public double tankCap() {
	  return this.tankCapacity;
  }
  public void setTankCap(double capacity) {
	  this.tankCapacity = capacity;
  }

  public double dispense(double amtToDispense) {
    // Fill in the method.  The amtToDispense parameter is the amount
    // that we want to have dispensed.  It should return the actual amount
    // dispensed.
	  if (amtToDispense > this.fuelInTank) {
		  System.out.println("Error! Not enough fuel in tank to dispense this amount.");
		  double amountLeftOver = amtToDispense - this.fuelInTank;
		  double actualDispensed = amtToDispense - amountLeftOver;
		  this.fuelInTank = 0;
		  return actualDispensed;
	  }
	  else {
		  fuelInTank -= amtToDispense;
		  return amtToDispense;
	  } 
  }

  public double addToReserves(double amtToAdd) {
    // Fill in the method.  The amtToAdd parameter is the amount that
    // we want to add to the pump's tank.  It should return the actual amount
    // that was added to the tank.
	  if ((amtToAdd + this.fuelInTank) > this.tankCapacity ) {
		  System.out.println("Error! Cannot add fuel past the tank's capacity. ");
		  double amountExtra = this.fuelInTank + amtToAdd - this.tankCapacity; //Gets amount that will fill tank to max capacity
		  double amountAdded = amtToAdd - amountExtra;
		  fuelInTank += amountAdded; //Fills up tank
		  return amountAdded;
	  } else {
		  fuelInTank += amtToAdd;
		  return amtToAdd;
	  }
  }
}