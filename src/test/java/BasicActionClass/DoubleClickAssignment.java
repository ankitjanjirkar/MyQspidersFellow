package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		WebElement double_click = ch.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act=new Actions(ch);
		act.moveToElement(double_click).build().perform();
		act.doubleClick(double_click).build().perform();
		try {
			double_click.click();
			System.out.println("pop up is displayed");
		}
		catch(Exception e){
			System.out.println("pop is displayed");
			
		}
		

	}

}
