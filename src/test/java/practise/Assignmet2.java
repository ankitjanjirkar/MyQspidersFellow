package practise;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
public class Assignmet2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver ch = new ChromeDriver();
		String acUrl =  "https://demowebshop.tricentis.com/digital-downloads";
		Thread.sleep(3000);
		ch.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String cuUrl = ch.getCurrentUrl(); 
		String acTitle  = "Demo Web Shop. Digital downloads";   
		String cuTitle = ch.getTitle();
		Thread.sleep(2000);
		WebElement webele = ch.findElement(By.xpath("//h1[text()='Digital downloads']"));
		if (acUrl.equals(cuUrl)&&acTitle.contains(cuTitle)&&webele.isDisplayed()) {
			System.out.println("page is validate");
		}
		Thread.sleep(1000); 
		WebElement selectOp =  ch.findElement(By.id("products-orderby"));
		Select s = new Select(selectOp);
		System.out.println(s.isMultiple());
		s.selectByIndex(1);
		ch.quit();
	}
}
