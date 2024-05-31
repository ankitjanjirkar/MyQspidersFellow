package BasicPopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		
		ch.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(ch, Duration.ofSeconds(60));
		ch.navigate().to("https://www.shoppersstack.com/");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		ch.findElement(By.id("loginBtn")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Account']")));
		ch.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		
	}

}
