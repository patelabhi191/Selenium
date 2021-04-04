package Selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
			
		WebElement closeButton = driver.findElement(By.xpath("//img[@class='btn-close']"));
		WebElement subscribe = driver.findElement(By.className("_24EHh"));
		
		List<WebElement> element = driver.findElements(By.xpath("//img[@class='btn-close']"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("PopUp Present");
			closeButton.click();
		}
		else
			System.out.println("PopUp Not Present");
		
		driver.findElement(By.cssSelector("#search-key")).sendKeys("Computer");
		driver.findElement(By.cssSelector("#search-key")).sendKeys(Keys.ENTER);
	//	driver.findElement(By.cssSelector("input[class='search-button']")).click();
		

	}

}
