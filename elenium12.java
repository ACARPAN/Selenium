package Selenium11;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class elenium12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		Thread.sleep(3000);

//	    Select class only applies to drop down with select as tagNAme
//      We need to pass select element to constructor
//      byValue , byIndex , byText	

//		WebElement dropdown = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select dropText = new Select(dropdown);
//		dropText.selectByVisibleText("JAVA");

		// Select the element based on index
//		WebElement menu = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select dropIndex = new Select(menu);
//		dropIndex.selectByIndex(2);
//		Thread.sleep(3000);
//		driver.quit();
		
//		//Select the element byValue
//		WebElement menu1= driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select byValue = new Select (menu1);
//		byValue.selectByValue("sql");
//		Thread.sleep(3000);
//		WebElement menu2=driver.findElement(By.cssSelector("#dropdowm-menu-2"));
//		Select byText= new Select (menu2);
//		byText.selectByVisibleText("JUnit");
//		Thread.sleep(3000);
//		driver.close();
		
		//getoptions for all methods
		
		WebElement menu3 = driver.findElement(By.cssSelector("#dropdowm-menu-3"));
		Select byValue3 = new Select (menu3);
		byValue3.selectByValue("javascript");
		System.out.println(byValue3.getOptions());
		List <WebElement>  m1 = byValue3.getOptions();
		for(int a = 0 ; a < m1.size() ;a++) {
			System.out.println(m1.get(a).getText());
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
