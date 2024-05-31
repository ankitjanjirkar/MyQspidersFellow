package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTask1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String orig = "https://demowebshop.tricentis.com/";
		WebDriver ch=new ChromeDriver();
		ch.get("https://demowebshop.tricentis.com/");
		String current = ch.getCurrentUrl();
		if(orig.equals(current)) {
			WebElement register = ch.findElement(By.className("ico-register"));
			register.click();
			Thread.sleep(2000);
			String title = "Demo Web Shop. Register";
			String current_title = ch.getTitle();
			if(title.equals(current_title)) {
				ch.findElement(By.id("gender-male")).click();
				Thread.sleep(2000);
				ch.findElement(By.id("FirstName")).sendKeys("ankit");
				Thread.sleep(2000);
				ch.findElement(By.id("LastName")).sendKeys("janjirkar");
				Thread.sleep(2000);
				ch.findElement(By.id("Email")).sendKeys("ankit@gmail.com");
				Thread.sleep(2000);
				ch.findElement(By.id("Password")).sendKeys("ankitj");
				Thread.sleep(2000);
				ch.findElement(By.id("ConfirmPassword")).sendKeys("ankitj");
				Thread.sleep(2000);
				ch.findElement(By.id("register-button")).click();
				Thread.sleep(2000);
				
			}
			ch.navigate().back();
			Thread.sleep(2000);
		}
		ch.close();
		

	}

}
