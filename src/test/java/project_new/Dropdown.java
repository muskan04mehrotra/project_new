package project_new;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select Droplist =new Select(driver.findElement(By.xpath("//*[@id=\"select-demo\"]")));
		Droplist.selectByVisibleText("Thursday");
		
		Select Mulselect =new Select(driver.findElement(By.id("multi-select")));
		Mulselect.selectByValue("Florida");
		Mulselect.selectByVisibleText("Ohio");
		Mulselect.deselectByIndex(6);
		List<WebElement> items=Mulselect.getAllSelectedOptions();
		
	}
	

}
