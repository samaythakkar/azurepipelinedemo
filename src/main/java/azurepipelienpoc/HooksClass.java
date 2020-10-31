package azurepipelienpoc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClass {

	public static WebDriver driver=null;


	public static void initlializeDriver() {
		WebDriver driver = null;
		WebDriverManager.chromedriver().version("86.0.4240.22").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized"); 
		options.addArguments("enable-automation"); 
		options.addArguments("--no-sandbox"); 
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-browser-side-navigation"); 
		options.addArguments("--disable-gpu"); 
		driver = new ChromeDriver(options); 
		driver.get("https://www.google.com/");
		HooksClass.driver = driver;

	}
	
	public static WebDriver getDriver() {
		WebDriver driver = null;
		if (HooksClass.driver == null) {
			HooksClass.initlializeDriver();
			driver = HooksClass.driver;
			
		}else {
			driver =  HooksClass.driver;
		}
		return driver;
	}
//	
//	
//	
//	public static void takeScreenshot(WebDriver driver, String filePath) throws IOException {
//		
//		TakesScreenshot scrshot = ((TakesScreenshot)driver);
//		
//        File SrcFile=scrshot.getScreenshotAs(OutputType.FILE);
//		
//        File DestFile=new File(filePath);
//
//        FileUtils.copyFile(SrcFile, DestFile);
//
//	}
	
	
	
}
