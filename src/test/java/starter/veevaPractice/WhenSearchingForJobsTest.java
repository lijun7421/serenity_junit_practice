package starter.veevaPractice;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingForJobsTest {

    /**
     * Define the webdriver instance to be used for these tests
     */
    @Managed(driver = "chrome", options = "headless")
    WebDriver driver;

    NavigateActions navigate;

    SearchActions search;

    ButtonActions button;

    DisplayedArticle displayedArticle;

    final String keyword = "Associate Automation Engineer";

    @Test
    void navigateAndSearchKeyword() {
        navigate.toTheHomePage();

        search.searchBy("#cws_jobsearch_keywords", keyword);
        button.clickButton("//*[@id='cn-accept-cookie']");

//        button.clickButton("//input[@value='QA & Release Engineering']");
//            button.clickButton("//input[@value='Canada']");

        button.clickButton("//*[@id='job-result0']");

        Serenity.reportThat("The opened page should be Associate Automation Engineer job",
                () -> assertThat(displayedArticle.getFirstHeading()).isEqualTo(keyword));
    }
}
