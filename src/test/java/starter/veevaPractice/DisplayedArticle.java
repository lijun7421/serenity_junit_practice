package starter.veevaPractice;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;

public class DisplayedArticle extends PageComponent {
    public String getFirstHeading() {
        WebElementFacade heading = findBy("//h1");
        return heading.getText();
    }
}
