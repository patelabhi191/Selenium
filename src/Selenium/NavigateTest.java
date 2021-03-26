package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/");

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
