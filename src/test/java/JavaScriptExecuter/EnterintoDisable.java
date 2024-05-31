package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterintoDisable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ch.navigate().to("https://www.facebook.com/");
		ch.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//label[text()='Custom']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)ch;
		//js.executeScript(null, args)

	}

}
