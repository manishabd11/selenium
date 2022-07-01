package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003 {
	@Test
	public void tc003() {
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.searchempid();
		obj.checkbox();
		obj.editemp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
	}

}
