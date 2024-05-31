package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver ch=new ChromeDriver();
//		ch.get("https://www.flipkart.com");
//		ch.findElement(By.xpath("//span[text()='Grocery']")).click();		
		ch.get("https://shop-global.malaicha.com/login");
		ch.findElement(By.xpath("//button[text()='Register']")).click();
	}

}
