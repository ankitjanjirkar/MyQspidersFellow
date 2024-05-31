package BasicSynchronizatin;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ch.navigate().to("https://www.redbus.in/");
		WebElement allu = ch.findElement(By.id("homeV2-root"));
		File from=allu.getScreenshotAs(OutputType.FILE);
		File to=new File("./Screenshot/Allu.png");
		FileHandler.copy(from, to);
		
		

	}

}
