package usecases;

import testcases.ResponseTimeSearchingStudentGrade;

public class ResponseTimeSearchingStudentGradeUsecase {
            
            public void run_testcase() throws Exception {
                ResponseTimeSearchingStudentGrade responseTimeSearchingStudentGrade = new ResponseTimeSearchingStudentGrade();
                
                responseTimeSearchingStudentGrade.initiateDriverInstance();
                responseTimeSearchingStudentGrade.tc_response_time_searching_student_grade_1();
                responseTimeSearchingStudentGrade.closeDriverInstance();
                
                responseTimeSearchingStudentGrade.initiateDriverInstance();
                responseTimeSearchingStudentGrade.tc_response_time_searching_student_grade_2();
                responseTimeSearchingStudentGrade.closeDriverInstance();
            }
}
