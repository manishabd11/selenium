package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng_emp {
	@Test
	public void login() 	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver3\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		
		
		
	}

}
