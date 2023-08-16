package webdriverSampleB35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		String StrLbl= driver.findElement(By.xpath("//label/span")).getText();
		System.out.println(StrLbl);
		
		//main page to Frame1
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello World");
		
		//frame1 to frame3
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		//frame3 to frame1
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome back");
		
		//frame1 to mainpage
		driver.switchTo().defaultContent();
		StrLbl= driver.findElement(By.xpath("//label/span")).getText();
		System.out.println(StrLbl);
		
		//driver.switchTo().frame("frame2");
		//driver.findElement(By.xpath("//select [@id='animals']"))	
		
		
		
	}

}
