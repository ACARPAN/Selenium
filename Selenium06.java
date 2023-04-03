package Selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium06 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Arrange

		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Test Case 1
		WebElement fName = driver.findElement(By.cssSelector("input[name='first_name']"));
		WebElement lName = driver.findElement(By.cssSelector("input[name='last_name']"));
		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
		WebElement comments = driver.findElement(By.cssSelector("textarea[placeholder='Comments']"));
		WebElement reset = driver.findElement(By.cssSelector("input[value ='RESET']"));
		WebElement submit = driver.findElement(By.cssSelector("input[value ='SUBMIT']"));

		// Invalid credentional
		// fName.sendKeys("Anoop");
		// lName.sendKeys("B");
		// email.sendKeys("@gmail.com");
		// comments.sendKeys("not good");
		// submit.click();
		// Thread.sleep(3000);

		// Assertion

		// if (driver.getCurrentUrl().contains("Contact-Us/contact_us.php")) {
		// System.out.println("Test case Pass");
		// }
		// else {
		// System.out.println("Test case Fail");
		// }

		// Test case reset
		fName.sendKeys("Anoop");
		lName.sendKeys("B");
		email.sendKeys("ayub23@gmail.com");
		comments.sendKeys("reset");
		reset.click();

		Thread.sleep(4000);

		// Assertion
		if (fName.getAttribute("value").equals("")) {
			System.out.println("Test case reset Pass");
		} else {
			System.out.println("Test case reset Fail");
		}
		driver.close();
	}

}
