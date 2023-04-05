package Selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "ParaBank | Welcome | Online Banking";
		if (actualTitle.equals(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");

		String URL = driver.getCurrentUrl();
		if (URL.contains("https://parabank.parasoft.com/parabank/index.htm")) {
			System.out.println("Test case for URL passed.");
		} else {
			System.out.println("Test case for URL failed.");
		}

		driver.close();
		driver.quit();
	}

}
