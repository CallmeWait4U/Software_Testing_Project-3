package main;

import usecases.ResponseTimeSearchingStudentGradeUsecase;
import usecases.AddALTIExternalToolUsecase;
import usecases.AddCategoryUsecase;
import usecases.GradingUsecase;
import usecases.ResponseTimeSearchingForumsUsecase;
import usecases.SubmitTextUsecase;
import usecases.UploadFileUsecase;
import usecases.FindCourseUsecase;
import usecases.AddTopicToForumUsecase;

public class MainClass {
	
	public static void main(String args[]) throws Exception {
		// Usecase: Upload File
		UploadFileUsecase uploadfile = new UploadFileUsecase();
		// uploadfile.run_testcase();
		
		// Usecase: Grading
		GradingUsecase grading = new GradingUsecase();
		// grading.run_testcase();
		
		// Usecase: Add a Category
		AddCategoryUsecase addCategory = new AddCategoryUsecase();
//		addCategory.run_testcase();
		
		// Usecase: Response Time Searching Forums
		ResponseTimeSearchingForumsUsecase responseTimeSearchingForums = new ResponseTimeSearchingForumsUsecase();
//		responseTimeSearchingForums.run_testcase();

		// Usecase: Find course
		FindCourseUsecase findCourse = new FindCourseUsecase();
		// findCourse.run_testcase();

		// Usecase: Add topic to forum
		AddTopicToForumUsecase addTopicToForum = new AddTopicToForumUsecase();
		// addTopicToForum.run_testcase();

		// Usecase: Add a LTI External Tool
		AddALTIExternalToolUsecase addALTIExternalTool = new AddALTIExternalToolUsecase();
		// addALTIExternalTool.run_testcase();

		// Usecase: Submit text
		SubmitTextUsecase submitText = new SubmitTextUsecase();
		// submitText.run_testcase();

		// Usecase: Response Time Searching Student Grade
		ResponseTimeSearchingStudentGradeUsecase responseTimeSearchingStudentGrade = new ResponseTimeSearchingStudentGradeUsecase();
		// responseTimeSearchingStudentGrade.run_testcase();
	}
}