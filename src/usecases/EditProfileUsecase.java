package usecases;

import testcases.EditProfile;

public class EditProfileUsecase {

	public void run_testcase() throws Exception {
		EditProfile editProfile = new EditProfile();
		
		editProfile.initiateDriverInstance();
		editProfile.tc_edit_profile_1();
		editProfile.closeDriverInstance();

		editProfile.initiateDriverInstance();
		editProfile.tc_edit_profile_2();
		editProfile.closeDriverInstance();

		editProfile.initiateDriverInstance();
		editProfile.tc_edit_profile_3();
		editProfile.closeDriverInstance();

		editProfile.initiateDriverInstance();
		editProfile.tc_edit_profile_4();
		editProfile.closeDriverInstance();

		editProfile.initiateDriverInstance();
		editProfile.tc_edit_profile_5();
		editProfile.closeDriverInstance();
	}
}
