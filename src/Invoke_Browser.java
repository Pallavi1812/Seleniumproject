import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invoke_Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/pallavi/eclipse-workspace/SeleniumProject/Driver/chromedriver 2");
		Thread.sleep(3000);
			 driver = new ChromeDriver();
			 Thread.sleep(3000);
			 driver.get("https://www.bambooapp.com/");
			 driver.quit();
			 
			System.setProperty("webdriver.gecko.driver",
						"/Users/pallavi/eclipse-workspace/SeleniumProject/Driver/Firefox 69.0.2.dmg");
				//create chrome instance
				driver = new FirefoxDriver();
				driver.get("www.bambooapp.com");
	}

}
