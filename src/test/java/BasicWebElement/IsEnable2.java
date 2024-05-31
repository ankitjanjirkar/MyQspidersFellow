package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://demoapp.skillrary.com/");
		boolean h = ch.findElement(By.cssSelector("input[class='form-control']")).isEnabled();
		System.out.println(h);

	}

}
