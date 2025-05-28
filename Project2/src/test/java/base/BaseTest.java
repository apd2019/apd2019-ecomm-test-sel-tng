package test.java.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("http://localhost/ATE_PEP2_Testing_Using_TestNG/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	public void closeBrowser() {
		if(driver != null) {
			driver.quit();
		}
	}
}
