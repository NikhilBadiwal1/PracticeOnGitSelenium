package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;


public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	
	//test in home page .java
	
	@FindBy(xpath="//div[contains(text(),'NEW CARS')]")
	WebElement NewCars;
	
	@FindBy(xpath="//div[contains(text(),'Find New Cars')]")
	WebElement findNewCars;
	
	@FindBy(xpath="//span[contains(text(),'New')]")
	WebElement searchNewCars;
	
	@FindBy(xpath="//span[contains(text(),'Used')]")
	WebElement searchUsedCars;
	
	public NewCarPage findNewCar()
	{
		//WebElement newcars=driver.findElement(By.xpath("//div[contains(text(),'NEW CARS')]"));
		Actions action= new Actions(driver);
		action.moveToElement(NewCars).build().perform();
		
		findNewCars.click();
		return new NewCarPage(driver);
	}
	
	public void searchNewCar()
	{
		
		searchNewCars.click();
	}
	
	public void searchUsedCar()
	{
		
		searchUsedCars.click();
	}
}
