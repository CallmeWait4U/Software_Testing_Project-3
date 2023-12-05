package main;

import usecases.ResponseTimeSearchingStudentGradeUsecase;
import usecases.AddALTIExternalToolUsecase;
import usecases.AddCategoryUsecase;
import usecases.EditProfileUsecase;
import usecases.FindCourseUsecase;
import usecases.GradingUsecase;
import usecases.MultiLanguageUsecase;
import usecases.ResponseTimeSearchingForumsUsecase;
import usecases.SubmitTextUsecase;
import usecases.UploadFileUsecase;
import usecases.AddTopicToForumUsecase;
import usecases.SendMessageUsecase;
import usecases.SortFilterActivitiesUsecase;
import usecases.ViewListOfActivitiesUsecase;
import usecases.LoginUsecase;
import usecases.MessageUsecase;
import usecases.ResponseTimeSubmitingAQuizUsescase;

public class MainClass {
	
	public static void main(String args[]) throws Exception {
		// Usecase: Upload File
		UploadFileUsecase uploadfile = new UploadFileUsecase();
		uploadfile.run_testcase();
		
		// Usecase: Grading
		GradingUsecase grading = new GradingUsecase();
		grading.run_testcase();
		
		// Usecase: Add a Category
		AddCategoryUsecase addCategory = new AddCategoryUsecase();
		addCategory.run_testcase();
		
		// Usecase: Response Time Searching Forums
		ResponseTimeSearchingForumsUsecase responseTimeSearchingForums = new ResponseTimeSearchingForumsUsecase();
		responseTimeSearchingForums.run_testcase();

		// Usecase: Find course
		FindCourseUsecase findCourse = new FindCourseUsecase();
		findCourse.run_testcase();


		// Usecase: Add topic to forum
		AddTopicToForumUsecase addTopicToForum = new AddTopicToForumUsecase();
		addTopicToForum.run_testcase();

		// Usecase: Add a LTI External Tool
		AddALTIExternalToolUsecase addALTIExternalTool = new AddALTIExternalToolUsecase();
		addALTIExternalTool.run_testcase();

		// Usecase: Submit text
		SubmitTextUsecase submitText = new SubmitTextUsecase();
		submitText.run_testcase();

		// Usecase: Response Time Searching Student Grade
		ResponseTimeSearchingStudentGradeUsecase responseTimeSearchingStudentGrade = new ResponseTimeSearchingStudentGradeUsecase();
		responseTimeSearchingStudentGrade.run_testcase();

		// Usecase: Edit profile
		EditProfileUsecase editProfile = new EditProfileUsecase();
		editProfile.run_testcase();

		// Usecase: Sort filter activities
		SortFilterActivitiesUsecase sortFilterActivities = new SortFilterActivitiesUsecase();
		sortFilterActivities.run_testcase();

		// Usecase: View list of activities
		ViewListOfActivitiesUsecase viewListOfActivities = new ViewListOfActivitiesUsecase();
		 viewListOfActivities.run_testcase();

		// Usecase: Multi language
		MultiLanguageUsecase multilanguage = new MultiLanguageUsecase();
		multilanguage.run_testcase();

		// Usecase: Send message
		SendMessageUsecase sendmessage = new SendMessageUsecase();
		sendmessage.run_testcase();
		
		LoginUsecase login = new LoginUsecase();
		login.run_testcase();
		
		MessageUsecase message = new MessageUsecase();
		message.run_testcase();
		
		ResponseTimeSubmitingAQuizUsescase responseTimeSubmitingAQuizUsescase = new ResponseTimeSubmitingAQuizUsescase();
		responseTimeSubmitingAQuizUsescase.run_testcase();

	}
}