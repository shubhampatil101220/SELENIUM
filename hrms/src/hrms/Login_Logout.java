package hrms;
//to access th4 webdriver and its method
import org.openqa.selenium.WebDriver;
//to access the chrome driver
import org.openqa.selenium.chrome.ChromeDriver;
//to access the object ide method
import org.openqa.selenium.By;

public class Login_Logout {
	public static void main(String args[]) throws Exception{
		//steps for manual TC
		//1. Launch the Browser & open the given URL
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\HP\\Downloads\\webDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();

	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(5000);
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	 
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.getCurrentUrl());
	   // driver.close();
	    //2.Enter the Username
		//3. Enter the PAsssword
		//4.click on login button
		//5.verify the user is logged in
	}
}
