package WebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerfumeImg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver(); //upcasting
		ch.manage().window().maximize();
		ch.get("https://www.ajio.com");
		//step 1:Identify the web element in the webpage
		ch.findElement(By.name("searchVal")).sendKeys("perfumes");
		ch.findElement(By.className("ic-search")).click();
		WebElement perfume=ch.findElement(By.cssSelector("img[alt='Product image of EDW Essenza Mikkel Verde Deodorant Spray']"));
		File tempfile=perfume.getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("./Images1/perfume.png");
		FileUtils.copyFile(tempfile, destinationfile);
		
	}

}
