package Selenium11;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdrive.chrome.driver","C:\\Users\\offic\\OneDrive\\Desktop\\Chrome.exe");
		ChromeDriver google = new ChromeDriver();
		 google.get("https://www.google.com"); 
		 google.close();

	}

}
