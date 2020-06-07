package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Desktop\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//this will open firefox browser wthout any url
		WebDriver driver = new FirefoxDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		
		//this will redirect into given url
		driver.get("http://automationpractice.com/index.php");
		
		//driver.findElement(By.linkText("Sign in")).click();
		
	
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		//input email id in text
		driver.findElement(By.id("email_create")).sendKeys("tester.naveen@gmail.com");
		
		//inout type as id
		//driver.findElement(By.id("SubmitCreate")).click();
		
		driver.findElement(By.cssSelector("button[id='SubmitCreate']")).click();
		
		
		
		
		
	}

}
