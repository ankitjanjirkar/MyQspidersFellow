package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;


public class get1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.myntra.com");
//		ch.manage().window().fullscreen();
//		ch.manage().window().maximize();
//		ch.manage().window().minimize();
		System.out.println(ch.manage().window().getSize());
		Dimension d=new Dimension(500,300);
		ch.manage().window().setSize(d);
		Point a=ch.manage().window().getPosition();
		System.out.println(a.getX());
		System.out.println(a.getY());
		Point y=new Point(300,200);
		ch.manage().window().setPosition(y);
		}

}
