package Selenium11;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// getText()
		// getTagName()
		// getCssValue()
		// getArritbute()
		// getSize()
		// getLocation()

         //Program 1..... getText()
		
		System.setProperty("WebDrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement h = driver.findElement(By.cssSelector("h2"));
		String text = h.getText();
		if (text.contains("CONTACT US")) {
			System.out.println("Testcase is pass");
		} else {
			System.out.println("Test case is fail");
		}

		// Program2.... getTagName()

		WebElement e = driver.findElement(By.name("first_name"));
		String ee = e.getTagName();
		if (ee.contains("input")) {
			System.out.println("Test Case Tagname pass");
		} else {
			System.out.println("Test Case Tagname fail");
		}

		driver.quit();
	}

}
