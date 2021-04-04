package InHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdidasAllIn {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.manage().window().maximize();
		
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
		
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
		
		//Register
		driver.findElement(By.id("registration-firstname-field")).sendKeys("Adidas");
		driver.findElement(By.id("registration-lastname-field")).sendKeys("Adidas");
		
		driver.findElement(By.xpath("//span[@class='gl-radio-input__label']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//span[contains(text(),'Other')]")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[@class='gl-radio-input__label']")).click();
		Thread.sleep(600);
	/*	driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[contains(text(),'Other')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='gl-radio-input__label']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='gl-radio-input__label']")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//span[contains(text(),'Other')]")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//span[contains(text(),'Other')]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//span[@class='gl-radio-input__label']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//span[contains(text(),'Other')]")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//span[@class='gl-radio-input__label']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
		Thread.sleep(50);
		driver.findElement(By.xpath("//span[contains(text(),'Other')]")).click();
		Thread.sleep(50);
	*/	driver.findElement(By.xpath("//span[contains(text(),'Other')]")).click();
		Thread.sleep(50);
		driver.findElement(By.xpath("//span[@class='gl-radio-input__label']")).click();
		
		driver.findElement(By.id("registration-email-field")).sendKeys("adidas.nike1910@gmail.com");
		driver.findElement(By.id("registration-password-field")).sendKeys("Nike@gmail123");
		driver.findElement(By.id("undefined-registration-ageconfirmation-field")).click();
	}
	
	
}
