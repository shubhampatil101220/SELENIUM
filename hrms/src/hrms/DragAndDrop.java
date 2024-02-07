package hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;

public class DragAndDrop {
	public static void main(String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\HP\\Downloads\\webDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
				Thread.sleep(4000);
				//Verify Title - Cond: fail : stop exe
				assertEquals(driver.getTitle(),"Droppable | jQuery UI");
				System.out.println("Title matched");
				driver.switchTo().frame(0);
				Actions ac = new Actions(driver);
				ac.dragAndDrop(driver.findElement(By.id("draggable")),
				               driver.findElement(By.id("droppable"))).perform();
				Thread.sleep(5000);
				System.out.println("drag&drop");
				driver.switchTo().defaultContent();
				driver.close();


}


}
