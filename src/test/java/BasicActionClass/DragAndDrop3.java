package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop3 {

	public static void main(String[] args) {
		
				WebDriver ch=new ChromeDriver();
				ch.manage().window().maximize();
				ch.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				Actions act=new Actions(ch);
				WebElement source1 = ch.findElement(By.id("box6"));		
				WebElement target1 = ch.findElement(By.id("box106"));
				act.dragAndDrop(source1, target1).build().perform();
				WebElement source2= ch.findElement(By.id("box5"));		
				WebElement target2= ch.findElement(By.id("box105"));
				act.dragAndDrop(source2, target2).build().perform();
				WebElement source3 = ch.findElement(By.id("box7"));		
				WebElement target3 = ch.findElement(By.id("box107"));
				act.dragAndDrop(source3, target3).build().perform();
				WebElement source4 = ch.findElement(By.id("box3"));		
				WebElement target4 = ch.findElement(By.id("box103"));
				act.dragAndDrop(source4, target4).build().perform();
				WebElement source5 = ch.findElement(By.id("box4"));		
				WebElement target5 = ch.findElement(By.id("box104"));
				act.dragAndDrop(source5, target5).build().perform();
				WebElement source6 = ch.findElement(By.id("box1"));		
				WebElement target6 = ch.findElement(By.id("box101"));
				act.dragAndDrop(source6, target6).build().perform();
				WebElement source7 = ch.findElement(By.id("box2"));		
				WebElement target7 = ch.findElement(By.id("box102"));
				act.dragAndDrop(source7, target7).build().perform();
				
				

	}

}
