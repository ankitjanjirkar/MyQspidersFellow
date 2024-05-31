package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUsingWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.navigate().to("https://www.ajio.com");
		WebElement icon = ch.findElement(By.xpath("//div[@class='logo-float undefined']"));
		if(icon.isDisplayed()) {
			System.out.println("u are in ajio");
			Thread.sleep(2000);	
			ch.navigate().back();
			Thread.sleep(2000);	
			ch.navigate().forward(); 
			Thread.sleep(2000);	
			ch.navigate().refresh();
			Thread.sleep(2000);	
			ch.close();
		}
		else {
			System.out.println("not in webpage check url");
		}
		

	}

}
