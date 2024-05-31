package BasicPopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextByRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		//rob.keyPress(KeyEvent.VK_CAPS_LOCK);
		rob.keyPress(KeyEvent.VK_T);
		rob.keyPress(KeyEvent.VK_H);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyPress(KeyEvent.VK_L);
		rob.keyPress(KeyEvent.VK_A);
		
		Thread.sleep(2000);
		rob.keyRelease(KeyEvent.VK_TAB);
		//THALArob.keyRelease(KeyEvent.VK_CAPS_LOCK);
		rob.keyRelease(KeyEvent.VK_T);
		rob.keyRelease(KeyEvent.VK_H);
		rob.keyRelease(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_L);
		rob.keyRelease(KeyEvent.VK_A);
		
	}

}
