package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.navigate().to("https://demoapps.qspiders.com/");
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		ch.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		WebElement scroll = ch.findElement(By.xpath("//section[text()='Scroll']"));
		scroll.click();
		Thread.sleep(2000);
		WebElement scroll2 = ch.findElement(By.xpath("(//section[text()='Scroll'])[2]"));
		scroll2.click();
		Thread.sleep(2000);
		WebElement frame = ch.findElement(By.xpath("//section[text()='Within The Frame']"));
		frame.click();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//a[text()='Vertical']")).click();
		Thread.sleep(2000);
		WebElement ifra = ch.findElement(By.xpath("//iframe[@class='w-full border-none h-[55vh]']"));
		ch.switchTo().frame(ifra);
		JavascriptExecutor js=(JavascriptExecutor)ch;
		WebElement free = ch.findElement(By.xpath("//h3[text()='Free Materials']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",free);
		}

}
