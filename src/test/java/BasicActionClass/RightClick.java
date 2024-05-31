package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions a=new Actions(ch);
		//WebElement button =ch.findElement(By.xpath("//span[text()='right click me']"));
		//a.contextClick();
		//a.contextClick(button);
		//a.doubleClick();
		WebElement button1=ch.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		a.doubleClick(button1);
		
		a.perform();
		

	}

}
