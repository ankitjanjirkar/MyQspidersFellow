package JavaScriptExecuter;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillRary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		ch.navigate().to("https://www.skillrary.com/#");
		JavascriptExecutor js=(JavascriptExecutor)ch;
		js.executeScript("window.scrollBy(40,208)");
		ch.findElement(By.xpath("//span[text()='GEARS']")).click();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//a[text()=' SkillRary Demo APP'][1]")).click();
		//js.executeScript("window.scrollBy(368,357))");
		Thread.sleep(2000);
		String parent = ch.getWindowHandle();
		
		Set<String> child = ch.getWindowHandles();
		child.remove(parent);
		for (String str : child) {
			ch.switchTo().window(str);
		//ch.findElement(By.xpath("//li[text()='Latest']")).click();
		WebElement disable = ch.findElement(By.xpath("(//input[@type='text'])[2]"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='ankit'",disable);
			
		}
		
		

	}

}
