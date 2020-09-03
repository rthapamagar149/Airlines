package Place;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AirlinesBrowser extends AirlinesMethods{
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.southwest.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	@Test(enabled=true)
	public void testReg() {
		TestSignUp() ;
		CreateAccount();
		ContactDetail();
		SecurityCheck();	
	}
	@Test(enabled=false)
	public void Test2(){
		TestSignUp();
		SecurityCheck();	
	}
	@AfterMethod
	public void closeBrowser() {
		
	}

}
