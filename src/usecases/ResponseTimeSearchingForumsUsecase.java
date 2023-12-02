package usecases;

import testcases.ResponseTimeSearchingForums;

public class ResponseTimeSearchingForumsUsecase {
	
	public void run_testcase() throws Exception {
		ResponseTimeSearchingForums responseTimeSearchingForums = new ResponseTimeSearchingForums();
		
		responseTimeSearchingForums.initiateDriverInstance();
		responseTimeSearchingForums.tc_response_time_searching_forums_1();
		responseTimeSearchingForums.closeDriverInstance();
		
		responseTimeSearchingForums.initiateDriverInstance();
		responseTimeSearchingForums.tc_response_time_searching_forums_2();
		responseTimeSearchingForums.closeDriverInstance();
	}

}
