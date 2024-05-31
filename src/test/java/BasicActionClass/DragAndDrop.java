package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch = new ChromeDriver();
		//launch the application
		ch.get("https://letcode.in/dropable");
		
		Actions a=new Actions(ch);
		WebElement source = ch.findElement(By.id("draggable"));
		WebElement target = ch.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target);
		a.perform();

	}

}
