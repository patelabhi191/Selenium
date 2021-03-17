package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		
		
		driver.findElement(By.name("firstname")).sendKeys("HailTino");
		driver.findElement(By.name("lastname")).sendKeys("ThaNee");
		driver.findElement(By.name("reg_email__")).sendKeys("HailTinoThaa@Nee.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("HailTinoThaNee");
		
		WebElement dropMonth = driver.findElement(By.xpath("//select[@id='month']"));
		//dropClick.findElement(By.xpath("//option[@value='550']")).click(); //Selecting Art
		Select m = new Select(dropMonth);
		m.selectByVisibleText("Jul");
		
		WebElement dropDay = driver.findElement(By.xpath("//select[@id='day']"));
		//dropClick.findElement(By.xpath("//option[@value='550']")).click(); //Selecting Art
		Select d = new Select(dropDay);
		d.selectByVisibleText("20");
		
		WebElement dropYear = driver.findElement(By.xpath("//select[@id='year']"));
		//dropClick.findElement(By.xpath("//option[@value='550']")).click(); //Selecting Art
		Select y = new Select(dropYear);
		y.selectByVisibleText("2000");
		
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
	
		Thread.sleep(2000);
	//	driver.findElement(By.linkText("Sign Up")).click();
		
	}

}
