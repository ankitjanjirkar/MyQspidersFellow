package BasicActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://www.myntra.com/");
		Actions act = new Actions(ch);
		List<WebElement> target_men = ch.findElements(By.xpath("//div[@class='desktop-navContent']"));
		 for(WebElement act1:target_men) {
			 act.moveToElement(act1).build().perform();
			
			 Thread.sleep(2000);
	}

	}
}
