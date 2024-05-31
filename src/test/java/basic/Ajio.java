package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ajio {

	public static void main(String[] args) {
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.ajio.com");
		//ch.findElement(By.name("searchVal")).sendKeys("wallets");
		
		//ch.findElement(By.className("ic-search")).click();
		//ch.findElement(By.name("searchVal")).sendKeys("watches");
		//ch.findElement(By.name("searchVal")).sendKeys("perfume");
		//ch.findElement(By.className("ic-search")).click();
//		ch.findElements(By.className("rilrtl-lazy-img  rilrtl-lazy-img-loaded"));
		//ch.findElement(By.cssSelector("img[alt='Product image of FOSSIL Men FS5664 Analogue Watch with Leather Strap']")).click();
		ch.get("https://www.ajio.com/");
		ch.findElement(By.name("searchVal")).sendKeys("watches");
		ch.findElement(By.className("ic-search")).click();
		ch.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
	} 

}
