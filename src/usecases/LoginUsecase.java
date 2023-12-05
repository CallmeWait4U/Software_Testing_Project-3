package usecases;

import testcases.Login;

public class LoginUsecase {
	public void run_testcase() throws Exception {
		Login login = new Login();
		
		login.initiateDriverInstance();
		login.tc_login_1();
        login.closeDriverInstance();
        
        login.initiateDriverInstance();
		login.tc_login_2();
        login.closeDriverInstance();
        
        login.initiateDriverInstance();
		login.tc_login_3();
        login.closeDriverInstance();
	
        login.initiateDriverInstance();
		login.tc_login_4();
        login.closeDriverInstance();
	
        login.initiateDriverInstance();
		login.tc_login_5();
        login.closeDriverInstance();
        
        login.initiateDriverInstance();
		login.tc_login_6();
        login.closeDriverInstance();
        
        login.initiateDriverInstance();
		login.tc_login_7();
        login.closeDriverInstance();
        
        login.initiateDriverInstance();
		login.tc_login_8();
        login.closeDriverInstance();
	}
	
}
