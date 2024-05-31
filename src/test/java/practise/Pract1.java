package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String given_data="https://www.ajio.com/";
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.navigate().to("https://www.ajio.com");
		String current_data=ch.getCurrentUrl();
		if(given_data.equals(current_data)) {
			System.out.println("u are in ajio");
			Thread.sleep(2000);	
			ch.navigate().back();
			Thread.sleep(2000);	
			ch.navigate().forward();
			Thread.sleep(2000);	
			ch.navigate().refresh();
			Thread.sleep(2000);	
			ch.close();
		}
		else {
			System.out.println("you are not in ajio web page pls check the url");
		}

	}

}
