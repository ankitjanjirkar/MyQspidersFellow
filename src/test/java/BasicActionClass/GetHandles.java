package BasicActionClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://demowebshop.tricentis.com/");
		Actions act=new Actions(ch);
		Thread.sleep(2000);
		String Parent_handle= ch.getWindowHandle();	
		System.out.println("parent dws page==>"+Parent_handle);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		ch.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(2000);		
		ch.findElement(By.xpath("//a[text()='Twitter']")).click();
		Thread.sleep(2000);	
		Set<String> child = ch.getWindowHandles();
		System.out.println("child==>"+child);
		
	}

}
