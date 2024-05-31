package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://letcode.in/radio");
		boolean a = ch.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		System.out.println(a);
		}

}
