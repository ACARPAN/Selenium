package Selenium11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement gElement = driver.findElement(By.cssSelector("input[value ='green']"));
		WebElement bElement = driver.findElement(By.cssSelector("input[value ='blue']"));
		gElement.click();
		if (gElement.isSelected()) {
			System.out.println("Testcase 1 pass");
			if (!(bElement.isSelected())) {
				System.out.println("Test case pass");
			} else {
				System.out.println("Test case fail");
			}
		}

		// Radio buttons

		WebElement box1 = driver.findElement(By.id("radio-buttons"));
		List<WebElement> rb = box1.findElements(By.cssSelector("input[type='radio']"));
		for (int i = 0; i < rb.size(); i++) {
			// System.out.println(rd.get(i).getAttribute("value"));
			rb.get(i).click();
		}

		// Checkbox
		
		List<WebElement> cb = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		for (int i = 0; i < cb.size(); i++) {
			if (cb.get(i).isSelected()) {
				System.out.println("Already selected");
			} else {
				cb.get(i).click();
			}

		}

		for (int i = 0; i < cb.size(); i++) {
			System.out.println(cb.get(i).isSelected());

		}

		driver.close();
	}
}