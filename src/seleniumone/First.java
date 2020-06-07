package seleniumone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class First {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Desktop\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		WebElement lnkAddRemove = driver.findElement(By.linkText("Add/Remove Elements"));
		lnkAddRemove.click();
		//Thread.sleep(2000);
	    // 4 | click | css=button | 
	    driver.findElement(By.cssSelector("button")).click();
	    // 5 | click | css=.added-manually | 
	    driver.findElement(By.cssSelector(".added-manually")).click();
//	    // 6 | close |  | 
//	    driver.close();
		
				
		

	}

}
