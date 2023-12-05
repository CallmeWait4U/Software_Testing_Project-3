package main;

import usecases.AddCategoryUsecase;
import usecases.GradingUsecase;
import usecases.ResponseTimeSearchingForumsUsecase;
import usecases.UploadFileUsecase;
import usecases.FindCourseUsecase;
<<<<<<< HEAD
import usecases.MultiLanguageUsecase;
=======
>>>>>>> 21a8fbefcc2f4e41959d883d7866f45aee49fc92

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

		// Usecase: Find course
		FindCourseUsecase findCourse = new FindCourseUsecase();
		// findCourse.run_testcase();


		// Usecase: Multi language
		MultiLanguage multilanguage = new MultiLanguage();
		// multilanguage.run_testcase();
	}
}