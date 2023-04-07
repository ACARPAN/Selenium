package Selenium11;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// program 1
		// alert
//		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
//				ChromeDriver driver = new ChromeDriver();
//				driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
//				driver.findElement(By.cssSelector("#button1")).click();
//				driver.switchTo().alert().accept();
//				Thread.sleep(3000);
//				driver.close()

		// confirm() - accept()

//		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
//		driver.manage().window().maximize();
//		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
//		driver.findElement(By.cssSelector("#button4")).click();
//		driver.switchTo().alert().accept();
//		String textAccept = driver.findElement(By.cssSelector("#confirm-alert-text")).getText();
//		System.out.println(textAccept);
//		driver.quit();
		
		// confirm() - dismiss()
		
		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		driver.findElement(By.cssSelector("#button4")).click();
		driver.switchTo().alert().dismiss();
		String textDismiss = driver.findElement(By.cssSelector("#confirm-alert-text")).getText();
		System.out.println(textDismiss);
		Thread.sleep(3000);
		driver.close();
	}

}
