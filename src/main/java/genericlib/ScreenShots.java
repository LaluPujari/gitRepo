package genericlib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {
	
	public void getScreenShot(WebDriver driver, String name) throws IOException {
		Date d = new Date();
		String currentDate = d.toString().replaceAll(" ", " ");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dist = new File(Autoconstant.propertyFilePath+currentDate+name+".png");
		
		FileUtils.copyFile(src, dist);
		
		
		
	}
	
	
	
	

}
