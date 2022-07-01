package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC004 {
	@Test
	public void tc004() {
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.searchempid();
		obj.delemp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
	}

}
