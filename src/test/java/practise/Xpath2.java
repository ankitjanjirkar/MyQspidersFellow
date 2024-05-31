package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://demowebshop.tricentis.com/");
		ch.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("books");
		Thread.sleep(2000);
		ch.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		Thread.sleep(2000);
		ch.navigate().back();
		ch.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		ch.navigate().back();
		ch.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		
		
		

	}

}
