package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChromeBrowser {

	public static void main(String[] args) {

		String driverPath1 = "C:\\Users\\Kajal\\eclipse-workspace\\SeleniumTraining\\executables\\chromedriver.exe";
		// or absolute path
		String driverPath2 = ".\\executables\\chromedriver.exe";
		// or relative path
		String driverPath3 = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";

		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();

	}

}