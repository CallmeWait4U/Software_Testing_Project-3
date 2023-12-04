package usecases;

import testcases.FindCourse;

public class FindCourseUsecase {
    public void run_testcase() throws Exception {
        FindCourse findcourse = new FindCourse();

        findcourse.initiateDriverInstance();
        findcourse.tc_findcourse_1();
        findcourse.closeDriverInstance();

        findcourse.initiateDriverInstance();
        findcourse.tc_findcourse_2();
        findcourse.closeDriverInstance();
    }
}