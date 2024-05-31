package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class textfield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver ch=new ChromeDriver();
		ch.get("file:///C:/Users/ANKIT/OneDrive/Desktop/ankitHTML/sele.html");
		//ch.findElement(By.cssSelector("input[value='a']")).sendKeys("ankit");
		ch.findElement(By.xpath("//input[@value='a' and @type='text']")).sendKeys("AA");
		ch.findElement(By.xpath("//input[@value='b' and @type='text']")).sendKeys("aj");
	}

}
