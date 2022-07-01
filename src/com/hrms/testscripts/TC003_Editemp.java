package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC003_Editemp {
	public static void main(String args[]) {
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


