package BasicSynchronizatin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://demoapps.qspiders.com/");
		ch.manage().window().maximize();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//section[text()='Web Elements']")).click();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//section[text()='Frames']")).click();
		ch.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(3000);
		ch.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		Thread.sleep(3000);
		ch.switchTo().frame("w-full h-96");
		Thread.sleep(3000);
		ch.findElement(By.id("email")).sendKeys("ankit@gmail.com");
	
		
		
			
		
		

	}

}
