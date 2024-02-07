package testNG_EX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WB_testNG {

	WebDriver driver;
	 @BeforeClass
	private void startUP() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\HP\\Downloads\\webDriver\\chromedriver.exe");
	     driver = new ChromeDriver();
	}
	 @AfterClass
	 public void tearDown() {
	 driver.close();
	 }
	 @Test
	 public void tc001() throws Exception{
	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 Reporter.log("Application opened");
	 Thread.sleep(3000);
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 Thread.sleep(3000);
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	 System.out.println("Login completed");
	 Thread.sleep(3000);
	 Reporter.log("Login completed");
	
	 
	 }

}
