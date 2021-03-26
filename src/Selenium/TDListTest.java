package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TDListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking/");
		
		WebElement hover = driver.findElement(By.linkText("Products"));
		
		Actions build = new Actions(driver);
		build.moveToElement(hover).build().perform();
		Thread.sleep(5000);

		WebElement products = driver.findElement(By.xpath("//ul[@aria-labelledby='td-desktop-nav-dropdown-link-2']"));
		List <WebElement> lists = products.findElements(By.tagName("a"));
		
		System.out.println("Size - "+lists.size());
		for(int i=0; i<lists.size() ; i++)
			System.out.println(lists.get(i).getText());
		
		//for(WebElement a : lists)
		//	System.out.println(a.getText());
			
	}

}
