package demosite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteautomationAssignment {

public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demosite.executeautomation.com/");
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		
		//identify the required element from the UI
		WebElement userNameInputField=driver.findElement(By.name("UserName"));
		//perform appropriate action the identified element
		userNameInputField.sendKeys("admin234567");
		
		//remove existing text from the input field
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		
		//identify the required element from the UI
		WebElement passwordInputField=driver.findElement(By.name("Password"));
		//perform appropriate action the identified element
		passwordInputField.sendKeys("manager12345");
		passwordInputField.clear();
		passwordInputField.sendKeys("manager");
		
		
		//identify the required element from the UI
		WebElement loginBtn=driver.findElement(By.name("Login"));
		//perform appropriate action the identified element
		loginBtn.click();	
		
		//close browser
		//driver.close();
	}
}

