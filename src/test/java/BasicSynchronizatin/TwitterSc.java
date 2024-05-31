package BasicSynchronizatin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TwitterSc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch = new ChromeDriver();
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ch.navigate().to("https://twitter.com/i/flow/login");
		ch.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("ankitjanjirkar@gmail.com");
		ch.findElement(By.xpath("//span[text()='Next']")).click();
		ch.findElement(By.xpath("//input[@name='text']")).sendKeys("janjirkar7990");
		ch.findElement(By.xpath("//span[text()='Next']")).click();
		ch.findElement(By.xpath("//input[@name='password']")).sendKeys("anil2000");
		ch.findElement(By.xpath("//span[text()='Log in']")).click();
		ch.findElement(By.xpath("//input[@aria-label='Search query']")).sendKeys("Sachin tendulkar");
		Actions act=new Actions(ch);
		act.keyDown(Keys.ENTER).build().perform();
		
		

	}

}
