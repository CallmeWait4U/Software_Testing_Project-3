package main;

import usecases.UploadFileUsecase;

public class MainClass {
	
	public static void main(String args[]) throws Exception {
		// Usecase: Upload File
		UploadFileUsecase uploadfile = new UploadFileUsecase();
		uploadfile.run_testcase();
	}

}
