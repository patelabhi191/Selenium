package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		File src = driver.getScreenshotAs(OutputType.FILE); //For Firefox or chromeDriver or any class
		//File srcimg = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Line for WebDriver
		FileUtils.copyFile(src, new File("F:/Testing/Screehshot.png"));
	}

}
