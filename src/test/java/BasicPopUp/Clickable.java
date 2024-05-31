package BasicPopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Clickable {
		public static void main(String[] args) throws InterruptedException {
			WebDriver ch=new ChromeDriver();
			ch.manage().window().maximize();
//			ch.get("https://www.flipkart.com/");
//			ch.switchTo().window(null)
//			
			ch.navigate().to("https://omayo.blogspot.com/");
			WebDriverWait wait=new WebDriverWait(ch,Duration.ofSeconds(40));
			Actions act=new Actions(ch);
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Dropdown']")));
			ch.findElement(By.xpath("//button[text()='Dropdown']"));
			Thread.sleep(2000);
			ch.navigate().back();
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
			ch.findElement(By.id("timerButton")).click();
			Thread.sleep(2000);
			ch.switchTo().alert().accept();
			Thread.sleep(3000);
			
			
			
			
		}

}
