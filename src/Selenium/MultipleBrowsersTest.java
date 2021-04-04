package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsersTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f = new FileInputStream("F:\\Testing\\porp.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
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


