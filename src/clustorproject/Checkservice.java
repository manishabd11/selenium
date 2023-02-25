package clustorproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkservice {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.clustorcomputing.com/");
		Thread.sleep(3000);
		System.out.println("page is open");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/div[1]/ul/li/a")).click();
		Thread.sleep(3000);
		System.out.println("About is open");
		Thread.sleep(4000);
		driver.findElement(By.name("name")).sendKeys("manisha");
		driver.findElement(By.name("email")).sendKeys("maniereybb@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("6535742457");
		driver.findElement(By.name("message")).sendKeys("tell me more about course");
		Thread.sleep(3000);
		driver.close();
		
	}

}
