package testng_prog;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WD_Testng_exp {
	ChromeDriver driver;
	@BeforeClass
	public void start () {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver3\\chromedriver.exe");
	  driver = new ChromeDriver();
	}
	@AfterClass
	public void closed () {
		driver.close();
	}
	@Test
	public void TC001 () throws Exception {
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println("Application open");
	Reporter.log("Application open");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("login completed");
	Reporter.log("login completed");
	Reporter.log(driver.getTitle());
	driver.findElement(By.linkText("Logout")).click();
	Reporter.log("Logout completed");
    }
    }
