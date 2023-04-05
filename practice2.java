package Selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Test case 1: By cssSelector
		boolean cssSelector = driver.findElement(By.cssSelector("input[type=\"text\"]")).isDisplayed();

		if (cssSelector) {
			System.out.println("Test case 1 pass");
		} else {
			System.out.println("Test case 1 fail");
		}

		// Test case 2:By Name
		boolean Name = driver.findElement(By.name("login")).isDisplayed();

		if (Name) {
			System.out.println("Test case 2 pass");
		} else {
			System.out.println("Test case 2 fail");
		}

		// Test case 3:By className
		boolean className = driver.findElement(By.className("Solutions")).isDisplayed();

		if (className) {
			System.out.println("Test case 3 pass");
		} else {
			System.out.println("Test case 3 fail");
		}
		// Test case 4:By LinkText
		boolean location = driver.findElement(By.linkText("Products")).isDisplayed();

		if (location) {
			System.out.println("Test case 4 pas");
		} else {
			System.out.println("Test case 4 fail");
		}
		// Test case 5:By Id
		boolean id = driver.findElement(By.id("headerPanel")).isDisplayed();

		if (id) {
			System.out.println("Test case 5 pass.");
		} else {
			System.out.println("Test case 5 fail.");
		}
		driver.close();
		driver.quit();

	}

}
