package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_FileUpload {
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver.exe");
		WebDriver file = new ChromeDriver();
		file.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		file.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		file.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		file.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		file.switchTo().frame("rightMenu");
		file.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(2000);
		file.findElement(By.xpath("//input[@id='txtEmpFirstName']")).sendKeys("arshu");
		file.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("sele");
		WebElement fileinput = file.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
		fileinput.sendKeys("D:\\selenium driver,jar\\photofile\\bird.jpg");
		Thread.sleep(3000);
		System.out.println("file upload successfully");
		file.findElement(By.xpath("//input[@id='btnEdit']")).click();
		Thread.sleep(3000);
		System.out.println("New EmployeeAdded");
		file.switchTo().defaultContent();
		file.findElement(By.linkText("Logout")).click();
		file.close();
		}

}
