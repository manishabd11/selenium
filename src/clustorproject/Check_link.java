package clustorproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_link {
	public static void main (String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/");
		Thread.sleep(3000);
		System.out.println("gmail login page is open ");
	
		driver.findElement(By.name("identifier")).sendKeys("manishadhodare@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]")).click();
		driver.findElement(By.name("password")).sendKeys("howrumani");
		
		
		}
	
	

}
