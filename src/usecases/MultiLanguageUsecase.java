package usecases;

import testcases.MultiLanguage;

public class MultiLanguageUsecase {
    public void run_testcase() throws Exception {
        MultiLanguage multilanguage = new MultiLanguage();

        multilanguage.initiateDriverInstance();
        multilanguage.tc_findcourse_1();
        multilanguage.closeDriverInstance();

        multilanguage.initiateDriverInstance();
        multilanguage.tc_findcourse_2();
        findcomultilanguageurse.closeDriverInstance();

        multilanguage.initiateDriverInstance();
        multilanguage.tc_findcourse_3();
        findcomultilanguageurse.closeDriverInstance();

        multilanguage.initiateDriverInstance();
        multilanguage.tc_findcourse_4();
        findcomultilanguageurse.closeDriverInstance();
    }
}