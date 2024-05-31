package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectIterate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch= new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("file:///C:/Users/ANKIT/Downloads/demo.html");
		WebElement target = ch.findElement(By.id("standard_cars"));
		Select sel = new Select(target);
		List<WebElement> options = sel.getOptions();
		int i=0;
		for(WebElement webelement:options) {
			sel.selectByIndex(i);
			i++;
			Thread.sleep(2000);
		}
		
		
	}

}
