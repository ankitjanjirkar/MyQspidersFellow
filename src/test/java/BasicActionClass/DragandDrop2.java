package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch = new ChromeDriver();
		//launch the application
		ch.get("https://webdriveruniversity.com/Actions/index.html");

		Actions a=new Actions(ch);
		WebElement button = ch.findElement(By.id("click-box"));
		a.clickAndHold(button);
		Thread.sleep(5000);
		a.release(button);
		
		a.perform();
		
	}

}	// TODO Auto-generated method stub

