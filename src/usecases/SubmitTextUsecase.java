package usecases;

import testcases.SubmitText;

public class SubmitTextUsecase {
        
        public void run_testcase() throws Exception {
            SubmitText submitText = new SubmitText();
            
            submitText.initiateDriverInstance();
            submitText.tc_submit_text_1();
            submitText.closeDriverInstance();
            
            submitText.initiateDriverInstance();
            submitText.tc_submit_text_2();
            submitText.closeDriverInstance();

            submitText.initiateDriverInstance();
            submitText.tc_submit_text_3();
            submitText.closeDriverInstance();

            submitText.initiateDriverInstance();
            submitText.tc_submit_text_4();
            submitText.closeDriverInstance();

            submitText.initiateDriverInstance();
            submitText.tc_submit_text_5();
            submitText.closeDriverInstance();
        }
}