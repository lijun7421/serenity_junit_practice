package starter.veevaPractice;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class SearchActions extends UIInteractions {
    @Step("Search by keyword '{1}'")
    public void searchBy(String path, String keyword) {
        $(path).sendKeys(keyword, Keys.ENTER);
    }
}
