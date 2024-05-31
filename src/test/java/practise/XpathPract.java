package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPract {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String orig = "https://demowebshop.tricentis.com/";
		WebDriver ch=new ChromeDriver();
		ch.get("https://demowebshop.tricentis.com/");
		String current = ch.getCurrentUrl();
		if(orig.equals(current)) {
			System.out.println("i m on dws page");
			ch.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li/a")).click();
			Thread.sleep(2000);
			ch.navigate().back();
			
			ch.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
			Thread.sleep(2000);
			ch.navigate().back();
			ch.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a")).click();
			Thread.sleep(2000);
			ch.navigate().back();
			ch.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[4]/a")).click();
			Thread.sleep(2000);
			ch.navigate().back();
			
		}
		else {
			System.out.println("check the page-----");
		}

	}

}
