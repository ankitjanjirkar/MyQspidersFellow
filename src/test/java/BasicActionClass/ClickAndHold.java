package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act=new Actions(ch);
		WebElement Italy = ch.findElement(By.id("box106"));
		WebElement rome = ch.findElement(By.id("box6"));
		act.clickAndHold(rome).moveToElement(Italy).release().build().perform();

	}

}
