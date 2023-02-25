package meera_bricks;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://bricks.clustorcomputing.com/");
		System.out.println("login page is open");
		Thread.sleep(3000);
		driver.findElement(By.name("uname")).sendKeys("super admin");
		driver.findElement(By.name("userpwd")).sendKeys("$uper12");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		System.out.println("dashboard is open ");
		Actions obj = new Actions(driver);
		obj.moveToElement(driver.findElement(By.linkText("Vendor Details"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Vendor")).click();
        
	}
}
