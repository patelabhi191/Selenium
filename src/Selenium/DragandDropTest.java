package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDropTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(1000);
		if(drop.getText().equals("Dropped!"))
			System.out.println("Dropped Succesful..");
		else
			System.out.println("Drop failed..!!");
			
		
	

	}

}
