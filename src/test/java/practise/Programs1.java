package practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Programs1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(ch,Duration.ofSeconds(40));
		ch.navigate().to("file:///C:/Users/ANKIT/Downloads/MultipleWindow.html");
		
		String curl = "file:///C:/Users/ANKIT/Downloads/MultipleWindow.html";
		if(curl.equals(ch.getCurrentUrl())) {
			ch.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
			//System.out.println(ch.getWindowHandle());
			Thread.sleep(6000);
			Set<String> Child = ch.getWindowHandles();
			String parent = ch.getWindowHandle();
			Child.remove(parent);
			for(String str:Child) {
				ch.switchTo().window(str);
				System.out.println(ch.getTitle());
				//ch.manage().window().maximize();
				
				
				Thread.sleep(2000);
				
				
				
					}
			ch.switchTo().window(parent);
			ch.close();
			
			
			}	
		
		
			
			
			
		}

	}


