package hrms;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	static String url="https://www.w3schools.com/html/html_tables.asp";
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\HP\\Downloads\\webDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
	    driver.navigate().to(url);
	    Thread.sleep(5000);
	    int row = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")).size();    
	    Thread.sleep(2000);
	    int col = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[4]/td")).size();    
	    Thread.sleep(2000);
	    int row_col = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td")).size();    
	    Thread.sleep(2000);
	    System.out.println("Total rows: "+row+" Total Columns: "+col+" Total Data is: "+row_col);
		
	    for (int i = 1; i <=row; i++) {
			String data = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]")).getText();
		System.out.println(data);
		Thread.sleep(2000);
	    
	    }
	}
}
