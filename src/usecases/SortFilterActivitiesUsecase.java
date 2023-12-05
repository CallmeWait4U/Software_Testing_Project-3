package usecases;

import testcases.SortFilterActivities;

public class SortFilterActivitiesUsecase {

	public void run_testcase() throws Exception {
		SortFilterActivities sortFilterActivities = new SortFilterActivities();
		
		sortFilterActivities.initiateDriverInstance();
		sortFilterActivities.tc_sort_filter_activities_1();
		sortFilterActivities.closeDriverInstance();

		sortFilterActivities.initiateDriverInstance();
		sortFilterActivities.tc_sort_filter_activities_2();
		sortFilterActivities.closeDriverInstance();

		sortFilterActivities.initiateDriverInstance();
		sortFilterActivities.tc_sort_filter_activities_3();
		sortFilterActivities.closeDriverInstance();
	}
}
