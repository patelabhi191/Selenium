package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackandForwardTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(200);
		driver.navigate().forward();

	}

}
