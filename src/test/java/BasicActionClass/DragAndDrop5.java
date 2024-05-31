package BasicActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act=new Actions(ch);
		List<WebElement> source = ch.findElements(By.id("capitals"));
		List<WebElement> target = ch.findElements(By.id("countries"));
		
				
			
		}
		
	}


