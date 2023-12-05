package main;

import usecases.AddCategoryUsecase;
import usecases.GradingUsecase;
import usecases.ResponseTimeSearchingForumsUsecase;
import usecases.UploadFileUsecase;
import usecases.FindCourseUsecase;
import usecases.EditProfileUsecase;
import usecases.SortFilterActivitiesUsecase;
import usecases.ViewListOfActivitiesUsecase;
import usecases.MultiLanguageUsecase;
import usecases.SendMessageUsecase;

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

		// Usecase: Edit profile
		EditProfileUsecase editProfile = new EditProfileUsecase();
		// editProfile.run_testcase();

		// Usecase: Sort filter activities
		SortFilterActivitiesUsecase sortFilterActivities = new SortFilterActivitiesUsecase();
		// sortFilterActivities.run_testcase();

		// Usecase: View list of activities
		ViewListOfActivitiesUsecase viewListOfActivities = new ViewListOfActivitiesUsecase();
		// viewListOfActivities.run_testcase();

		// Usecase: Multi language
		MultiLanguageUsecase multilanguage = new MultiLanguageUsecase();
		// multilanguage.run_testcase();

		// Usecase: Send message
		SendMessageUsecase sendmessage = new SendMessageUsecase();
		// sendmessage.run_testcase();
	}
}