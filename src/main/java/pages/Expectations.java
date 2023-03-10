package pages;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface Expectations {
    List<WebElement> waitVisibilityOfAllElementsLocatedBy(String locator);
    WebElement waitElementToBeClickable(String locator);
}
