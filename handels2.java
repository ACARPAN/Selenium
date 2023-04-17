package Selenium11;

public class handels2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

	}

}
