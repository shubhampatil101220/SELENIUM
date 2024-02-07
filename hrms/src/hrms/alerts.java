package hrms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class alerts {
	 static String url="https://skpatro.github.io/demo/";
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\HP\\Downloads\\webDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
	    driver.navigate().to(url);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[2]/ul/li[4]/b/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"regform\"]/input[1]")).click();
	    Thread.sleep(2000);
		
	    Alert a = driver.switchTo().alert();
	   
	    a.getText();  //it will get the text on that alert
	    Thread.sleep(2000);
	    System.out.println(a.getText());
	    a.accept();  //It will Accept the alert or it will click on ok button 
	    System.out.println("Accept has done");
	    //a.dismiss(); // it will click on cancel button
	    Thread.sleep(2000);
//	    ==========================================================================================
	    driver.findElement(By.id("prompt")).click();
	    Thread.sleep(2000);
	    a.sendKeys(" Shubham"); //it will give input to the textbox in alert box
	    Thread.sleep(2000);
	    a.accept();
	    Thread.sleep(5000);
	    System.out.println("prompt alert has done");
//	    ============================================================================================
	    driver.findElement(By.id("confirm")).click();
	    Thread.sleep(2000);
	     a.dismiss(); 
	     driver.findElement(By.id("confirm")).click();
		    Thread.sleep(2000);
		     a.accept();
	 
	    System.out.println("Confirm alert has done");
	    Thread.sleep(5000);
	    driver.close(); //close the browser
	}

}
