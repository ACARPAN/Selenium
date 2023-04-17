package Selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandels2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WebElement
		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		WebElement ifrm = driver.findElement(By.id("frame"));
		driver.switchTo().frame(ifrm);
		System.out.println(driver.getTitle()); // WebDriver | Page Object Model
		boolean home = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[1]/a")).isDisplayed();
		if (home) {
			System.out.println("Testcase pass");
		}
		driver.switchTo().parentFrame();

		// By index
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjson_parse");
//		driver.switchTo().frame(1);
//		if(driver.findElement(By.id("demo")).isDisplayed()) {
//			System.out.println("Testcase pass");
//		}
//		driver.switchTo().parentFrame();

		// By name
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjson_parse");
//		driver.switchTo().frame("iframeResult");
//		if(driver.findElement(By.id("demo")).isDisplayed()) {
//			System.out.println("Testcase pass");
//		}
//		driver.switchTo().parentFrame();

		// By id
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjson_parse");
//		driver.switchTo().frame("iframeResult");
//		if (driver.findElement(By.id("demo")).isDisplayed()) {
//			System.out.println("Testcase pass");
//		}
//		driver.switchTo().parentFrame();
}

}
