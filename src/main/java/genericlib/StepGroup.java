package genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StepGroup {
	public WebDriver driver;
	PropertyFile pdata= new PropertyFile();
	public WebDriverUtilities1 d= new WebDriverUtilities1();
	
	
	@BeforeMethod
	public void openApp() throws IOException {
		
		driver= new FirefoxDriver();
		WebDriverManager.firefoxdriver().setup();
		driver.manage().window().maximize();
		driver.get(pdata.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
		
		@AfterMethod
		public void closeApp(ITestResult res) throws IOException {
			
			
			int r = res.getStatus();
			String name = res.getName();
			if(r==2) {
				
			
			
			ScreenShots s= new ScreenShots();
			s.getScreenShot(driver, name);
			
			
		}
			
			 driver.quit();
			
		}
		
		
		
		
		
		
		
	}
	


