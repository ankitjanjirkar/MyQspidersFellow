package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://www.myntra.com/");
		Actions act = new Actions(ch);
		WebElement target_men = ch.findElement(By.xpath("//a[text()='Men']"));
		act.moveToElement(target_men).build().perform();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//a[@data-reactid='41']")).click();
		

	}

}
