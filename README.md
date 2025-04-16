# Sample Mobile Framework

Note:
1. Please download the apk and place it under /src/apps/android/ with the file name renamed to androidAPP.apk
2. I have added a screenshot method which will capture the screenshots when any test case failes sample-mobile-framework_Local/screenshots
3. Screenshots are captured along with the testcase name and timestamp
4. There are 2 testcases in the sampleTest java
     a. one test case where it verifiy all the elements from the home page
     b. I'm intentionally failing the test case to verify that screenshots are captured upon failure.
5. Added generic methods in BasePage.Java file waitForVisibility and waitForVisibility. (We can add more generic methods here like Entering text, scroll, swipe etc. )
6. Also as a security concern over the app, I could not proceeed further with the other tests. I was not able to inspect elemets due to FLAG_SECURE enabled. 
