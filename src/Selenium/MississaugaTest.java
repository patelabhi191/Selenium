package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		Thread.sleep(500);
		
		List <WebElement> links = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		System.out.println(links.size());
		
		for(int i=0; i<=links.size(); i++ )
		{
			System.out.print(links.get(i).getText()+",  ");
			
			if(links.get(i).getText().equals("Jobs and volunteer"));
			break;
			
		}
		
		driver.findElement(By.linkText("Jobs and volunteer")).click();

	}

}
