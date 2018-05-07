package stepdefination;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass
{
	@Before
	public void launch()
	{
		launchBrowser();	
	}
	@After
	public void quit()
	{
		quitBrowser();
	}

}
