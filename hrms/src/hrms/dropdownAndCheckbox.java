package hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownAndCheckbox {
	 static String url="https://facebook.com/register";
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\HP\\Downloads\\webDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
	    driver.navigate().to(url);
	    Thread.sleep(5000);
	    //Drop down/select code
	    WebElement date =   driver.findElement(By.xpath("//*[@id=\"day\"]"));
	    Thread.sleep(2000);
	    Select st = new Select(date);
	     st.selectByIndex(5); //selecting value from select box by index
	     Thread.sleep(2000);
	     st.selectByValue("21"); //selecting value from select box by values
	     Thread.sleep(2000);
	     st.selectByVisibleText("28"); //selecting value from select box by values
	     //check box code
	     driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
