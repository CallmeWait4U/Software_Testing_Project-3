package usecases;

import testcases.MultiLanguage;

public class MultiLanguageUsecase {
    public void run_testcase() throws Exception {
        MultiLanguage multilanguage = new MultiLanguage();

        multilanguage.initiateDriverInstance();
        multilanguage.tc_multilanguage_1();
        multilanguage.closeDriverInstance();

        multilanguage.initiateDriverInstance();
        multilanguage.tc_multilanguage_2();
        multilanguage.closeDriverInstance();

        multilanguage.initiateDriverInstance();
        multilanguage.tc_multilanguage_3();
        multilanguage.closeDriverInstance();

        multilanguage.initiateDriverInstance();
        multilanguage.tc_multilanguage_4();
        multilanguage.closeDriverInstance();
    }
}