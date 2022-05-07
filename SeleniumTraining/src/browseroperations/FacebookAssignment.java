package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAssignment {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com");
		
		String sourceCode=driver.getPageSource();
		System.out.println("Application source code: "+sourceCode);
		System.out.println("Source code length: "+sourceCode.length());
		
		System.out.println("Application current URL: "+driver.getCurrentUrl());
		
		System.out.println("Application current Title: "+driver.getTitle());
		
		//if(driver.getTitle().equals("Google")) {
		//	System.out.println("Google search page opened successfully...");
		
		//}else {
		//	System.out.println("Either google search page not opened or its title got changed");
		//}
		
		//close current instance of browser
		//driver.close();
	}
}
