package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALT_Chechbox {
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver check = new ChromeDriver();
		check.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(check.getTitle());
		check.findElement(By.name("txtUserName")).sendKeys("admin");
		check.findElement(By.name("txtPassword")).sendKeys("admin");
		check.findElement(By.name("Submit")).click();
		System.out.println("Login comleted");
		Thread.sleep(3000);
		check.switchTo().frame("rightMenu");
		for(int i=1;i<=10;i=i+2) {
		check.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		Thread.sleep(3000);
		System.out.println("clicked on check of " + i );
	}
		check.switchTo().defaultContent();
		check.findElement(By.linkText("Logout")).click();
		check.close();
    }
	}
