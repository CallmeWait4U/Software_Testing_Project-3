package usecases;

import testcases.AddALTIExternalTool;

public class AddALTIExternalToolUsecase {
        
        public void run_testcase() throws Exception {
            AddALTIExternalTool addALTIExternalTool = new AddALTIExternalTool();
            
            addALTIExternalTool.initiateDriverInstance();
            addALTIExternalTool.tc_add_alti_external_tool_1();
            addALTIExternalTool.closeDriverInstance();
            
            addALTIExternalTool.initiateDriverInstance();
            addALTIExternalTool.tc_add_alti_external_tool_2();
            addALTIExternalTool.closeDriverInstance();

            addALTIExternalTool.initiateDriverInstance();
            addALTIExternalTool.tc_add_alti_external_tool_3();
            addALTIExternalTool.closeDriverInstance();

            addALTIExternalTool.initiateDriverInstance();
            addALTIExternalTool.tc_add_alti_external_tool_4();
            addALTIExternalTool.closeDriverInstance();
        }
}