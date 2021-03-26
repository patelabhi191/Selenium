package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");

		Thread.sleep(1000);
		WebElement aboutUs = driver.findElement(By.linkText("About Us"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//Option 1 - Scroll to that location
	/*	jse.executeScript("window.scrollBy(0,4000)");
		aboutUs.click();
		*/
		
		//Option 2 - scroll till value is true
	//	jse.executeScript("arguments[0].scrollIntoView(ture);", aboutUs);
	//	aboutUs.click();
	
		jse.executeScript("arguments[0].click()", aboutUs);
	
	}

}
