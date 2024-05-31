package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropby1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://jqueryui.com/draggable/");
		WebElement f = ch.findElement(By.className("demo-frame"));
		ch.switchTo().frame(f);
		Actions a=new Actions(ch);
		WebElement E = ch.findElement(By.id("draggable"));
		a.dragAndDropBy(E, 160, 200);
		a.perform();
		

	}

}
