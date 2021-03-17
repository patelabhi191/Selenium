package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	
		WebElement footer = driver.findElement(By.xpath("//div[@id='pageFooterChildren']/ul"));
		List <WebElement> links = footer.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		System.out.println("\n------------------\n");
		for(int i=0; i<links.size(); i++ )
			System.out.print(links.get(i).getText()+",  ");
		System.out.println("\n-----------------------------------------------\n");
		
		for (WebElement w : links)
			System.out.println(w.getText());

	
		
	}

}
