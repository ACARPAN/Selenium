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

//		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
//		driver.manage().window().maximize();
//		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
//		driver.findElement(By.cssSelector("#button4")).click();
//		driver.switchTo().alert().dismiss();
//		String textDismiss = driver.findElement(By.cssSelector("#confirm-alert-text")).getText();
//		System.out.println(textDismiss);

		// Program 4 ... Prompt .accept()

//		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();
//		driver.switchTo().alert().sendKeys("Word");
//		driver.switchTo().alert().accept();
//		String textValue = driver.findElement(By.id("result")).getText();
//		if (textValue.equals("You entered: Word")) {
//			System.out.println("Testcase pass");
//		} else {
//			System.out.println("Testcase Fail");
//		}
//
//		Thread.sleep(3000);
//		driver.close();

		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();
		//driver.switchTo().alert().sendKeys(" ");
		driver.switchTo().alert().dismiss();
		String textNull = driver.findElement(By.id("result")).getText();

		if (textNull.equals("You entered: null")) {
			System.out.println("Test case pass");
			
		} else {
			System.out.println("Test case fail");
		}
		Thread.sleep(3000);
		driver.close();

	}

}
