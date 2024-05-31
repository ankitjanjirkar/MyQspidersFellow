package BasicActionClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment25 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://demowebshop.tricentis.com/");
		ch.manage().window().maximize();
		Actions act=new Actions(ch);
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		ch.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(1000);
		ch.findElement(By.xpath("//a[text()='Twitter']")).click();
		Thread.sleep(2000);
		String parent = ch.getWindowHandle();
		Set<String> child = ch.getWindowHandles();
		
//		child.remove(parent);
		for(String str:child) {
			ch.switchTo().window(str);
			String facebook = "https://www.facebook.com/nopCommerce";
			if(ch.getCurrentUrl().equals(facebook)) 
			{
				ch.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("ankitjanjirkar@gmail.com");
				Thread.sleep(1000);
				ch.findElement(By.xpath("(//input[@name='pass'])[2]")).sendKeys("ankit");
			}
			Thread.sleep(2000);
			String twitter = "https://twitter.com/nopCommerce";
			if(ch.getCurrentUrl().equals(twitter)) 
			{
				
				WebElement name = ch.findElement(By.xpath("//span[text()='Create account']"));
				name.click();
				Thread.sleep(3000);
				ch.findElement(By.xpath("//input[@name='name']")).sendKeys("Ankit");
				Thread.sleep(2000);
				ch.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("8097182124");
				Thread.sleep(2000);
				ch.findElement(By.id("SELECTOR_1")).click();
				Thread.sleep(2000);
				WebElement month = ch.findElement(By.xpath("//option[@value='9']"));
				month.click();
				Thread.sleep(2000);
				WebElement day = ch.findElement(By.xpath("//select[@aria-labelledby='SELECTOR_2_LABEL']"));
				day.click();
				Thread.sleep(2000);
				ch.findElement(By.xpath("//option[text()='18']")).click();
				Thread.sleep(2000);
				WebElement year = ch.findElement(By.xpath("//select[@aria-labelledby='SELECTOR_3_LABEL']"));
				year.click();
				Thread.sleep(2000);
				ch.findElement(By.xpath("//option[text()='2000']")).click();
				Thread.sleep(1000);
				
			}
		}
		
		
	}

}
