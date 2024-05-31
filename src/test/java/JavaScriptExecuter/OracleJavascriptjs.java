package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleJavascriptjs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String login = "https://login.oracle.com/mysso/signon.jsp";
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		ch.navigate().to("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)ch;
		 WebElement element = ch.findElement(By.id("rt01tab8-java8-windows"));
		 js.executeScript("arguments[0].scrollIntoView(false)", element);
		 element.click();		
		 Thread.sleep(2000);
		WebElement jdk = ch.findElement(By.linkText("jdk-8u411-windows-x64.exe"));
		
		
		Thread.sleep(2000);
		jdk.click();
		Thread.sleep(2000);
		WebElement disable_element = ch.findElement(By.linkText("Download jdk-8u411-windows-x64.exe"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", disable_element);
		String current_url = ch.getCurrentUrl();
		if(login.equals(current_url)) {
			System.out.println("script is successfull");
			Thread.sleep(2000);
		}
		else {
			System.out.println("script is unsccessfull");
		}
		

	}

}
