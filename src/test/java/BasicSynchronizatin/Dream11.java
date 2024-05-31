package BasicSynchronizatin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BasicPopUp.ExplicitWait;

public class Dream11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ExplicitWait wait=new ExplicitWait();
		
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ch.navigate().to("https://www.dream11.com//");
		ch.findElement(By.xpath("//a[text()='Back to home']")).click();
		
		//ch.switchTo().frame(0);
		ch.switchTo().frame("send-sms-iframe");
		Thread.sleep(2000);
		WebElement mobile = ch.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));
		mobile.sendKeys("8097182124");
		ch.switchTo().parentFrame();
		ch.findElement(By.id("hamburger")).click();

	}

}
