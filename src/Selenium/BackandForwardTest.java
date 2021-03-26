package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackandForwardTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.findElement(By.linkText("About")).click();
		wait.until(ExpectedConditions.titleContains("About Google"));
	//	Thread.sleep(2000);
		
		driver.navigate().back();
		wait.until(ExpectedConditions.titleIs("Google"));
	//	Thread.sleep(200);
		
		driver.navigate().forward();
		wait.until(ExpectedConditions.titleContains("About Google"));
	}

}
