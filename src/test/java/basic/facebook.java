package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.facebook.com");
		//ch.findElement(By.linkText("Forgotten password?")).click();
		ch.findElement(By.partialLinkText("Forgotten passwor")).click();
	}

}
