package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;



import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TS001 {
	@Test
	public void ts001() {
		DOMConfigurator.configure("Log4j.xml");
		General obj = new General();
			obj.openApplication();
			obj.login();
			obj.logout();
			obj.closeApplication();
			
			}
	}


