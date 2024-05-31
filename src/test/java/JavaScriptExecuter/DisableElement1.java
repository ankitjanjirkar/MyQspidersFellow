package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://letcode.in/edit");
		WebElement dtf = ch.findElement(By.id("noEdit")); //disableTextfield
		JavascriptExecutor jse=(JavascriptExecutor) ch;
		
		jse.executeScript("arguments[0].value='ankit'", dtf);
		

	}

}
