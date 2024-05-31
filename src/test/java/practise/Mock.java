package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.get("https://demowebshop.tricentis.com/");
		ch.manage().window().maximize();
		
	
				List<WebElement> options = ch.findElements(By.xpath("//ul[@class='poll-options']/li/label"));
				for (WebElement web : options) {
					
					web.click();	
					Thread.sleep(2000);
					System.out.println(web.getText());
				}
			
		}
		

	}


