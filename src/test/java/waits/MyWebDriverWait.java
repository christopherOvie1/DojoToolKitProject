package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.TestBase;

import static org.eclipse.jetty.client.AuthenticationProtocolHandler.LOG;

public class MyWebDriverWait extends TestBase {
	
	WebDriverWait  wait;
	public static void waitForElementToBeVisible(WebElement element, int Time) {

		WebDriverWait wait = new WebDriverWait(driver, Time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

    public static void waitForElementToBeVisibleByAttributeValue(By locator, String attribute, String text, int Time) {

        WebDriverWait wait = new WebDriverWait(driver, Time);
        wait.until(x -> x.findElement(locator).getAttribute(attribute).contains(text));

	    }
}
