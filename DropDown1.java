package Selenium11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.findElement(By.id("myInput")).sendKeys("p");
		List<WebElement> list = driver.findElements(By.cssSelector("#myInputautocomplete-list >div"));
		for (int i = 0; i < list.size(); i++) {
			// System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals("Pizza")) {
				list.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("submit-button")).click();
		if (driver.getCurrentUrl().contains("Pizza")) {
			System.out.println("Testcase pass");
		}else {
			System.out.println("Test case fail");
		}

		Thread.sleep(3000);
		driver.quit();
	}

}
