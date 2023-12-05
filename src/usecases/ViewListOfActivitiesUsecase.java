package usecases;

import testcases.ViewListOfActivities;

public class ViewListOfActivitiesUsecase {

	public void run_testcase() throws Exception {
		ViewListOfActivities viewListOfActivities = new ViewListOfActivities();
		
		viewListOfActivities.initiateDriverInstance();
		viewListOfActivities.tc_view_activities_1();
		viewListOfActivities.closeDriverInstance();

		viewListOfActivities.initiateDriverInstance();
		viewListOfActivities.tc_view_activities_2();
		viewListOfActivities.closeDriverInstance();

		viewListOfActivities.initiateDriverInstance();
		viewListOfActivities.tc_view_activities_3();
		viewListOfActivities.closeDriverInstance();
	}
}
