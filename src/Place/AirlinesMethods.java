package Place;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AirlinesMethods {
 WebDriver driver;
 public void TestSignUp() {
   driver.findElement(By.xpath("//a[@class='actionable actionable_link actionable_light link header-control--control']")).click();
 }
 public void CreateAccount() {
	 //driver.findElement(By.xpath("//input[@name='customer.firstName']")).sendKeys("Rabin");
	 driver.findElement(By.cssSelector("#js-customer-first-name")).sendKeys("Rabin");
	 driver.findElement(By.xpath("//input[@name='customer.middleName']")).sendKeys("A");
	 driver.findElement(By.xpath("//input[@name='customer.lastName']")).sendKeys("Magar");
	 Select suffic=new Select(driver.findElement(By.xpath("//select[@name='customer.suffix']")));
	 suffic.selectByVisibleText("CEO");
	 Select PMonth=new Select(driver.findElement(By.xpath("//select[@name='customer.birthMonth']")));
	 PMonth.selectByVisibleText("Feb");
	 Select PDay=new Select(driver.findElement(By.xpath("//select[@name='customer.birthDay']")));
	 PDay.selectByVisibleText("14");
	 Select PYear=new Select(driver.findElement(By.xpath("//select[@name='customer.birthYear']")));
	 PYear.selectByVisibleText("1991");
	 Select Gender=new Select(driver.findElement(By.xpath("//select[@name='customer.gender']")));
	 Gender.selectByVisibleText("Male");
	 driver.findElement(By.xpath("//input[@name='customer.familiarName']")).sendKeys("God");
 }
 public void ContactDetail() {
	 Select Country=new Select(driver.findElement(By.xpath("//select[@name='contactInfo.addresses[0].country']")));
	 Country.selectByVisibleText("NEPAL"); 
	 driver.findElement(By.xpath("//input[@name='contactInfo.addresses[0].line1']")).sendKeys("3819 North Beltline rd");
	 driver.findElement(By.xpath("//input[@name='contactInfo.addresses[0].line2']")).sendKeys("William deheas dr");
	 driver.findElement(By.xpath("//input[@name='contactInfo.addresses[0].city']")).sendKeys("Irving");
	 driver.findElement(By.xpath("//input[@name='contactInfo.addresses[0].province']")).sendKeys("Texas");
	 driver.findElement(By.xpath("//input[@name='contactInfo.addresses[0].zipOrPostalCode']")).sendKeys("75038");
	 Select code=new Select(driver.findElement(By.xpath("//select[@id='js-intl-country-code']")));
	 code.selectByVisibleText("+1");
	 driver.findElement(By.xpath("//input[@id='js-intl-number']")).sendKeys("4695948688");
	 driver.findElement(By.xpath("//input[@id='js-contact-email']")).sendKeys("rthapamagar@gmail.com");
	 driver.findElement(By.xpath("//input[@id='js-contact-email-confirmation']")).sendKeys("rthapamagar@gmail.com");
 }
 public void SecurityCheck() {
	 driver.findElement(By.xpath("//input[@name='account.username']")).sendKeys("Rabin123");
	 driver.findElement(By.xpath("//button[@id='js-check-availability-link']")).click();
	 driver.findElement(By.xpath("//input[@name='account.password']")).sendKeys("Rabin@magar");
	 driver.findElement(By.xpath("//button[@class='js-show-password show-password show-password-link']")).click();
	 Select question1=new Select(driver.findElement(By.xpath("//select[@name='account.securityQuestion']")));
	 question1.selectByVisibleText("What is the name of the city in which you were born?");
	 driver.findElement(By.xpath("//input[@name='account.securityAnswer']")).sendKeys("Irving");
	 Select question2=new Select(driver.findElement(By.xpath("//select[@name='account.securityQuestion2']")));
	 question2.selectByVisibleText("What was the color of your first car?");
	 driver.findElement(By.xpath("//input[@name='account.securityAnswer2']")).sendKeys("Nissan");
	 driver.findElement(By.xpath("//button[@id=\"js-submit-button\"]")).click();
	 driver.findElement(By.xpath("//a[@href='/myaccount']")).click();
 }
}
