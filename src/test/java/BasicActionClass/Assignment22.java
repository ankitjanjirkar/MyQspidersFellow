package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://demowebshop.tricentis.com/");
		Actions act=new Actions(ch);
		Thread.sleep(2000);
		String current = "https://demowebshop.tricentis.com/";
		if(current.equals(ch.getCurrentUrl())) {
		
		WebElement books = ch.findElement(By.xpath("//a[contains(text(),'Books')]"));
		act.keyDown(Keys.SHIFT).click(books).build().perform();
		
		
		
		WebElement computer = ch.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		act.keyDown(Keys.SHIFT).click(computer).build().perform();
		WebElement electronics = ch.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
		act.keyDown(Keys.SHIFT).click(electronics).build().perform();
		WebElement Apparel = ch.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]"));
		act.keyDown(Keys.SHIFT).click(Apparel).build().perform();
		WebElement Digital_downloads = ch.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
		act.keyDown(Keys.SHIFT).click(Digital_downloads).build().perform();
		WebElement Jewelry = ch.findElement(By.xpath("//a[contains(text(),'Jewelry')]"));
		act.keyDown(Keys.SHIFT).click(Jewelry).build().perform();
		WebElement Gift_Cards = ch.findElement(By.xpath("//a[contains(text(),'Gift Cards')]"));
		act.keyDown(Keys.SHIFT).click(Gift_Cards).build().perform();
		}
	
	else {
		System.out.println("wrong url");
	}
	}
		

	}

