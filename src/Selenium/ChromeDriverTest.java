package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		/*
		if(driver.findElement(By.linkText("About")).isDisplayed())
			System.out.println("Element Prsent");
		else
			System.out.println("Element not Present");
		*/
		
		List<WebElement> element = driver.findElements(By.linkText("About"));
		System.out.println(element.size());
		
		if(element.size()>0)
			System.out.println("Element Present");
		else
			System.out.println("Not Present");
		driver.findElement(By.linkText("About")).click();

	}

}
