package hrms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class wait_stmt {
	static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\HP\\Downloads\\webDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
	    driver.navigate().to(url);
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		
		//wait for login button until data is filled
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));
		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))));
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	   
	    Thread.sleep(2000);
	    
	    //implicit wait 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[1]/button")).click();
	   System.out.println("button clicked");
	    Thread.sleep(5000);
	   //
	    
	    
	    
	}

}
