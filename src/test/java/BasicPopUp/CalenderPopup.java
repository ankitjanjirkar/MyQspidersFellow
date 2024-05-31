package BasicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://www.agoda.com/?cid=1844104&ds=mtxvBlyTcYeOGWot");
		ch.manage().window().maximize();
		Thread.sleep(8000);
		ch.findElement(By.xpath("//button[text()='No thanks']")).click();
		Actions act=new Actions(ch);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(1000);
		
		ch.findElement(By.id("check-in-box")).click();
		Thread.sleep(1000);
		WebElement checkin = ch.findElement(By.xpath("//span[@data-selenium-date='2024-05-30']"));
		Thread.sleep(1000);
		checkin.click();
		ch.findElement(By.xpath("//span[@data-selenium-date='2024-06-01']")).click();
		Thread.sleep(1000);
		
		
		
		
	}

}
