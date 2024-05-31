package BasicSynchronizatin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver ch;
	public static void preConditions(String value) {
		if("chrome".equalsIgnoreCase(value)) {
			ch=new ChromeDriver();
		}
		
			
		else if("fireFox".equalsIgnoreCase(value)){
			ch=new FirefoxDriver();
			
			
		}
		else {
			ch=new EdgeDriver();
		}
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		

	}
	public static void dwslogin() {
		ch.navigate().to("https://demowebshop.tricentis.com/");
		ch.findElement(By.xpath("//a[text()='Log in']")).click();
		ch.findElement(By.id("Email")).sendKeys("ankitjanjirkar@gmail.com");
		ch.findElement(By.id("Password")).sendKeys("anil2000");
		ch.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
	}
	public static void postConditionClose() {
		System.out.println("my Script is SucessFull...");
		ch.close();
	}
	
	public static void postConditionQuit() {
		System.out.println("my Script is SucessFull...");
		ch.quit();
	}

}
