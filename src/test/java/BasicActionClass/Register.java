package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch =new ChromeDriver();
		ch.get("https://demo.automationtesting.in/Register.html");
		ch.manage().window().maximize();
		ch.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("ankit");
		ch.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("janjirkar");
		ch.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("muktai heights khadakwasla");
		ch.findElement(By.xpath("//input[@type='email']")).sendKeys("ankitjan@gmail.com");
		ch.findElement(By.xpath("//input[@type='tel']")).sendKeys("8097182124");
		ch.findElement(By.xpath("//input[@value='Male']")).click();
		ch.findElement(By.xpath("//input[@value='Cricket']")).click();
		ch.findElement(By.id("msdd")).click();
		Actions act=new Actions(ch);
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		
		WebElement target = ch.findElement(By.xpath("//a[text()='Hindi']"));
		target.click();
		Thread.sleep(1000);
		ch.findElement(By.xpath("//label[text()='Languages']")).click();
		ch.findElement(By.id("Skills")).click();
		Thread.sleep(1000);
		WebElement skill = ch.findElement(By.xpath("//option[text()='Adobe InDesign']"));
		skill.click();
		Thread.sleep(1000);
		ch.findElement(By.xpath("//label[text()='Skills']")).click();
		ch.findElement(By.id("countries")).click();
		
		Thread.sleep(1000);
		ch.findElement(By.xpath("//span[@role='combobox']")).click();
		
		Thread.sleep(1000);
		WebElement country = ch.findElement(By.xpath("//li[text()='India']"));
		country.click();
		ch.findElement(By.id("yearbox")).click();
		WebElement year = ch.findElement(By.xpath("//option[text()='2000']"));
		year.click();
		ch.findElement(By.xpath("//select[@placeholder='Month']")).click();
		
		WebElement month = ch.findElement(By.xpath("//option[text()='September']"));
		month.click();
		
		ch.findElement(By.id("daybox")).click();
		WebElement day = ch.findElement(By.xpath("//option[text()='18']"));
		day.click();

		ch.findElement(By.id("firstpassword")).sendKeys("ankit1000");
		ch.findElement(By.id("secondpassword")).sendKeys("ankit1000");
		ch.findElement(By.id("submitbtn")).click();
		
		
		
		
		

	}

}
