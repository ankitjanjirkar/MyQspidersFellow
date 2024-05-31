package practise;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Programs4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver ch=new ChromeDriver();
		ch.get("https://demowebshop.tricentis.com/");
		ch.manage().window().maximize();
		Actions act=new Actions(ch);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		List<WebElement> follow = ch.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		Thread.sleep(2000);
		
		for (WebElement web : follow) {
			
			System.out.println(web.getText());
			String rss = "RSS";
			if(web.getText().equals(rss)) {
				act.keyDown(Keys.CONTROL).build().perform();
				web.click();
			}
			else {
				web.click();
			}
			
			
			
			}
//		Set<String> child = ch.getWindowHandles();
//		Thread.sleep(2000);
//		String parent = ch.getWindowHandle();
//		ch.switchTo().window(child);
//		ch.close();
		}
		
		
		
	}


