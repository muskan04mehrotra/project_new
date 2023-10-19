package project_new;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class testscript {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://automationbookstore.dev/");
		//WebElement textbox = driver.findElement(By.id("APjFqb"));
		//textbox.sendKeys("Automation Bookstore");
		//textbox.sendKeys(Keys.ENTER);
		driver.findElement(RelativeLocator.with(By.tagName("li"))
				.above(By.id("pid6")).toRightOf(By.id("pid1"))).click();
		driver.findElement(By.xpath("//*[@id=\"searchBar\"]")).sendKeys("Experiences of Test Automation");
		WebElement ClsBtn =driver.findElement(By.xpath("//*[@id=\"demo-page\"]/div[2]/form/div/a"));
		if (ClsBtn.isDisplayed()) {
			
			ClsBtn.click();
		}
		
		
		
		
		
		
		
	
		
		
	}
	

}
