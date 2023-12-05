package usecases;

import testcases.Message;

public class MessageUsecase {
	public void run_testcase() throws Exception {
		Message message = new Message();
		
		message.initiateDriverInstance();
		message.tc_message_1();
		message.closeDriverInstance();
		
		message.initiateDriverInstance();
		message.tc_message_2();
		message.closeDriverInstance();
	}
}
