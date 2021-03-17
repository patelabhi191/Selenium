package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
	
		WebElement drop = driver.findElement(By.xpath("//div[@id='gh-cat-box']/select")); 
		
		List <WebElement> links = drop.findElements(By.tagName("option"));
		
		System.out.println(links.size());
		System.out.println("------------------");
		
		
		
	
		
		WebElement dropClick = driver.findElement(By.id("gh-cat"));
		//dropClick.findElement(By.xpath("//option[@value='550']")).click(); //Selecting Art
		Select s = new Select(dropClick);
		s.selectByIndex(9);
		Thread.sleep(2000);
		s.selectByValue("267");
		Thread.sleep(2000);
		s.selectByVisibleText("Art");
		
	//	driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Picaso");
	//	driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
		
		
		
		/*
		for(int i=0; i<links.size(); i++ )
			System.out.println(links.get(i).getText()+ " - " + );
		 */
		
		for(WebElement w : links)
		{
			if(w.isSelected())
			System.out.println(w.getText()+" - "+ w.isSelected());	}
		}
}
