package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.cssSelector("#email")).sendKeys("HailTinoThaNee");
		driver.findElement(By.cssSelector("#pass")).sendKeys("HailTinoThaNee");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
	/*	#email   - id
		.sdgggf  - class
		* - Contains - input[data-testid*='yal_emai']
		$ - ends with - input[data-testid$='yal_email']
		^ - Starts with - input[data-testid$='royal_ema']

		tagName[attributeName='AttributeValue']

		input[data-testid='royal_email'][name='email']
*/
		
	}

}
