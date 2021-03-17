package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
	//	driver.findElement(By.className("BHzsHc")).click();
		
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("HailTinoThaNee");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		String output = "Couldn't find your Google Account";
		
		System.out.println(actual);
		
		if (output.equals(actual))
			System.out.println("Test Passed");
			
		else
			System.out.println("Test Failed");
			

		
		//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("HailTinoThaNee");
		//driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	}
	

}
