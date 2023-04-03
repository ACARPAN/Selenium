package Selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdrive.chrome.driver", " C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		/* second set of methods */
		// isDisplayed()
		// boolean eleDis =
		// driver.findElement(By.cssSelector("h2[name=\"contactme\"]")).isDisplayed();
		// System.out.println(eleDis);
		// driver.close();

		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		boolean isEn = driver.findElement(By.cssSelector("input[value='cabbage']")).isEnabled();
		boolean isEn2 = driver.findElement(By.cssSelector("input[value='pumpkin']")).isEnabled();
		System.out.println(isEn);
		System.out.println(isEn2);
		
		// isSelected
		driver.findElement(By.cssSelector("input[value='green']")).click();
		boolean isSel = driver.findElement(By.cssSelector("input[value='green']")).isSelected();
		boolean isSel2 = driver.findElement(By.cssSelector("input[value='blue']")).isSelected();
		System.out.println(isSel);
		System.out.println(isSel2);
		driver.quit();

	}

}
