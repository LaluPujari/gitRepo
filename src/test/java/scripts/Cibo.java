package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cibo {
	
	
	//loacl to master

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/");
	//	driver.manage().timeouts(10,TimeUnit );
		
		
		driver.findElement(By.xpath("(//span[contains(text(),'Open Application')]) [3]")).click();
		driver.findElement(By.linkText("Login")).click();
		
		
		
		
		
		
		
		

	}

}
