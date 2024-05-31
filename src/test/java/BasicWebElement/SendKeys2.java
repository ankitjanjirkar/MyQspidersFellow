package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://www.tirabeauty.com/");
		WebElement searchtf= ch.findElement(By.id("search"));
		searchtf.sendKeys("perfume");
		Thread.sleep(2000);
		searchtf.sendKeys(Keys.ENTER);
		

	}

}
