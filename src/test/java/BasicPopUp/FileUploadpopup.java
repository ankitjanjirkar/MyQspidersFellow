package BasicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(2000);
		WebElement inputfile = ch.findElement(By.xpath("//input[@type='file']"));
		inputfile.sendKeys("C:\\Users\\ANKIT\\OneDrive\\Desktop\\selenium\\fileupload.docx");
	}

}
