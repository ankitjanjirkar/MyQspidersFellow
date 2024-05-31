package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://www.ajio.com/");
		ch.findElement(By.name("searchVal")).sendKeys("watches");
		ch.findElement(By.className("ic-search")).click();
		JavascriptExecutor jse=(JavascriptExecutor) ch;
		
		for(;;) {
			try {
		ch.findElement(By.cssSelector("img[alt='Product image of FERRO Water-Resistant Chronograph Watch-FM-BIZ006']")).click();
		break;
			}catch(NoSuchElementException e){
		jse.executeScript("window.scrollBy(0,900)");
		}
		}
		

	}

}
