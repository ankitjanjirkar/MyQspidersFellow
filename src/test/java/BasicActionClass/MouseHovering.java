package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		//ch.manage().window().maximize();
		ch.get("https://www.ajio.com/");
		Actions a=new Actions(ch);
		WebElement men=ch.findElement(By.xpath("//span[text()='MEN']"));
		a.moveToElement(men);
		a.perform();

	}

}
