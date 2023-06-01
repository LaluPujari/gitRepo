package genericlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities1 {
	
	public void moushover(WebElement ele, WebDriver driver) {
		Actions A= new Actions(driver);
		A.moveToElement(ele).perform();
	}
	
	public void rightClick() {
		WebDriver driver = null;
		Actions a1= new Actions(driver);
		WebElement ele = null;
		a1.contextClick(ele).perform();
	}
	
	public void doubleClick(WebDriver driver, WebElement ele) {
		
		Actions a2 =new Actions(driver);
	
		a2.doubleClick(ele).perform();
	}
	
	public void dragAndDrop(WebDriver driver,WebElement ele1, WebElement ele2) {
		Actions a3 = new Actions(driver);
		a3.dragAndDrop(ele1, ele2).perform();
	}
	
	public void dropAndDown(String text, WebElement ele) {
		Select s= new Select(ele);
		s.selectByVisibleText(text);
		
	}
	public void ScrollBar(WebDriver driver, String x, String y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("windows.scrollBy("+x+", "+y+")");
		
	}
	
	public void Frames(WebDriver driver) {
		driver.switchTo().frame(0);
		driver.switchTo().parentFrame();
	}
	public void switchbackToFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	
	

}
