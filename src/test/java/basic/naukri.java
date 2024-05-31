package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.naukri.com/");
//		ch.findElement(By.xpath("//input[contains(@placeholder,'Enter skills')]")).sendKeys("JAVA");
//		ch.findElement(By.className("qsbSubmit")).click();
		ch.findElement(By.xpath("//input[@class='suggestor-input '][1]")).sendKeys("java");
	}

}
