package Xpath_Demo_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
//		Xpath with inner text
		driver.findElement(By.xpath("//a[text()='Components']")).click();
		
		WebElement feat = driver.findElement(By.xpath("//h3[text()='Featured']"));
		System.out.println(feat.isDisplayed());
		System.out.println(feat.getText());
		
//		Xpath with contains
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search']")).sendKeys("Devices");
		driver.findElement(By.xpath("a//[contains(text(),'es & P)]")).click();
		
//		Xpath with starts-with
		driver.findElement(By.xpath("//a[starts-with(text(),'MP3')]")).click();
		
		driver.findElement(By.xpath("//form[starts-with(@id, 'Form-cur')]")).click();
		

	}

}
