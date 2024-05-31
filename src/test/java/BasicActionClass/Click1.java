package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://demo.vtiger.com/vtigercrm/");
		Actions a=new Actions(ch);
		WebElement button = ch.findElement(By.xpath("//button[text()='Sign in']"));
		a.click(button);
		a.perform();
	}

}
