package webdriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_All_prog {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver,jar\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(3000);
		System.out.println("url done");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(a.getText());
		Thread.sleep(3000);
		a.accept();
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("login completed");
		Actions obj = new Actions(driver);
		obj.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		Thread.sleep(3000);
		System.out.println("mouseover is completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("arsh");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("selenium");
		WebElement fileInput = driver.findElement(By.name("photofile"));
		Thread.sleep(3000);
		fileInput.sendKeys("D:\\selenium driver,jar\\photofile\\manisha.jpg");
		Thread.sleep(4000);
		driver.findElement(By.id("btnEdit")).click();
		driver.switchTo().defaultContent();
		System.out.println("Employee added");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");
		driver.close();
		}
        }
