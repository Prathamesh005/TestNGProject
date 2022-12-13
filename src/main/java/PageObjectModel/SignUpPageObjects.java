package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	public WebDriver driver;

	 By FirstName = By.xpath("//input[@name='UserFirstName']");
	 By LastName=By.xpath("//input[@name='UserLastName']");

	 By selectJobTitle = By.xpath("//select[@name='CompanyEmployees']");
     By Email=By.xpath("//input[@name='UserEmail']");
     By CompanyName=By.xpath("//input[@name=CompanyName']");
	 public SignUpPageObjects(WebDriver driver2) {

	  this.driver=driver2;
	 }

	 public WebElement enterFirstname() {

	  return driver.findElement(FirstName);
	 }
 public WebElement enterLastname() {

		  return driver.findElement(LastName);
	 }
		
	
	 public WebElement selectCompanyEmployees() {

	  return driver.findElement(selectJobTitle);
	 }
	 //add
	 public WebElement Email() {

		  return driver.findElement(Email);
	 }
	 public WebElement CompanyName() {

		  return driver.findElement(CompanyName);
	 }
	 
}

