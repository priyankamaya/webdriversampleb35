package webdriverSampleB35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
		//driver.findElement(By.id("username")).sendKeys("tomsmith");
		//driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		//driver.findElement(By.className("radius")).click();
		//driver.findElement(By.tagName(null)).click();
		driver.findElement(By.xpath("//button[@class='radius' and @type='submit']"));
		driver.close();
		

	}

}
