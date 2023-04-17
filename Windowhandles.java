package Selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();

		boolean page1 = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[1]/a")).isDisplayed();

		if (page1) {
			System.out.println("Test case pass");
		}

		// with webElement
//		WebElement e = driver.findElement(By.id("frame"));
//		driver.switchTo().frame(e);
//		
//		boolean page1 = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[1]/a")).isDisplayed();
//		
//		if (page1) {
//			System.out.println("Test case pass");
//		}

		// For W3Schools

		// driver.switchTo().frame(1);
		// WebElement byId = driver.findElement(By.id("iframeResult"));
		// WebElement byName = driver.findElement(By.name("iframeResult"));

		// getting the total number of iframe inside the page
		//System.out.println(driver.findElements(By.tagName("iframe")).size());

		// driver.switchTo().frame("iframeResult");

//		boolean w3School = driver.findElement(By.xpath("/html/body/h1")).isDisplayed();
//		
//		if (w3School) {
//			System.out.println("Test case pass for W3school");
//		}

		driver.close();
	}
}
