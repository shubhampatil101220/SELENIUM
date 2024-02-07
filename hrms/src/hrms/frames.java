package hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	static String url="https://skpatro.github.io/demo/";
	
	public static void main(String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\HP\\Downloads\\webDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[3]/b/a")).click();
		Thread.sleep(3000);
		//to enter into frame
		driver.switchTo().frame("Framename1");
		driver.findElement(By.xpath("/html/body/a[1]")).click();
		Thread.sleep(2000);
		//to exit from the frame
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"regform\"]/a[1]")).click();
		driver.quit();
		System.out.println("actions done");
		
		
	}

}
