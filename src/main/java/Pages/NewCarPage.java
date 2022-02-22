package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class NewCarPage extends BasePage {

	public NewCarPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="(//div[contains(text(),'Toyota')])[1]")
	WebElement toyotaLink;
	
	@FindBy(xpath="//div[contains(text(),'Honda')]")
	WebElement HondaLink;
	
	@FindBy(xpath="//div[contains(text(),'BMW')]")
	WebElement BMWLink;
	
	public ToyotaCarPage gotoToyota()
	{
		toyotaLink.click();
		return new ToyotaCarPage(driver);
		
	}
	public HondaCarPage gotoHonda()
	{
		HondaLink.click();
		return new HondaCarPage(driver);
	}
	
	public BMWCarPage gotoBMW()
	{
		BMWLink.click();
		return new BMWCarPage(driver);
		//modified new car page
	}
}
