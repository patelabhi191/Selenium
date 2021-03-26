package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
	
		WebElement hover = driver.findElement(By.linkText("Electronics"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(hover).build().perform();
		Thread.sleep(5000);
		
		WebElement categories = driver.findElement(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]"));
		List <WebElement> links = categories.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		System.out.println("------------------");
		for(int i=0; i<links.size(); i++ )
			System.out.print(links.get(i).getText()+",  ");
	
	}

}
