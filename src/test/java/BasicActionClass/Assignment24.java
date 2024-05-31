package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://demowebshop.tricentis.com/");
		Actions act=new Actions(ch);
		Thread.sleep(2000);
		String title = "Demo Web Shop. Register";
		
		
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		if(ch.getTitle().equals(title)) {
		ch.findElement(By.id("gender-male")).click();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).sendKeys("ankit").build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).sendKeys("janjirkar").build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).sendKeys("ankitjan@gmail.com").build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).sendKeys("ankit18").build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).sendKeys("ankit18").build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.ENTER).build().perform();
		}
		else {
			System.out.println("page title is wrong pls correct its");
		}
	}

}
