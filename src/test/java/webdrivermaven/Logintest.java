package webdrivermaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Logintest {
	public static WebDriver driver;
	@BeforeSuite
	public void setup()
	{
		driver =new ChromeDriver();
	}
	@Test
	public void doLogin()
	{
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("abc@yopmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("ssssddd");
		driver.findElement(By.id("SignIn")).click();
	}
    @AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
