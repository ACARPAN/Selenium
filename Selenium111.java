package Selenium11;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium111 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		Thread.sleep(3000);
//		List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[name='color']"));
//
//		for (int i = 0; i < radioButtons.size(); i++) {
//		    WebElement currentRadioButton = radioButtons.get(i);
//		    currentRadioButton.click();
//
//		    if (i < radioButtons.size() - 1) {
//		        WebElement nextRadioButton = radioButtons.get(i + 1);
//		        if (nextRadioButton.isSelected()) {
//		            System.out.println("The next radio button is already selected.");
//		
//	        }
//	    }
//	}
		
		// Get all radio buttons on the page
		List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[name='color']"));

		// Iterate through each radio button
		for (int i = 0; i < radioButtons.size(); i++) {
		    WebElement radioButton = radioButtons.get(i);
		    
		    // Click on the radio button
		    radioButton.click();
		    
		    // Check if the next radio button is not selected
		    if (i < radioButtons.size() - 1) {
		        WebElement nextRadioButton = radioButtons.get(i+1);
		        if (!nextRadioButton.isSelected()) {
		            System.out.println("Next radio button is not selected");
		        }
		    }
		}
		
//		List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[name='color']"));
//		Iterator<WebElement> iterator = radioButtons.iterator();
//		WebElement currentRadioButton;
//
//		while(iterator.hasNext()) {
//		    currentRadioButton = iterator.next();
//		    currentRadioButton.click();
//		    if(iterator.hasNext()) {
//		        WebElement nextRadioButton = iterator.next();
//		        if(!nextRadioButton.isSelected()) {
//		            System.out.println("Next radio button is not selected.");
//		        }
//		    }
//		}


		driver.close();

	}

}
