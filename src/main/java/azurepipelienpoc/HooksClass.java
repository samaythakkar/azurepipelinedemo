package azurepipelienpoc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClass {

	public static WebDriver driver=null;


	public static WebDriver getDriver() {
		WebDriver driver = null;
		WebDriverManager.chromedriver().version("86.0.4240.22").setup();
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized"); 
//		options.addArguments("enable-automation"); 
//		options.addArguments("--no-sandbox"); 
//		options.addArguments("--disable-infobars");
//		options.addArguments("--disable-dev-shm-usage");
//		options.addArguments("--disable-browser-side-navigation"); 
//		options.addArguments("--disable-gpu"); 
		driver = new ChromeDriver(options); 
		driver.get("https://www.google.com/");
		return driver;

	}
}
