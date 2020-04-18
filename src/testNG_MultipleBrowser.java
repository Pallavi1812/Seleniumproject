
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testNG_MultipleBrowser {
	
	
	
	@Test
	public void browser() {
		String browser = null;
		WebDriver driver;
		if(browser.equalsIgnoreCase("firefox")) {
			//create firefox instance
			System.setProperty("webdriver.gecko.driver", 
					"/Users/pallavi/eclipse-workspace/SeleniumProject/Driver/googlechrome.dmg");
				 driver = new FirefoxDriver();
				 driver.get("www.bambooapp.com");
	}
		
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver",
					"//Users//pallavi//Documents//Selenium_jars//googlechrome.dmg");
			//create chrome instance
			driver = new ChromeDriver();
			driver.get("www.bambooapp.com");
	}
	}
	

}
