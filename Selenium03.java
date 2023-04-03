package Selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Arrange

		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Test case 1
		// Action

		WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

		// valid credentials

		//username.sendKeys("Admin");
		//password.sendKeys("admin123");
		//loginButton.click();
		//Thread.sleep(3000);
		//WebElement logo = driver.findElement(By.cssSelector("img[alt='client brand banner']"));

		// Assertion
		//boolean logoDisplayed = logo.isDisplayed();

		//if (logoDisplayed) {
			//System.out.println("Test case pass");
		//} else {
		//	System.out.println("Test case fail");
		//}

		// Test case 2
		// Invalid Credentials

		// Actions
		username.sendKeys("bala");
		password.sendKeys("bby");
		loginButton.click();
		
		// Assertion
		
		Thread.sleep(3000);
		WebElement errorMsg = driver.findElement(By.cssSelector("i[class='oxd-icon bi-exclamation-circle oxd-alert-content-icon']"));
		boolean err = errorMsg.isDisplayed();
		if (err) {
			System.out.println("Testcase pass");
		} else {
			System.out.println("Test case fail");
		}

		driver.close();

	}

}
