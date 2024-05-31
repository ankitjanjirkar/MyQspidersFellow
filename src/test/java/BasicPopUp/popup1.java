package BasicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://letcode.in/test");
		ch.findElement(By.xpath("//a[text()='Dialog']")).click();
		ch.findElement(By.id("accept")).click();
		ch.switchTo().alert().accept();
	}

}
