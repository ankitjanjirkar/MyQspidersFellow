package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://demo.vtiger.com/vtigercrm/");
		  Point s = ch.findElement(By.xpath("//button[text()='Sign in']")).getLocation();
		 System.out.println(s);


	}

}
