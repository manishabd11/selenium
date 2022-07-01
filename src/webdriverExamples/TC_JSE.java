package webdriverExamples;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_JSE {
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver2\\chromedriver.exe");
		WebDriver jse = new ChromeDriver();
		jse.manage().window().maximize();
		jse.get("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(jse.getTitle());
		jse.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
		jse.findElement(By.name("txtPassword")).sendKeys("admin");
		WebElement loginbtn = jse.findElement(By.name("Submit"));
		JavascriptExecutor executor = (JavascriptExecutor)jse;
		executor.executeScript("arguments[0].click()", loginbtn);
		Thread.sleep(3000);
		System.out.println("Login completed");
		WebElement logout = jse.findElement(By.linkText("Logout"));
		JavascriptExecutor executor1 = (JavascriptExecutor)jse;
		executor1.executeScript("arguments[0].click()", logout);
		System.out.println("Logout completed");
		jse.close();
		
		
		
		
		
	}

}
