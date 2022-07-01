package webdriverExamples;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_Variable {
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String un = "nareshit";
	static String pw = "nareshit";
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		if(driver.getTitle().equals("OrangeHRM-New Level of HRM Management")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(3000);
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();
	}

}
