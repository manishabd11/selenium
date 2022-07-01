package com.hrms.lib;

import org.openqa.selenium.By;




import com.hrms.utility.Log;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class General extends Global{
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver3\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application open");
		Reporter.log("Application open");
		Log.info("Application open");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		Log.info("Application closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login complete");
		Log.info("Logout completed");
	}
	public void enterFrame() {
		driver.switchTo().frame(frame);
		System.out.println("Enter into frame");
		Log.info("enter into frame");
		
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from Frame");
		Log.info("exit from frame");
	}
	public void addNewEmp () {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
        driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
        driver.findElement(By.id(btn_save)).click();
        System.out.println("New employee added");
        Log.info("add new emp");
		
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout completed");
		Log.info("logout completed");
	}
	 public void searchempid() {
		Select st = new Select(driver.findElement(By.name(search_for)));
		st.selectByValue("0");
		driver.findElement(By.name(search_by)).sendKeys(EID);
		driver.findElement(By.xpath(btn_search)).click();
		System.out.println("search emp");
	 }
	 public void checkbox() {
		driver.findElement(By.xpath(btn_check)).click();
		driver.findElement(By.xpath(click_name)).click();
		System.out.println("checkbox click completed");
		
	 }
	 public void editemp() {
		 driver.findElement(By.name(edit_btn)).click();
		 driver.findElement(By.id(btn_radio)).click();
		 driver.findElement(By.name(txt_middlename)).sendKeys(EMN);
		 driver.findElement(By.name(btn_sav)).click();
		 driver.findElement(By.xpath(edit_photo)).click();
		 driver.findElement(By.name(btn_file)).sendKeys(file_upload);
		 driver.findElement(By.xpath(btn_saved)).click();
		 System.out.println("edit employee complted");
		 
	 }
	 public void delemp() {
		 driver.findElement(By.xpath(btn_check)).click();
		 driver.findElement(By.xpath(btn_delete)).click();
		 System.out.println("employee deleted");
		 
		
	}

}
