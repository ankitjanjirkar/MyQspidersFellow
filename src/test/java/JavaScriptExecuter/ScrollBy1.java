package JavaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://www.ajio.com/");
		JavascriptExecutor jse=(JavascriptExecutor) ch;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(-document.body.scrollHeight,0)");
	}

}
