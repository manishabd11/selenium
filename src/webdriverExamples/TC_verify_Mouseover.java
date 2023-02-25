package webdriverExamples;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC_verify_Mouseover {
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String un = "nareshit";
	static String pw = "nareshit";
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver,jar\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		if(driver.getTitle().equals("OrangeHRM - New Level Of HR Management")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		Thread.sleep(4000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(4000);
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		Actions obj = new Actions(driver);
		obj.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("mouseover completed");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Clicked on Submenu");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
	

}
