package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		Thread.sleep(3000);
		
		WebElement hover = driver.findElement(By.linkText("Men"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(hover).build().perform();
		Thread.sleep(3000);
		
		WebElement men = driver.findElement(By.xpath("//div[@id='DesktopMenu-0-1-0']/div/div[2]"));
		List <WebElement> links = men.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		for(int i=0; i<links.size(); i++ )
			System.out.print(links.get(i).getText()+",  ");
		
		

	}

}
