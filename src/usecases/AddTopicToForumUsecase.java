package usecases;

import testcases.AddTopicToForum;

public class AddTopicToForumUsecase {
        
        public void run_testcase() throws Exception {
            AddTopicToForum addTopicToForum = new AddTopicToForum();
            
            addTopicToForum.initiateDriverInstance();
            addTopicToForum.tc_add_topic_to_forum_1();
            addTopicToForum.closeDriverInstance();
            
            // addTopicToForum.initiateDriverInstance();
            // addTopicToForum.tc_add_topic_to_forum_2();
            // addTopicToForum.closeDriverInstance();

            // addTopicToForum.initiateDriverInstance();
            // addTopicToForum.tc_add_topic_to_forum_3();
            // addTopicToForum.closeDriverInstance();

            // addTopicToForum.initiateDriverInstance();
            // addTopicToForum.tc_add_topic_to_forum_4();
            // addTopicToForum.closeDriverInstance();
        }
}