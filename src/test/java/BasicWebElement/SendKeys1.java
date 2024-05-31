package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://www.facebook.com/");
		ch.findElement(By.id("email")).sendKeys("ankit@gmail.com"); 
		ch.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a");
		ch.findElement(By.id("email")).sendKeys(Keys.CONTROL+"c");
		ch.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");

	}

}
