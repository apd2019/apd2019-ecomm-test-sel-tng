package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageObjects {
	WebDriver driver;
	
	By openPagesMenu = By.xpath("(.//a[text()='Pages'])[1]");
	By contctOption = By.xpath("(.//li/a[@href='contact.html'])[1]");
	By errorMessage = By.xpath(".//div[@class='gm-err-content']");
	
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void hoverOnPagesMenu() {
		Actions a1 = new Actions(driver);
		WebElement menu = driver.findElement(openPagesMenu);
		a1.moveToElement(menu).build().perform();
	}
	
	public void clickContact() {
		
		driver.findElement(contctOption).click();
	}
	
	public void errorMessage() {
		System.out.println(driver.findElement(errorMessage).getText());
	}
}
