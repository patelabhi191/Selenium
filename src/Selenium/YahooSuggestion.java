package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		driver.findElement(By.id("header-search-input")).sendKeys("Canada");
		Thread.sleep(1000);
		
		WebElement suggestion = driver.findElement(By.xpath("//div[@type='normal']/ul"));
		List <WebElement> links = suggestion.findElements(By.tagName("li"));
		
		
		System.out.println(links.size());
		for(int i=0; i<links.size(); i++ )
			System.out.print(links.get(i).getText()+",  ");
		
		
		

	}

}
