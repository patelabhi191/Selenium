package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser = "Firefox";
		WebDriver driver;
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else{	
			System.setProperty("webdriver.chrome.driver","F:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("HailTinoThaNee");
		driver.findElement(By.id("pass")).sendKeys("HailTinoThaNee");
		driver.findElement(By.name("login")).click();
	}
		
	}


