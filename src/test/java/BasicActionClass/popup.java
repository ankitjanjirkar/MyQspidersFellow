package BasicActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://demo.automationtesting.in/Alerts.html");
		ch.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')] ")).click();
		Thread.sleep(2000);
		ch.switchTo().alert().accept();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Thread.sleep(2000);
		ch.switchTo().alert().dismiss();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		Alert alert = ch.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("ankit");
		Thread.sleep(2000);
		alert.accept();
		

	}

}
