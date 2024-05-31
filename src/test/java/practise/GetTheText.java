package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.navigate().to("https://demowebshop.tricentis.com/");
		WebElement digi = ch.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
		
		digi.click();
		Thread.sleep(2000);
//		WebElement price = ch.findElement(By.xpath("//span[text()='1.00']"));
		WebElement price = ch.findElement(By.xpath("//a[text()='Music 2']/../../div[3]/div[1]/span"));
		System.out.println(price.getText());
//		
		WebElement price2= ch.findElement(By.xpath("(//a[text()='Music 2'])[2]/../../div[3]/div[1]/span"));
		System.out.println(price2.getText());
		

	}

}
