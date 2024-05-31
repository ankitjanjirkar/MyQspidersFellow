package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch= new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("file:///C:/Users/ANKIT/Downloads/demo.html");
		WebElement multiple_DropDown = ch.findElement(By.id("standard_cars"));
		Select sel = new Select(multiple_DropDown);
		boolean multi=sel.isMultiple();
		System.out.println(multi);

	}

}
