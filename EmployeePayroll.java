public class EmployeePayroll {
  private String firstName;
  private String lastName;
  private double wage;
  private double hours;
  private String iD;

  public EmployeePayroll(String firstName, String lastName, String iD) {
    this.firstName = firstName;
    this.lastName =  lastName;
    if (iD.length() == 15) {
    	this.iD = iD;
    } else {
    	System.out.println("Error! Employee ID must be 15 digits.");
    }
    this.hours = 0;
    this.wage = 0;
    
  }
//Accessor methods
  public String getFirstName() {
	  return this.firstName;
  }
  public String getLastName() {
	  return this.lastName;
  }
  public double getWage() {
	  return this.wage;
  }
  public double getHours() {
	  return this.hours;
  }
  public String getID() {
	  return this.iD;
  }

 //Mutator Methods
  public void setWage(double wage) {
	  if (wage < 0) {
	    	System.out.println("Error! Hourly wage must be greater than $0.0"); 
	  } else {
		  this.wage = wage;
	  }
  }
  
  public void setHours(double hours) {
	  if (hours < 0) {
		  System.out.println("Error! Hour amount must be greater than 0.0");
	  } else {
		  this.hours = hours;  } }
  
  public void incrementHours(double hours) {
	  double hourTester = this.hours + hours; //User can add positive or negative hours, hourTester gets total
	  if (hourTester < 0) {
		  System.out.println("Error! Cannot have a negative amount of hours worked.");
	  } else {
		  this.hours = hourTester; } }
  
  public void resetPayCycle() {
    this.hours = 0;
  }
  
  public String toString() {
	  String s = this.firstName + " " + this.lastName + ", " + this.iD + ", earned $" + this.wage*this.hours + " this week.";
	  return s;
  }
  public boolean equals(EmployeePayroll employ) {
	  boolean test;
	  if (this.getID() == employ.getID()) {
		  test = true;
	  } else {
		  test = false;
	  } return test;
  }
}
