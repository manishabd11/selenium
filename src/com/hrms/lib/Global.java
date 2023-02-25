package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
   public WebDriver driver;
   public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
   //*****Test data********
   public String username      = "admin";
   public String password      = "admin";
   public String EFN           = "ovee";
   public String ELN           = "bharadkar";
   public String  EID           = "0001";
   public String   EMN           = "baba";
   public String  file_upload   = "D:\\selenium driver,jar\\photofile\\mani.jpg";
   
   
   
   //*********objects*****
   public String txt_loginname = "txtUserName";
   public String txt_password  = "txtPassword";
   public String btn_login     = "Submit";
   public String frame         = "rightMenu";
   public String link_logout   = "Logout";
   public String btn_Add       = "//input[@value='Add']";
   public String txt_EFN       = "txtEmpFirstName";
   public String txt_ELN       = "txtEmpLastName";
   public String btn_save      = "btnEdit";
   public String search_for    = "loc_code";
   public String search_by     = "loc_name";
   public String btn_search    = "//*[@id=\"standardView\"]/div[2]/input[2]";
   public String btn_check     = "//*[@id=\"standardView\"]/table/tbody/tr/td[1]/input";
   public String click_name    = "//*[@id='standardView']/table/tbody/tr/td[3]/a";
   public String edit_btn      = "EditMain";
   public String btn_radio     = "gender2";
   public String txt_middlename = "txtEmpMiddleName";
   public String edit_photo    = "//*[@id=\"photodiv\"]/img";
   public String btn_sav       = "EditMain";
   public String btn_delete    = "//input[@value='Delete']";
   public String btn_file      = "photofile";
   public String btn_saved     = "//*[@id=\"photo\"]/div[1]/div[2]/div[2]/div/input";
   
   }
