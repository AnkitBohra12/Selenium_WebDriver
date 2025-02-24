/*
 * Test Case
 * ---------
 * 1) Launch Browser (Chrome)
 * 2) Open URL https://demo.opencart.com
 * 3) Validate title should be "Your Store"
 * 4) Close browser
 */

package Day_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
//		1) Launch Browser (Chrome)  Chrome driver constructor will automatically invoke	
		WebDriver driver = new ChromeDriver();   // parent (upcasting so no need to specify anything here)
//		ChromeDriver driver = new ChromeDriver();  // child 
//		WebDriver driver = new EdgeDriver();    for edge browser
		
//		2) Open URL https://demo.opencart.com
		driver.get("https://demo.opencart.com");
		
//		3) Validate title should be "Your Store"
		String actual_title = driver.getTitle();
		
		if(actual_title.equals("Your Store")) {
			System.out.println("Test Passed");
		}
		else{
			System.out.println("Test Failed");
		}
		
//		4) Close browser
		driver.close();
//		driver.quit();
	}

}
