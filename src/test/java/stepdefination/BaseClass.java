package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

     WebDriver driver=null;
     
	 public void launchBrowser()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Project4\\src\\test\\resources\\lib\\chromedriver.exe"); 
	driver = new ChromeDriver();
	
	}
	 public void quitBrowser()
	 {
		 driver.close();
	 }
}
