package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.navigate().to("https://demowebshop.tricentis.com/");
		WebElement regi = ch.findElement(By.xpath("//a[text()='Register']"));
		regi.click();
		Thread.sleep(1000);
		ch.findElement(By.xpath("//input[@value='M']")).click();
		Thread.sleep(1000);
		ch.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Ankit");
		Thread.sleep(1000);
		ch.findElement(By.xpath("//input[@name='LastName']")).sendKeys("janjirkar");
		Thread.sleep(1000);
		ch.findElement(By.xpath("//input[@name='Email']")).sendKeys("ankitkit@gmail.com");
		Thread.sleep(1000);
		ch.findElement(By.xpath("//input[@name='Password']")).sendKeys("ankit18");
		Thread.sleep(1000);
		ch.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("ankit18");
		Thread.sleep(1000);
		ch.findElement(By.xpath("//input[@name='register-button']")).click();
		ch.navigate().back();
		Thread.sleep(1000);
		ch.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(1000);
		ch.findElement(By.xpath("//input[@name='Email']")).sendKeys("ankitkit@gmail.com");
		Thread.sleep(1000);
		ch.findElement(By.xpath("//input[@name='Password']")).sendKeys("ankit18");
		Thread.sleep(1000);
		ch.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}

}
