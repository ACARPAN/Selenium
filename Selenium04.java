package Selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Arrange

		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Action
		// WebElement username=driver.findElement(By.cssSelector("input[placeholder='Username']"));
		// WebElement password =driver.findElement(By.cssSelector("input[placeholder='Password']"));
		// WebElement loginButton=driver.findElement(By.cssSelector("button[type='submit']"));

		// valid credentials

		// username.sendKeys("Admin");
		// password.sendKeys("admin123");
		// loginButton.click();
		// Thread.sleep(3000);

		// Assertion

		WebElement hrm = driver.findElement(By.cssSelector("div[class=\"orangehrm-login-branding\"]"));
		if (hrm.isDisplayed()) {
			System.out.println("test case pass");
		} else {
			System.out.println("testcase fail");
		}
		driver.quit();

	}

}
