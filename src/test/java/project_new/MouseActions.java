package project_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.opencart.com/");
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		Actions actions = new Actions(driver);
		//WebElement Srchbox = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
		//actions.contextClick(Srchbox).perform();
		//WebElement menu= driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/a"));
		//WebElement Submenu= driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/div/div/ul/li[2]/a"));
		//actions.moveToElement(menu).perform();
		//actions.click(Submenu).perform();
		//actions.moveToElement(menu).click(Submenu).build().perform();
		//actions.scrollToElement(driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[2]/form/div/div[1]/a/img"))).build().perform();
		actions.doubleClick(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/p[1]/button"))).build().perform();
		
		
		
		
		
	}

}
