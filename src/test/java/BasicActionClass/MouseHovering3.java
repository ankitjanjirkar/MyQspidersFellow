package BasicActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://www.ajio.com/");
		Actions a=new Actions(ch);
		a.moveByOffset(200, 300).contextClick();
		a.perform();
		

	}

}
