package testcases;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.time.Duration;

import Pages.HomePage;
import Pages.NewCarPage;

public class HomePageTest {

	public static WebDriver driver;
	@Test
	public void testIt() {
		
		Map<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.carwale.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*HomePage home=new HomePage(driver);
		NewCarPage carpage=home.findNewCar();
		
		//NewCarPage carpage=new NewCarPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		carpage.gotoBMW();*/
		//added git practice //added it for nikhil_gittest branch//new code
		new HomePage(driver).findNewCar().gotoBMW();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterSuite
	public void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
}
