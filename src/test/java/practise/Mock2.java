package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://demowebshop.tricentis.com/");
		ch.manage().window().maximize();
		ch.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		
		List<WebElement> cart = ch.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement web:cart) {
			web.click();
			Thread.sleep(1000);
		}
	}

}
