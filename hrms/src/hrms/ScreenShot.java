package hrms;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\HP\\Downloads\\webDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		try {
		driver.navigate().to("https://skpatro.github.io/demo/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[3]/b/a")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("123Framename1");
		driver.findElement(By.xpath("/html/body/a[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"regform\"]/a[1]")).click();
		Thread.sleep(5000);
		System.out.println("frame ope done");
		}
		 catch(Exception e)        {
			 File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(f1, new File("C:\\Users\\HP\\Downloads\\jar files\\screenshot\\TestResults.png"));
			       }
		
	driver.quit();
		System.out.println("logout done");
	}

}
