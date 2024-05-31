package BasicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://licindia.in/");
		ch.findElement(By.xpath("//button[text()='Close']")).click();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//a[text()=' Login ']")).click();
		Thread.sleep(2000);
		System.out.println(ch.switchTo().alert().getText());

	}

}
