package usecases;

import testcases.AddCategory;

public class AddCategoryUsecase {
	
	public void run_testcase() throws Exception {
		AddCategory addCategory = new AddCategory();
		
		addCategory.initiateDriverInstance();
		addCategory.tc_add_category_1();
		addCategory.closeDriverInstance();
		
		addCategory.initiateDriverInstance();
		addCategory.tc_add_category_2();
		addCategory.closeDriverInstance();
		
		addCategory.initiateDriverInstance();
		addCategory.tc_add_category_3();
		addCategory.closeDriverInstance();
		
		addCategory.initiateDriverInstance();
		addCategory.tc_add_category_4();
		addCategory.closeDriverInstance();
	}

}
