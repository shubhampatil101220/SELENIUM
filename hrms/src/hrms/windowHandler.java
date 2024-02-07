package hrms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandler {

	static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\HP\\Downloads\\webDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
	    driver.navigate().to(url);
	    Thread.sleep(5000);
	    System.out.println(driver.getTitle()); //get title of webpage
	    System.out.println(driver.getWindowHandle().toString()); //get openend window detail 
	    System.out.println(driver.getWindowHandles()); // get multiple openend window details
	    driver.close(); //closes current openned window
	    driver.quit(); //closes all the opened window by selenium
	}
}
