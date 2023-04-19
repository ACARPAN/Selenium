package Selenium11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handels2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();

driver.get("https://www.webdriveruniversity.com/");
		
		List<WebElement> aList = driver.findElements(By.tagName("a"));
		
		System.out.println(aList.size());
		
		for (int i = 0; i < aList.size(); i++) {
			//System.out.println(aList.get(i).getText());
			System.out.println(aList.get(i).getAttribute("href"));
		}
		
		driver.close();

	}



	}


