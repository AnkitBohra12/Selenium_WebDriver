package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
//		WebDriver drivers = new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
//		By name locator
		driver.findElement(By.name("Search")).sendKeys("Mac");
		
//		By ID
		boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplayStatus);
		
//		linkText and PartialLinkText
		driver.findElement(By.linkText("Tablets")).click();	
		driver.findElement(By.partialLinkText("Tabl")).click();
		
//		ClassName
		List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
		System.out.println("Total number of header links : " + headerLinks.size());
		
//		TagName
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : " + links.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images : " + images.size());
		
		driver.close();	
		driver.quit();
	}

}
