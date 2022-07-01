package webdriverExamples;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_Vreifr_Frame {
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(4000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("mani");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("baburao");
		Thread.sleep(3000);
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		driver.close();
		}
}
