/* Xpath / XML path
 * ----------------
 * Xpath is an address of the element
 * 
 * DOM ---- Document Object Model
 * 
 * Two types of Xpath
 * -------------------
 * 1) Absolute Xpath : that is full Xpath
 *  Ex : /html/body/header/div/div/div[2]/div/input
 *  
 * 2) Relative Xpath / Partial Xpath 
 * 	Ex : //*[@id='search']/input
 * 
 * Q) Which Xpath is preferred?
 * 1) Relative Xpath is faster than absolute Xpath
 * 2) As the application is in development envionment, there are frequence achanges in the code. 
 * 	  Due to which theere are high chances that if any tag is changesd or updated,
 *    absolute Xpath will become inccorrect as it depends upon each tag
 * 
 * Absolute Xpath vs  Relative Xpath
 * ---------------------------------
 * 1) Absolute xpath starts with / ----> represent root nokde
 * 	  Relative Xpath starts with // 
 * 
 * 2) Absolute xpath don't use attribute
 * 	  Relative xpath works with attribute
 * 
 * 3) Absolute xpath traverse through each node till it find element
 * 	  Relative xpath directly jump and find the element by using attribute
 * 
 * Relative Xpath
 * ---------------
 * Automatically --- Devtools, selectorhub, chropath
 * Manual(Own Path)
 * 
 * Syntax
 * ------
 * //tagname[@attribute='value']
 * //*[@attribute='value']
 * 
 */

package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_xml_path {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
//		maximize the window
		driver.manage().window().maximize();
		
//		By using Relative Xpath 
		WebElement search = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input"));
		search.sendKeys("Mobiles");
		search.clear();
		
//		xpath with single attribute
		driver.findElement(By.xpath("//button[@class='btn btn-light btn-lg']")).click();
		
//		xpath with multiple attribute
		WebElement sar = driver.findElement(By.xpath("//[@name='search][@type='text'][@placeholder='Search']"));
		sar.sendKeys("mobile");
		sar.clear();
		
//		xpath with 'and' and 'or' operator (can be used or in place of and )
		WebElement ser =driver.findElement(By.xpath("//[@name='search' and @type='text' and '@placeholder='Search']"));
		ser.sendKeys("computers");
		ser.clear();
	
		driver.close();	
	}

}
