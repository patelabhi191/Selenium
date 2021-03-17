package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated metho
	
	System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
	//ChromeDriver cdriver = new ChromeDriver();
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.adidas.ca/en/account-login");
	
	Thread.sleep(2000);
	driver.findElement(By.id("login-email")).sendKeys("HailTinoTha@Nee.com");
	driver.findElement(By.id("login-password")).sendKeys("HailTinoThaNee");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.className("gl-cta__content")).click();
	Thread.sleep(2000);
	
	String output = "Incorrect email/password – please check and retry";
	String actual = driver.findElement(By.xpath("//div[@class='errorMessage___2sHhm gl-form-hint gl-form-hint--error']")).getText() ;   //driver.findElement(By.className("gl-vspace-bpall-small")).getText();

	if (actual.equals(output))
	System.out.println("Test Passed");
	
	else
		System.out.println("Test Failed");
	

	}
}
