package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.findElement(By.name("B2")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		
		a.accept();
		//a.dismiss();

	}

}
