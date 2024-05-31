package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDownSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch= new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("file:///C:/Users/ANKIT/Downloads/demo.html");
		WebElement multiple_dropdown= ch.findElement(By.id("multiple_cars"));
		Select sel = new Select(multiple_dropdown);
		int i=0;
		List<WebElement> options = sel.getOptions();
		for(WebElement web:options) {
			sel.selectByIndex(i++);
			Thread.sleep(1000);
			
			
			
		}
		sel.deselectAll();
		

	}

}
