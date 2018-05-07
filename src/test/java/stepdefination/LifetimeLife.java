package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LifetimeLife extends BaseClass
{   
	String data;
	@Given("^The User on LifeTime\\.Life website$")
	public void the_User_on_LifeTime_Life_website() 
	{  
		launchBrowser();
		driver.get("https://www.lifetime.life/");
	}

	@When("^The User select particular text$")
	public void the_User_select_particular_text() 
	{
	 driver.findElement(By.xpath("//*[@id=\"primaryNav\"]/li[3]/a")).click();
	 driver.findElement(By.xpath("//*[@id=\"primaryNav\"]/li[3]/div[2]/ul/li[5]/a")).click();
	 
	WebElement txtdata= driver.findElement(By.xpath("//h4[contains(text(),'Premier Basketball Courts')]"));
	 data=txtdata.getText();
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].scrollIntoView(true)", txtdata);
	 
	 
	}

	@Then("^The user verify particular text is there or not$")
	public void the_user_verify_particular_text_is_there_or_not() 
	{
		Assert.assertEquals("Premier Basketball Courts", data);
	}


}
