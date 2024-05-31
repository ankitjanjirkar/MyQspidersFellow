package BasicSynchronizatin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.navigate().to("file:///C:/Users/ANKIT/Downloads/iframe-1.html");
		ch.switchTo().frame(0);
		ch.findElement(By.id("small-searchterms")).sendKeys("Selenium007");
		Thread.sleep(2000);
		ch.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		ch.switchTo().parentFrame();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//a[text()='Google']")).click();
		Thread.sleep(2000);

	}

}
