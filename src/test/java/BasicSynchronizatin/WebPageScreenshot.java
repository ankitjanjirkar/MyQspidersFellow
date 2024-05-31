package BasicSynchronizatin;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver ch = new ChromeDriver();
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ch.navigate().to("https://www.redbus.in/");
		TakesScreenshot ts=(TakesScreenshot) ch;
		File from=ts.getScreenshotAs(OutputType.FILE);
		File to=new File("D:\\selenium\\selenium\\Screenshot\\redbus.png");
		FileHandler.copy(from, to);
		

	}

}
