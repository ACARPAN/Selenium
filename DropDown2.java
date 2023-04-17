package Selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.findElement(By.id("myInput")).sendKeys("p");
		driver.findElement(By.id("myInput")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("myInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("submit-button")).click();
		if (driver.getCurrentUrl().contains("Pizza")) {
			System.out.println("Testcase pass");
		}

		driver.quit();

	}

}
