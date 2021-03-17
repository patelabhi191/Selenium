package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		WebElement link = driver.findElement(By.tagName("a"));
		WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']"));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(link);
		
		List<WebElement> flinks = footer.findElements(By.tagName("a"));
		System.out.println("\n------------------\n" + links.size());
		
		
		for(int i=0; i<links.size(); i++ )
			System.out.println(links.get(i).getText());
		System.out.println("\n------------------\n");
		System.out.println(flinks.size());
		for(int i=0; i<flinks.size(); i++ )
			System.out.println(flinks.get(i).getText());
	}

}
