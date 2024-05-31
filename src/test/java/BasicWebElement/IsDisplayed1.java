package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://demoapp.skillrary.com/login.php?type=login/");
		boolean a = ch.findElement(By.id("keepLoggedInCheckBox")).isDisplayed();
		System.out.println(a);

	}

}
