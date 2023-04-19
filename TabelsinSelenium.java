package Selenium11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabelsinSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Tables
		// Get the total number of tables
		// Get the total numbers of rows
		// Get total number of columns
		// Iterate rows and columns and print text of element
		// Text of element

		System.setProperty("WebDrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");

		// Retrive the total number of tables in page
		List<WebElement> tabl = driver.findElements(By.xpath("//*[table]"));
		System.out.println(tabl.size());

		// total number of rows

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"t01\"]/tbody/tr"));
		System.out.println(rows.size());
		int rowsize = rows.size();

		// total number of columns
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id=\"t01\"]/tbody/tr[2]/td"));
		System.out.println(cols.size());
		int colsize = cols.size();

		// //table[@id="t01"]/tbody/tr[1]/td[3]
		// //table[@id="t01"]/tbody/tr[2]/td[3]
		// //table[@id="t01"]/tbody/tr[3]/td[3]

		int sum = 0;

		for (int i = 2; i <= rowsize; i++) {
			String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + i + "]/td[3]")).getText();
			System.out.println(text);
			sum = sum  + Integer.parseInt(text);    // 45+94+20  // "45" ===> 45
			
		}
		System.out.println(sum);
		
		// person with name jackson
		
		for (int i = 2; i <= rowsize; i++) {
			String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + i + "]/td[2]")).getText();
			//System.out.println(text);
			if(text.equals("Jackson")) {
				System.out.println("Testcase pass ");
				break;
			}
	
		}
		
			
		
		
		

//		for (int i = 2; i <= rowsize; i++) {
//			String text = driver.findElement(By.xpath("//*[@id=\"t02\"]/tbody/tr[" + i + "]/td[3]")).getText();
//			System.out.println(text);
//		}

		driver.quit();

		
	}

}
