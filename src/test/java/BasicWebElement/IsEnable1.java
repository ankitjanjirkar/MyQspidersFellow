package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://demo.vtiger.com/vtigercrm/");
		boolean h = ch.findElement(By.xpath("//button[text()='Sign in']")).isEnabled();
		System.out.println(h);

	}

}
