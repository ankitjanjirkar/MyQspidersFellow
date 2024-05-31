package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://demo.vtiger.com/vtigercrm/");
		   Rectangle s = ch.findElement(By.xpath("//button[text()='Sign in']")).getRect();
		 System.out.println(s.getWidth());
		 System.out.println(s.getHeight());
		 System.out.println(s.getX());
		 System.out.println(s.getY());
		 


	}

}
