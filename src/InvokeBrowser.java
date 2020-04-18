import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		allBrowser();
		

	}
	
	static void allBrowser() {
		String browser = null;
		WebDriver driver;
		if(browser.equalsIgnoreCase("firefox")) {
			//create firefox instance
			System.setProperty("webdriver.gecko.driver", );
				 driver = new FirefoxDriver();
				 driver.get("www.bambooapp.com");
	}
		
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver",);
			//create chrome instance
			driver = new ChromeDriver();
			driver.get("www.bambooapp.com");
	}
		
		/* else if(browser.equalsIgnoreCase("safari")){
			//set path to chromedriver.exe
			System.setProperty("","");
			//create chrome instance
			driver = new SafariDriver();
			*/
		
		
}}