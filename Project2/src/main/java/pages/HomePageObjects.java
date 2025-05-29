package main.java.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObjects {
	WebDriver driver;
	WebDriverWait wait;
	
	By openPagesMenu = By.xpath("(.//a[text()='Pages'])[1]");
	By contctOption = By.xpath("(.//li/a[@href='contact.html'])[1]");
	By errorMessage = By.xpath(".//div[@class='gm-err-content']");
	
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	
	public void hoverOnPagesMenu() {
		WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(openPagesMenu));
		Actions a1 = new Actions(driver);		
		a1.moveToElement(menu).build().perform();
	}
	
	public void clickContact() {
		WebElement contact = wait.until(ExpectedConditions.visibilityOfElementLocated(contctOption));
		contact.click();
	}
	
	public void errorMessage() {
		WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
		System.out.println(error.getText());
	}
}
