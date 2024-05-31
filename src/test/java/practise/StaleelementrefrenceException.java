package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaleelementrefrenceException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
		WebElement sort_by = ch.findElement(By.id("products-orderby"));
		Select s=new Select(sort_by);
		List<WebElement> options = s.getOptions();
		int i=0;
		for(WebElement web:options) {
			sort_by=ch.findElement(By.id("products-orderby"));
			s=new Select(sort_by);
			s.selectByIndex(i++);
		}
		
	}

}
