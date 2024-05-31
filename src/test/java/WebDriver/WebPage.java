package WebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage {

	public static void main(String[] args) throws IOException {
		WebDriver ch=new ChromeDriver(); //upcasting
		ch.manage().window().maximize();
		ch.get("https://www.ajio.com");
		//step 1: downcast TakesScreenshot
		TakesScreenshot ts=(TakesScreenshot) ch;  //downcasting
		
		//call getscreenshotAs() & store the screenshot in file
		
		File tempfile=ts.getScreenshotAs(OutputType.FILE);
		
		//step3:Create object of File Class
		
		File destinationfile=new File("./images1/myntra.png");
		
		FileUtils.copyFile(tempfile, destinationfile);
		
		
		
		

	}

}
