package Selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenjium02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      	     // Arrangement
		
				System.setProperty("webdrive.chrome.driver","C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://demoqa.com/login");
				
			//Action
				
				driver.manage().window().maximize();
				driver.findElement(By.id ("userName")).sendKeys("admin");
			driver.findElement(By.name("password"));
				
				
				driver.close ();
				
			
		
	}

}
