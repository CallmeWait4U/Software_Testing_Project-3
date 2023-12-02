package main;

import usecases.AddCategoryUsecase;
import usecases.GradingUsecase;
import usecases.ResponseTimeSearchingForumsUsecase;
import usecases.UploadFileUsecase;

public class MainClass {
	
	public static void main(String args[]) throws Exception {
		// Usecase: Upload File
		UploadFileUsecase uploadfile = new UploadFileUsecase();
//		uploadfile.run_testcase();
		
		// Usecase: Grading
		GradingUsecase grading = new GradingUsecase();
//		grading.run_testcase();
		
		// Usecase: Add a Category
		AddCategoryUsecase addCategory = new AddCategoryUsecase();
//		addCategory.run_testcase();
		
		// Usecase: Response Time Searching Forums
		ResponseTimeSearchingForumsUsecase responseTimeSearchingForums = new ResponseTimeSearchingForumsUsecase();
//		responseTimeSearchingForums.run_testcase();
	}

}
