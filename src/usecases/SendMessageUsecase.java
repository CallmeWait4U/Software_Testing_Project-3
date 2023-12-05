package usecases;

import testcases.SendMessage;

public class SendMessageUsecase {
    public void run_testcase() throws Exception {
        SendMessage sendmessage = new SendMessage();

        sendmessage.initiateDriverInstance();
        sendmessage.tc_sendmessage_1();
        sendmessage.closeDriverInstance();

        sendmessage.initiateDriverInstance();
        sendmessage.tc_sendmessage_2();
        sendmessage.closeDriverInstance();

        sendmessage.initiateDriverInstance();
        sendmessage.tc_sendmessage_3();
        sendmessage.closeDriverInstance();
    }
}