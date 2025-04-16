package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class SamplePage extends BasePage {

	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"CreateNewWalletButton\"]")  // Replace with actual ID
    public WebElement createWalletButton;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"ImportWalletButton\"]/android.widget.Button\r\n")
	public WebElement importWalletButton;
	
	@AndroidFindBy(xpath = "@AndroidFindBy(xpath = \"//android.widget.TextView[contains(@text,'Own')]\")")
	public WebElement termsandConditons;
	
	//Declared a dummy text to fail the test case
	@AndroidFindBy(xpath = "@AndroidFindBy(xpath = \"//android.widget.TextView[contains(@text,'TestingTrustWallet')]\")")
	public WebElement dummyText;
	
    public boolean areAllElementsVisibleWelcomeScreen() {
    	List<WebElement> elements = new ArrayList<>();
        elements.add(createWalletButton);
        elements.add(importWalletButton);
        elements.add(termsandConditons);

        for (WebElement element : elements) {
            try {
                waitForVisibility(element, 10); // ⏱ Wait up to 10 seconds for visibility
                if (!element.isDisplayed()) {
                    System.err.println("Element not visible: " + element);
                    return false;
                }
            } catch (Exception e) {
                System.err.println("Exception waiting for element: " + element + "\n" + e.getMessage());
                return false;
            }
        }
        return true;
    }
    public boolean areWalletButtonsClickable() {
        try {
            waitForClickability(createWalletButton, 10);
            waitForClickability(importWalletButton, 10);
            return createWalletButton.isEnabled() && importWalletButton.isEnabled();
        } catch (Exception e) {
            System.err.println("One or both buttons not clickable: " + e.getMessage());
            return false;
        }
    }
    
    public void VerifyScreenShotForFailure() {
    	waitForClickability(dummyText, 10);
    }
}
