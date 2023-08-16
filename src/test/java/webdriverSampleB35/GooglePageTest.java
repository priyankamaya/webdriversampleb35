package webdriverSampleB35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//driver.get("http://www.google.com/");
		driver.get("https://stqatools.com/");
		js.executeScript("history.go(-1)");
		js.executeScript("window.scrollBy(10,document.body.scrollHeight)");
		//WebElement srcbox= driver.findElement(By.id("AP7576Fqb"));
		//WebElement srcbox= driver.findElement(By.id("APjFqb"));
		//srcbox.sendKeys("Java Tutorial");
		//driver.close();
		

	}

}
