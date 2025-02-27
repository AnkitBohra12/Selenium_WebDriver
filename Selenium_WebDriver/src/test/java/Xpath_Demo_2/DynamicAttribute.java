package Xpath_Demo_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicAttribute {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		//*[@id = start or @id=stop]
		//*[conatins@id, 'st']
		//*[starts-with(@id, 'st']
		//*[conatins(text(), 'st']
		
		WebElement box = driver.findElement(By.xpath("//button[@name='start' or @name='stop']"));
		
		
		for(int i=0; i<4 ; i++) {
			String attr = box.getAttribute("name");
			WebElement box2 = driver.findElement(By.xpath("//button[@name=, "+attr+"]"));
			System.out.println(box2.getText());
			box2.click();
		}
	}
}
