package BasicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://www.naukri.com/");
		ch.findElement(By.id("login_Layer")).click();
		Thread.sleep(2000);
		ch.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("ankitjanjirkar@gmail.com");
		ch.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("ankit ");
		ch.findElement(By.xpath("//button[text()='Login']")).click();

	}

}
