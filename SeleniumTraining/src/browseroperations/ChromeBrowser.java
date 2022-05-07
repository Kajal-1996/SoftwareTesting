package browseroperations;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		
		//get required browser executable path
				String path1="C:\\Users\\Kajal\\eclipse-workspace\\SeleniumTraining\\executables\\chromedriver.exe";
				String path2=".\\executables\\chromedriver.exe";//location
				
				
				String path3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
				//set required browser executable path using System.setProperty(String key,String value)
				System.setProperty("webdriver.chrome.driver", path3);//key and value means path
				//create an instance of required browser class
				ChromeDriver cdriver=new ChromeDriver();
			}

		}

/**
 * Selenium always opens new browser for every run, it won't work on already opened browser
 * Browser open by selenium will not have any cookies or history or download history or plug-in
 */ 
