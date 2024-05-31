package BasicPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidNotification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("-disable-notifications");
		WebDriver ch=new ChromeDriver(opt);
		ch.manage().window().maximize();
		ch.get("https://www.redbus.in/");
		Thread.sleep(2000);

	}

}
