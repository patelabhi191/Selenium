package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumJars\\geckodriver.exe");
		//ChromeDriver cdriver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=pbmbJuKIlG0&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiJwYm1iSnVLSWxHMCIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjE1MDUzMTIwLCJpYXQiOjE2MTUwNTE5MjAsImp0aSI6IjA4OTk0MzM4LWQ1N2EtNDcxMy1iYTdkLWZmNzBkOTgwZDRiMSIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.cw-xQNFYG0oDLO9lQQgi4ACrIAtCQjdNY1wWmLlQg8yPb4DWc6MrlSBu05vI9EynJPzpPJRSG3SfxD99SWYdwUUhIsW4GAvkeV7DCDwFtSMrYHZ_qPQge8aKrLpyYBE8VCkpMnK4rPZrPNOb5dtOO5tPNfx0ojj2EQ8eLncxBVLxjACV3GZ23WwyDVMHGlA-sQco2LjHCnVlpLB0aMSquAZliMSedFPfgkx0DT-FY6YoXuAwbeeHx0Uo3dy5yto3I6o35xJdKOLONNG6umxEsCmUT6TT-MFBhFneTxznbZxRxg1dWjFUOUxNexdslA9bSZTyD_ez11Z9CzXFaSVyLg&preferred_environment=");
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("HailTinoThaNee");
		driver.findElement(By.id("password-input")).sendKeys("HailTinoThaNee");
		driver.findElement(By.className("ButtonCore__block")).click();
		
	}

}
