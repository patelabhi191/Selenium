package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("HailTinoThaNee");
		driver.findElement(By.id("password-input")).sendKeys("HailTinoThaNee");
		driver.findElement(By.className("ButtonCore__block")).click();
		
		//Class
		
		
		//CSS
		
		//id
		
		//linktext
		
		//name
		
		//partialtext
		
		//tagname
		
		//xpath
	}

}
