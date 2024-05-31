package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.myntra.com");
		//ch.findElement(By.className("desktop-searchBar")).sendKeys("watches");
		ch.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys("watches");
		ch.findElement(By.cssSelector("a[class='desktop-submit']")).click();
		ch.findElement(By.xpath("//label[text()='Men']")).click();
		//ch.findElement(By.xpath("//h3[text()='Fastrack']")).click();
		ch.findElement(By.xpath("//label[contains(text(),'CASIO')]")).click();
		
		}

}
