package BasicActionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://demowebshop.tricentis.com/");
		Actions act=new Actions(ch);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(1000);
		act.sendKeys("ankit").keyDown(Keys.ENTER).build().perform();
		 


	}

}
