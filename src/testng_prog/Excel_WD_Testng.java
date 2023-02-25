package testng_prog;

import java.io.File;


import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;

public class Excel_WD_Testng {
	ChromeDriver driver;
	@BeforeClass
	public void start () {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
	     driver = new ChromeDriver();
	}
	@AfterClass
	public void closed () {
		driver.close();
	}
	@Test
	public void TC001 () throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\New data.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet("Sheet1");
		String un = st.getCell(0,1).getContents();
		String pw = st.getCell(1,1).getContents();
		Reporter.log(un);
		Reporter.log(pw);
		
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println("Application open");
	Reporter.log("Application open");
	driver.findElement(By.name("txtUserName")).sendKeys(un);
	driver.findElement(By.name("txtPassword")).sendKeys(pw);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("login completed");
	Reporter.log("login completed");
	Reporter.log(driver.getTitle());
	driver.findElement(By.linkText("Logout")).click();
	Reporter.log("Logout completed");
    }
    }


