package test.java.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import main.java.pages.HomePageObjects;
import test.java.base.BaseTest;

public class HomePageTest extends BaseTest{
	HomePageObjects hpo;
	
	@BeforeMethod
	public void setup() {
		openBrowser();
		hpo = new HomePageObjects(driver);
	}
	
	@Test
	public void homePageTest() {
		hpo.hoverOnPagesMenu();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//li/a[@href='contact.html'])[1]")));
		
		hpo.clickContact();
		
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert message"+ alert.getText());
			alert.accept();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class='gm-err-content']")));
		
		hpo.errorMessage();
			
	}
	
	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}
}
