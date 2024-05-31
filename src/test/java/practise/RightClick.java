package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = ch.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(ch);
		act.moveToElement(right_click).build().perform();
		act.contextClick().build().perform();
		Thread.sleep(1000);
		ch.findElement(By.xpath("//span[text()='Edit']")).click();
		Thread.sleep(1000);
		try {
			right_click.click();
			System.out.println("pop is not displayed");
		}
		catch(Exception e){
			System.out.println("popup is displyad");
			
		}

	}

}
