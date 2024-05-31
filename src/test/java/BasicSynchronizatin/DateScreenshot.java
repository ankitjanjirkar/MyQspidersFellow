package BasicSynchronizatin;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class DateScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LocalDateTime date = LocalDateTime.now();
		System.out.println("date==>"+date);
		String currentdate = date.toString().replace(":","-" );
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("-disable-notifications");
		WebDriver ch = new ChromeDriver(opt);
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ch.navigate().to("https://www.redbus.in/");
		TakesScreenshot ts=(TakesScreenshot) ch;
		File from=ts.getScreenshotAs(OutputType.FILE);
		File to=new File(".\\Screenshot\\redbus"+currentdate+".png");
		FileHandler.copy(from, to);
	}

}
