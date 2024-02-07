package hrms;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardRobot {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\HP\\Downloads\\webDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();

	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(5000);
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    
	    //click on login button using keyboard 1.TAB  2.Enter
	    //using java classes
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_TAB);
	    System.out.println("TAB key is pressedand Released");
	    Thread.sleep(2000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("ENTER key is pressedand Released");
	    Thread.sleep(5000);
	    //click on login button using keyboard 1.TAB  2.Enter
	    //using selenium classes
	    
	    //Write code for logout
	    driver.close();
	}
}
