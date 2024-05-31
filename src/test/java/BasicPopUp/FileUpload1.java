package BasicPopUp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://demo.guru99.com/test/upload/");
		ch.findElement(By.id("file_wraper0")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\ANKIT\\OneDrive\\Desktop\\upload.exe");
		
		

	}

}
