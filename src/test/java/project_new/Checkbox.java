package project_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement Checkbox = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input"));
	boolean ischecked =	 driver.findElement(By.id("isAgeSelected")).isSelected();
	if (ischecked!=true) {
		driver.findElement(By.id("isAgeSelected")).click();
		}
	Checkbox.click();
	}

}
