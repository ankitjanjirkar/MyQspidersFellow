package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch = new ChromeDriver();
		//launch the application
		ch.get("https://letcode.in/test");
		
		ch.findElement(By.linkText("Drop-Down")).click();
		WebElement single=ch.findElement(By.id("fruits"));
		Select s=new Select(single);
		List<WebElement> all=s.getOptions();
		int count=0;
		for(WebElement e:all) {
			count++;
			System.out.println(e.getText());
			
		}System.out.println(count);

	}

}
