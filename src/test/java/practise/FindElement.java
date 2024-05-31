package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch= new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("file:///C:/Users/ANKIT/Downloads/demo.html");
		 List<WebElement> links = ch.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
		for(WebElement web:links) {
			web.click();
			ch.navigate().back();
			Thread.sleep(1000);
			
		}

	}

}
