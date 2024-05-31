package BasicSynchronizatin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://www.naukri.com/");
		//ch.findElement(By.id("login_Layer")).click();
		Thread.sleep(2000);
		//ch.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("ankitjanjirkar@gmail.com");
		String actualurl = ch.getCurrentUrl();
		System.out.println(actualurl);
		
		//String expectedurl = "https://www.naukri.com/";
//		if(actualurl.equals(expectedurl)) {
//			System.out.println("url is matching");
//		}
//		else {
//			System.out.println("url is not matching");
//		}
//		System.out.println("good morning");
		
		WebDriverWait w=new WebDriverWait(ch,Duration.ofSeconds(2));
		w.until(ExpectedConditions.urlToBe("https://www.naukri.com/"));
		System.out.println("hey");
	}

}
