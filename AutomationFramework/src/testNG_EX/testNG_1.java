package testNG_EX;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testNG_1 {
	//@Test --one individual test cases or test scenarios
	@BeforeClass
	private void opanApplicatiion() {
		// TODO Auto-generated method stub
		System.out.println("Application Opened");
	}
	@AfterClass
	private void closeApplication() {
		// TODO Auto-generated method stub
		System.out.println("Application Closed");
	}
	@Test(priority = 2)
	private void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Employee  Added");
	}
	@Test(priority = 1)
	private void delEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Employee Deleted");
	}
}
