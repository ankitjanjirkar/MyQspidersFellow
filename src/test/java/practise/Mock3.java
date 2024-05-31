package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mock3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = ch.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(ch);
		
		List<WebElement> menu = ch.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		Thread.sleep(1000);
		for (WebElement web : menu) {
			act.contextClick(right_click).build().perform();
				String ed = "Edit";
				String cu = "Cut";
				String cp = "Copy";
				String ps = "Paste";
				String del = "Delete";
				String qt = "Quit";
				if(ed.equals(web.getText())) {
				
				web.click();
				Thread.sleep(1000);
				ch.switchTo().alert().accept();
				Thread.sleep(1000);
				}
				
				else if (web.getText().equals(cu)) {
					web.click();
					Thread.sleep(1000);
					ch.switchTo().alert().accept();
					Thread.sleep(1000);
					
				}
				else if (web.getText().equals(cp)) {
					web.click();
					Thread.sleep(1000);
					ch.switchTo().alert().accept();
					Thread.sleep(1000);
					
				}
				else if (web.getText().equals(cp)) {
					web.click();
					Thread.sleep(1000);
					ch.switchTo().alert().accept();
					Thread.sleep(1000);
					
				}
				else if (web.getText().equals(ps)) {
					web.click();
					Thread.sleep(1000);
					ch.switchTo().alert().accept();
					Thread.sleep(1000);
					
				}
				else if (web.getText().equals(del)) {
					web.click();
					Thread.sleep(1000);
					ch.switchTo().alert().accept();
					Thread.sleep(1000);
					
				}
				else if (web.getText().equals(qt)) {
					web.click();
					Thread.sleep(1000);
					ch.switchTo().alert().accept();
					Thread.sleep(1000);
					
				}
				
			
			
		}
		
		
		
		

	}

}
