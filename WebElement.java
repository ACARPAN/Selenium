package Selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Database     ------ API    ----------- UI(html , css , javascript)
				// html hypertext markup language 
				// css
				// javascript
				// element - html elements
				// html will attribute and value 
				// on user actions 
				// element are created , updated , retrieve and deleted
				// based on user action 
				// html element's attribute are created , updated , retrieve , deleted
		
		System.setProperty("webdrive.chrome.driver", " C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		
		ChromeDriver driver = new ChromeDriver ();
		/*1st set of methods*/
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//// sendKeys()  --- input and text area
		//click() ---- input and text area
		
	//driver.findElement(By.name("first_name")).sendKeys("Maninair");
		//driver.findElement(By.name("last_name")).sendKeys("Ac");
	//driver.findElement(By.name("email")).sendKeys("Ac@yahoo.com");
		//driver.findElement(By.name("message")).sendKeys("I am learning js");
		//driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		//driver.close();
		
		//submit
		
		driver.findElement(By.name("first_name")).sendKeys("Maninair");
		driver.findElement(By.name("last_name")).sendKeys("Ac");
	driver.findElement(By.name("email")).sendKeys("Ac@yahoo.com");
		driver.findElement(By.name("message")).sendKeys("I am learning js");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).submit();
		driver.close();
		
	}

}
