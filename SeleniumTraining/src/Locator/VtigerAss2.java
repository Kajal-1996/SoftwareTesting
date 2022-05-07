package Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerAss2 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  ".\\executables\\chromedriver.exe");
		
		WebDriver vt = new ChromeDriver();
		
		vt.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait Wait = new WebDriverWait(vt,20);
	
	    vt.get("https://demo.vtiger.com/vtigercrm/index.php");
	    
	    String beforelogin=vt.getTitle();
	    
	    vt.findElement(By.id("username")).clear();
	    
	    vt.findElement(By.id("password")).clear();
	    
	    vt.findElement(By.id("username")).sendKeys("admin");
	    
	    vt.findElement(By.id("password")).sendKeys("Test@123");
		
	    vt.findElement(By.className("button")).click();
	    
	    WebElement logoutNav = vt.findElement(By.cssSelector("div#navbar a.pull-right"));
	    
	    Wait.until(ExpectedConditions.elementToBeClickable(logoutNav));
	    
	    String afterLogin=vt.getTitle();
	    
	    if(beforelogin.equals(afterLogin)) {
			System.out.println("unsucessfully  Login");
			
		}else {
			System.out.println("sucessfully  Login");
		} 
	    		
	    vt.findElement(By.cssSelector("div#navbar a.pull-right")).click();
	    
	    vt.findElement(By.cssSelector("span.pull-right>a")).click();
	    
	    WebElement signIn =(WebElement) vt.findElements(By.className("button"));
	    
		Wait.until(ExpectedConditions.elementToBeClickable(signIn));
		
		if(beforelogin.equals(afterLogin)) {
			System.out.println("Logout sucessfully");
			
		}else {
			System.out.println("Logout unsucessfully");
		} 
		
}
}
	    
	    
	    		
		