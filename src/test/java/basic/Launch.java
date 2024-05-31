package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver ch=new ChromeDriver();
		Thread.sleep(4000);
		//ch.get("https://www.flipkart.com");
//		ch.get("https://www.amazon.in");
//		ch.get("https://www.postman.com");
//		System.out.println(ch);
		ch.get("https://www.facebook.com");
		Thread.sleep(4000);
		ch.findElement(By.id("email")).sendKeys("ankit");
		Thread.sleep(4000);
		ch.findElement(By.id("pass")).sendKeys("anil");
		ch.findElement(By.name("login")).click();		

	}

}
