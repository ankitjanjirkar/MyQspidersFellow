package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://www.facebook.com/");
		String a = ch.findElement(By.id("u_0_5_ZS")).getTagName();
		System.out.println(a);
		

	}

}
