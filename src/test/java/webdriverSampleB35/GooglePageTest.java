package webdriverSampleB35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		WebElement srcbox= driver.findElement(By.id("APjFqb"));
		srcbox.sendKeys("Java Tutorial");
		driver.close();
		

	}

}
