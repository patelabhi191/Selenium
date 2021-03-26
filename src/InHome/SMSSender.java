package InHome;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SMSSender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://messages.google.com/web/authentication");
		
		Thread.sleep(12000);
		driver.findElement(By.xpath("//h3[@class='name ng-star-inserted']")).click();
		Thread.sleep(3000);
		
	
		
		for(int i =0 ; i<10; i++) {
		driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Seth");
		driver.findElement(By.xpath("//mws-message-send-button[@class='floating-button']")).click();
		driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("On");
		driver.findElement(By.xpath("//mws-message-send-button[@class='floating-button']")).click();
		driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Fire");
		driver.findElement(By.xpath("//mws-message-send-button[@class='floating-button']")).click();
		driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("🔥");
		driver.findElement(By.xpath("//mws-message-send-button[@class='floating-button']")).click();
		

		driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Burning Desire");
		driver.findElement(By.xpath("//mws-message-send-button[@class='floating-button']")).click();
		Thread.sleep(3000);
		}
		
		driver.close();
	}

}
