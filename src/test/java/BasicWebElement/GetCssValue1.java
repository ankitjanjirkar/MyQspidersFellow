package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver ch=new ChromeDriver();
				ch.get("https://demo.vtiger.com/vtigercrm/");
				String s = ch.findElement(By.id("username")).getCssValue("display");
				System.out.println(s);

	}

}
