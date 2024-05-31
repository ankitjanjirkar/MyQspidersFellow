package BasicActionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://www.ajio.com/");
		Actions a=new Actions(ch);
		//WebElement search = ch.findElement(By.name("searchVal"));
		a.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		a.sendKeys(Keys.PAGE_UP);
		a.perform();

	}

}
