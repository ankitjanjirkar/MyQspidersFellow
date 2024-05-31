 package BasicPopUp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedbusCelender {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-disable-notifications");
		WebDriver ch=new ChromeDriver(options);
		ch.get("https://www.redbus.in/");
		ch.manage().window().maximize();
		Thread.sleep(2000);
		
		ch.findElement(By.xpath("//span[text()='Date']")).click();
		Thread.sleep(2000);
		//1.go to eventlistner
		//2.go to blur;
		//3.remove all elements inside the blur
		//and the move cursor to date u want
		ch.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 gigHYE']")).click();
		Thread.sleep(2000);
		
		
		
	}

}
