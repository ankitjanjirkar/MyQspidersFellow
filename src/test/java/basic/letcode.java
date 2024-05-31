package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class letcode {
	public static void main(String[] args) {
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://letcode.in/test");
		ch.findElement(By.linkText("Edit")).click();
		ch.findElement(By.id("fullName")).sendKeys("pune");
		
		
	}

}
