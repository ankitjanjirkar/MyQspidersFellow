package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.naukri.com/");
		ch.findElement(By.id("login_Layer")).click();
		ch.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("ankit@gmail.com");
		}

}
