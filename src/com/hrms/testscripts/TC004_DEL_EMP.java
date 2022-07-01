package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC004_DEL_EMP {
     public static void main(String args[]) {
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
