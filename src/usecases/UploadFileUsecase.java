package usecases;

import testcases.UploadFile;

public class UploadFileUsecase {

	public void run_testcase() throws Exception {
		UploadFile uploadfile = new UploadFile();
		
		uploadfile.initiateDriverInstance();
		uploadfile.tc_upload_file_1();
		uploadfile.closeDriverInstance();

		uploadfile.initiateDriverInstance();
		uploadfile.tc_upload_file_2();
		uploadfile.closeDriverInstance();

		uploadfile.initiateDriverInstance();
		uploadfile.tc_upload_file_3();
		uploadfile.closeDriverInstance();

		uploadfile.initiateDriverInstance();
		uploadfile.tc_upload_file_4();
		uploadfile.closeDriverInstance();
	}
}
