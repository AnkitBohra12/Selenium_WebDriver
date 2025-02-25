/*
 * findElement() --- Single web element
 * findElements() --- Multiple web element
 * 
 * Scenario 1 : Locator matching with 1 web element
 * findElement(loc) -- Single web element		WebElement
 * findElements(loc) -- Single web element 		List<WebElement>
 * 
 * Scenario 2 : Locators matching with multi web elements
 * findElement(loc) --- single web element 		WebElement
 * findElements(loc) --- multiple web elements  List<WebElement>
 * 
 *  Scenerio 3 : Locators is not  matching with any element
 *  findElement(loc) -- NoSuckElementExecption
 *  findElements(loc) -- no execption but return 0
 *
 */

package findElementVsfindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsVsFindElement {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
//		By Using findElement()
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys("Monitors");
		search.clear();
		
//		By using findElemets()
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println(elements.size());
		
		 for (int i=0; i< elements.size() ; i++) {
			 System.out.println(elements.get(i).getText());
		 }
		 
//		 for (WebElement link : elements) {
//		        System.out.println(link.getText());
//		    }
		
		System.out.println("Programe Ends Here");
		driver.close();
	}

}
