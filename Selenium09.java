package Selenium11;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();

//		WebElement sd = driver.findElement(By.id("radio-button-selected-disabeled"));
//		List<WebElement> rd = sd.findElements(By.cssSelector("input[name='vegetable']"));
//		for (int i = 0; i < rd.size(); i++) {
//			// System.out.println(rd.get(i).getAttribute("value"));
//			if (rd.get(i).isDisplayed()) {
//				System.out.println("Test case fail");
//			} else {
//				System.out.println("Test case pass");
//			}
//
//		}

		// Test case 1 for Lettuce

		WebElement lt = driver.findElement(By.cssSelector("input[value='lettuce']"));
		if (lt.isEnabled()) {
			System.out.println("Test case for Lettuce pass");
		} else {
			System.out.println("Test cass for Lettuce fail");
		}
		// Test case 2 for Cabbage

		WebElement cb = driver.findElement(By.cssSelector("input[value='cabbage']"));
		if (!cb.isEnabled()) {
			System.out.println("Test case for cabbage pass");
		} else {
			System.out.println("Test cass for cabbage fail");
		}

		// Test Case for Pumpkin

		WebElement pm = driver.findElement(By.cssSelector("input[value= 'pumpkin']"));
		if (pm.isSelected()) {
			System.out.println("Test case for pumpkin pass");
		} else {
			System.out.println("Test cass for pumpkin fail");
		}

		driver.quit();
	}
}
