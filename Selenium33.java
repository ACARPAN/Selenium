package Selenium11;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// why we required wait
		// client -- request --- server and create element from response
		// If response is delayed elements are not created
		// So we have wait for element to be created

		// 1) Implicit wait - dynamic in nature
		// 2) Explicit wait - dynamic in nature
		// 3) Thread.sleep() - static in nature
		// 4) Fluent wait() - dynamic in nature

		// Static
		// Thread.sleep(3000) --- 3

		// Dynamic - 5 seconds
		// Element in 3 second ---- continue execution

		// Explicit wait ---- on one particular element

		WebElement w = driver.findElement(By.id("contact-us"));
		WebDriverWait waitE = new WebDriverWait(driver, Duration.ofSeconds(4));
		WebDriverWait waitG = new WebDriverWait(driver, Duration.ofSeconds(6));

		waitE.until(ExpectedConditions.visibilityOf(w));
		waitE.until(ExpectedConditions.elementToBeClickable(w));
		waitG.until(ExpectedConditions.elementToBeClickable(w));

//		alertIsPresent()
//		elementSelectionStateToBe()
//		elementToBeClickable()
//		elementToBeSelected()
//		frameToBeAvaliableAndSwitchToIt()
//		invisibilityOfTheElementLocated()
//		invisibilityOfElementWithText()
//		presenceOfAllElementsLocatedBy()
//		presenceOfElementLocated()
//		textToBePresentInElement()
//		textToBePresentInElementLocated()
//		textToBePresentInElementValue()
//		titleIs()
//		titleContains()
//		visibilityOf()
//		visibilityOfAllElements()
//		visibilityOfAllElementsLocatedBy()
//		visibilityOfElementLocated()

		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ZERO.ofSeconds(5)).withMessage("trying to search Bye")
				.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.elementToBeClickable(w));
		driver.quit();

	}

}
