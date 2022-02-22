package starter.veevaPractice;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ButtonActions extends UIInteractions {

    @Step("Click button")
    public void clickButton(String buttonPath) {
        WebElementFacade button = findBy(buttonPath);
//        button.click();
        waitForCondition().until(ExpectedConditions.elementToBeClickable(button)).click();

    }
}
