package BasicActionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://demowebshop.tricentis.com/");
		Actions act=new Actions(ch);
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_UP).build().perform();

	}

}
