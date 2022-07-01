package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String ergs[])throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		driver.findElement(By.name("email")).sendKeys("manishadhodare@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("kutiya3");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//span[contains(text(),'Friends')]")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@aria-label='Your profile']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();
		driver.close();
		
		
	}

}
