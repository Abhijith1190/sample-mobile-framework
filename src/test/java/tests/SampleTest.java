package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SamplePage;

public class SampleTest extends BaseTest {

	@Test(description = "Validate app launch and presence of Create Wallet button")
    public void sampleTest() {
        SamplePage samplePage = new SamplePage();

        samplePage.areAllElementsVisibleWelcomeScreen();
        System.out.println("All Home Screen button are visible. App launched successfully.");
        samplePage.areWalletButtonsClickable();
        System.out.println("'Create Wallet'and 'I already have wallet' buttons are visible and clickable");
    }
	
	@Test(description = "Validate Screenshot Feature when Test Case Failes")
    public void failingTestCase() {
        SamplePage samplePage = new SamplePage();
        samplePage.VerifyScreenShotForFailure();
    }
}