package Selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ActioninSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdrive.driver.chrome", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();

		// Action on Double Click

		Actions a = new Actions(driver);
		WebElement  dc = driver.findElement(By.cssSelector("#double-click"));
		a.doubleClick(dc).build().perform();
		if (dc.getAttribute("class").equals("div-double-click double")) {
			System.out.println("testcase case pass");
		}
		

		// Actions on Drag and Drop option
//
//		WebElement draggable = driver.findElement(By.cssSelector("#draggable"));
//		WebElement droppable = driver.findElement(By.cssSelector("#droppable"));
//		System.out.println(droppable.getText());
//		a.dragAndDrop(draggable, droppable).build().perform();
//		System.out.println(droppable.getText());
//		

		// Actions on Click and Hold

//		WebElement ch = driver.findElement(By.cssSelector("#click-box"));
//		a.clickAndHold(ch).build().perform();
//		System.out.println(ch.getText());
//		if(ch.getText().equals("Well done! keep holding that click now.....")) {
//			System.out.println("Test case pass");
//		}
		// Actions on Click
		//WebElement ch1 = driver.findElement(By.cssSelector("#click-box"));
//		System.out.println(ch1.getText());
		// ch1.click();
//		if(ch1.getText().equals("Dont release me!!!")) {
//			System.out.println("Testcase pass");
//		}

		// Actions on Hover over element

//		WebElement h = driver.findElement(By.cssSelector("#div-hover > div:nth-child(3) > button"));
//		a.moveToElement(h).build().perform();
//		Thread.sleep(5000);

//		WebElement h1 = driver.findElement(By.cssSelector("#main-header"));
//		a.contextClick(h1).build().perform();
//		Thread.sleep(5000);

		driver.quit();

	}

}
