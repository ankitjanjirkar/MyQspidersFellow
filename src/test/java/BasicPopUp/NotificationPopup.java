package BasicPopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://www.redbus.in/");
		Thread.sleep(2000);
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
