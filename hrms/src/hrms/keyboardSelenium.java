package hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardSelenium {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\HP\\Downloads\\webDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();

	    driver.navigate().to("https://www.google.com");
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("selenium");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
	    Thread.sleep(7000);
	    driver.close();
	}
}
