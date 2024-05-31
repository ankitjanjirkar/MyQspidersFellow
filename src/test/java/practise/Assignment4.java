package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//String actual = "https://demowebshop.tricentis.com/";
		WebDriver ch=new ChromeDriver();
		ch.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement register = ch.findElement(By.className("ico-register"));
		register.click();
		Thread.sleep(2000);
		ch.navigate().back();
		WebElement login = ch.findElement(By.className("ico-login"));
		login.click();
		Thread.sleep(2000);
		ch.navigate().back();
		WebElement cart = ch.findElement(By.className("ico-cart"));
		cart.click();
		Thread.sleep(2000);
		ch.navigate().back();
		Thread.sleep(2000);
		WebElement wishlist = ch.findElement(By.xpath("//span[text()='Wishlist']"));
		wishlist.click();
		Thread.sleep(2000);
		ch.navigate().back();                                               
		
		
		
		
			
			
		}
	}


