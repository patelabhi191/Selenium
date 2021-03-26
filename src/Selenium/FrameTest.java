package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");

		List<WebElement> sort = driver.findElements(By.linkText("Sortable"));
		System.out.println(sort.size());
		
		if(sort.size()>0)
			System.out.println("Sortable Present");
		else
			System.out.println("Sortable Not Present");
		
		driver.switchTo().frame(0);
		List<WebElement> drag = driver.findElements(By.id("draggable"));
		System.out.println(drag.size());
		
		if(drag.size()>0)
			System.out.println("Element Present");
		else
			System.out.println("Not Present");
		
		//driver.switchTo().defaultContent();
		//Switch to main frame
		
		//driver.switchTo().parentFrame();
		//Switch from innerframe to outerframe.
		//Or 
		//Switch to main frame and then switch to desired frame.
	}

}
