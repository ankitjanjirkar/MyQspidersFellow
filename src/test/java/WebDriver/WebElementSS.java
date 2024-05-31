package WebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver(); //upcasting
		ch.manage().window().maximize();
		ch.get("https://www.ajio.com");
		//step 1:Identify the web element in the webpage
		WebElement searchtf=ch.findElement(By.name("searchVal"));
		File tempfile=searchtf.getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("./Images1/Ajio1.png");
		FileUtils.copyFile(tempfile, destinationfile);

	}

}
