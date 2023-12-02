package usecases;

import testcases.Grading;

public class GradingUsecase {
	
	public void run_testcase() throws Exception {
		Grading grading = new Grading();
		
		grading.initiateDriverInstance();
		grading.tc_grading_1();
		grading.closeDriverInstance();
		
		grading.initiateDriverInstance();
		grading.tc_grading_2();
		grading.closeDriverInstance();
		
		grading.initiateDriverInstance();
		grading.tc_grading_3();
		grading.closeDriverInstance();
		
		grading.initiateDriverInstance();
		grading.tc_grading_4();
		grading.closeDriverInstance();
		
		grading.initiateDriverInstance();
		grading.tc_grading_5();
		grading.closeDriverInstance();
		
		grading.initiateDriverInstance();
		grading.tc_grading_6();
		grading.closeDriverInstance();
		
		grading.initiateDriverInstance();
		grading.tc_grading_7();
		grading.closeDriverInstance();
	}

}
