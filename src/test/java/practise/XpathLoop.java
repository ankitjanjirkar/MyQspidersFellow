package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		WebDriver ch=new ChromeDriver();
		ch.get("https://demowebshop.tricentis.com/");
		 List<WebElement> Community_poll = ch.findElements(By.xpath("//input[@type='radio']"));
				 for(WebElement web:Community_poll) {
					 web.click();
					 Thread.sleep(2000);
					 
				 } 
		
	}

}
