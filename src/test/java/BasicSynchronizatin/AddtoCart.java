package BasicSynchronizatin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddtoCart extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preConditions("chrome");
		dwslogin();
		ch.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		
		List<WebElement> cart = ch.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement web:cart) {
			web.click();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		postConditionClose();
		

	}

}
