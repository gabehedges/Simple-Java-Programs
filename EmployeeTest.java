
public class EmployeeTest {

	public static void main(String[] args) {
		EmployeePayroll billie = new EmployeePayroll("BillieJoe","Armstrong", "123451234512345");
		EmployeePayroll frank = new EmployeePayroll("Frank","Sinatra", "456784567845678");
		EmployeePayroll dean = new EmployeePayroll("Dean","Martin", "111112222"); //Invalid ID (too short)
		EmployeePayroll sammy = new EmployeePayroll("Sammy","Davis", "123451234512345");
		EmployeePayroll buddy = new EmployeePayroll("Buddy","Holly", "614614614614614614614614"); //Invalid ID (too long)
		boolean billieAndFrank = billie.equals(frank);
		boolean billieAndSammy = billie.equals(sammy);
		
		//Testing equals method
		System.out.println("Billie equals Frank: " + billieAndFrank);
		System.out.println("Billie equals Sammy: " + billieAndSammy);
		
		//Valid wage
		billie.setWage(12.5);
		System.out.println("Billie's wage is: " +billie.getWage());
		
		//Invalid wage
		billie.setWage(-14.5);
		System.out.println("Billie's wage is still: " +billie.getWage());
	
		//Valid wage
		billie.setHours(46.5);
		System.out.println("Billie's hours for the week are: " +billie.getHours());
		
		//Invalid wage
		billie.setHours(-22.5);
		System.out.println("Billie's hours for the week are still: " +billie.getHours());	
		
		//Add valid amount of hours
		billie.incrementHours(2.6);
		System.out.println("Billie's hours are now: " + billie.getHours());
		
		//Remove valid amount of hours
		billie.incrementHours(-12.8);
		System.out.println("Billie's hours are now: " + billie.getHours());
		
		//Attempt to remove invalid amount of hours (taking him into the negative hours zone)
		billie.incrementHours(-62.6);
		System.out.println("Billie's hours are still: " + billie.getHours());
		
		//Print out Billie's summary
		System.out.println(billie.toString());
	}

}
