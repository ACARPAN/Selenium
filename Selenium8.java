package Selenium11;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Program2.... getTagName()

		System.setProperty("WebDrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();

		// Program 3..... getSize()

		driver.get("https://www.amazon.com/ref=nav_logo");

		WebElement bb = driver.findElement(By.cssSelector("#nav-logo-sprites"));
		Dimension d = bb.getSize();
		System.out.println(d);
		System.out.println(d.height);
		System.out.println(d.width);

		// Program 4..... getLocation()

		WebElement l = driver.findElement(By.cssSelector("#nav-logo-sprites"));
		Point p = l.getLocation();
		System.out.println(p);
		System.out.println(p.x);
		System.out.println(p.y);

		//Program5....grtAttribute()
		WebElement aa = driver.findElement(By.cssSelector("#nav-logo-sprites"));
		String hrefName = aa.getAttribute("href");
		// System.out.println(hrefName);
		if (hrefName.contains("ref=nav_logo")) {
			System.out.println("Test case for href attribute pass");
		} else {
			System.out.println("Test case for href attribute fail");
		}

		driver.quit();

	}

}
