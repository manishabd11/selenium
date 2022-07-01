package database;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_db {
	public static void main (String args[]) throws Exception {
		String dburl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String dbun    = "system";
		String dbpw    = "manisha";
		Connection con = DriverManager.getConnection(dburl,dbun,dbpw);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from login01");
		while(rs.next()) {
			String un = rs.getString(1);
			String pw = rs.getString(2);
			System.out.println(un);
			System.out.println(pw);
			System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
			driver.findElement(By.name("txtUserName")).sendKeys(un);
			driver.findElement(By.name("txtPassword")).sendKeys(pw);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			System.out.println("login completed");
			driver.findElement(By.linkText("Logout")).click();
			driver.close();
		}
		rs.close();
		st.close();
		con.close();
		}

        }
