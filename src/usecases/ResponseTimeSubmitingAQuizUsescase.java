package usecases;

import testcases.ResponseTimeSubmitingAQuiz;



public class ResponseTimeSubmitingAQuizUsescase {
	public void run_testcase() throws Exception {
		ResponseTimeSubmitingAQuiz responseTimeSubmitingAQuiz = new ResponseTimeSubmitingAQuiz();
		
		responseTimeSubmitingAQuiz.initiateDriverInstance();
		responseTimeSubmitingAQuiz.tc_response_time_submiting_a_quiz_forums_1();
		responseTimeSubmitingAQuiz.closeDriverInstance();
		
		responseTimeSubmitingAQuiz.initiateDriverInstance();
		responseTimeSubmitingAQuiz.tc_response_time_submiting_a_quiz_forums_2();
		responseTimeSubmitingAQuiz.closeDriverInstance();
	}
}
