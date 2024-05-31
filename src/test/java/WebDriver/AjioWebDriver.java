package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioWebDriver {

	public static void main(String[] args) {
		
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.myntra.com");
		ch.findElement(By.className("desktop-searchBar")).sendKeys("watches");
		ch.findElement(By.className("desktop-submit")).click();
		ch.findElement(By.cssSelector("img[alt='Timex FitGen AMOLED Smart Watches TWTXW501T']")).click();
		

	}

}
