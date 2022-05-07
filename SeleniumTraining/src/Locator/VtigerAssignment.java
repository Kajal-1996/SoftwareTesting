package Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerAssignment {

public static void main(String[] args) {
	
	
	
	
	
	
		
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://crmaccess.vtiger.com/log-in/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//String expectedTitle="actiTIME - Login";
		//String actualTitle=driver.getTitle();
		//if(actualTitle.equals(expectedTitle)) {
		//	System.out.println("Login page opened sucessfully...");
		//}else {
		//	System.out.println("Either login page not opened or page title got changed");
		//}
		
		//identify the required element from the UI
		WebElement userNameInputField=driver.findElement(By.name("username"));
		//perform appropriate action the identified element
		userNameInputField.sendKeys("admin");
		
		//remove existing text from the input field
		//userNameInputField.clear();
		//userNameInputField.sendKeys("admin");
		
		//identify the required element from the UI
		WebElement passwordInputField=driver.findElement(By.name("password"));
		//perform appropriate action the identified element
		passwordInputField.sendKeys("Test@123");
		
		//identify the required element from the UI
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		//perform appropriate action the identified element
		loginButton.click();	
		
		//close browser
		//driver.close();
	}
}
