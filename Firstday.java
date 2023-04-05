package Selenium11;

public class Firstday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//# Scroll down the page
				//d.findElement(By.tagName("Body")).sendKeys(Keys.END);
				//d.findElement(By.cssSelector("a[id=\"popup-alerts\"]")).sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(5000);
				
				//# Scroll upto the element using JavaScript	
				WebElement Ele = d.findElement(By.cssSelector("a[id=\"popup-alerts\"]"));
				d.executeScript("arguments[0].scrollIntoView();", Ele);
				
				//# Scroll up the page
				//d.findElement(By.tagName("Body")).sendKeys(Keys.HOME);
				Thread.sleep(5000);

				d.close();
	}

}
