package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ch.navigate().to("https://www.dream11.com//");
		ch.findElement(By.xpath("//a[text()='Back to home']")).click();
		JavascriptExecutor js=(JavascriptExecutor)ch;
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,-500");
		WebElement rating = ch.findElement(By.xpath("//span[text()='Win Crores']"));
		js.executeScript("arguments[0].scrollIntoView(false);",rating);

	}

}
