package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		List<WebElement> links = driver.findElements(By.name("group1"));
		System.out.println(links.size());
		for(WebElement a : links)
		System.out.println(a.getAttribute("Value"));
		
		
		
	}

}
