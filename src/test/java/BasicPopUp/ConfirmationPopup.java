package BasicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://letcode.in/test");
		ch.findElement(By.xpath("//a[text()='Dialog']")).click();
		ch.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		ch.switchTo().alert().dismiss();

	}

}
