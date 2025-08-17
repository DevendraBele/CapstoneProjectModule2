package com.selenium.capstone.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExistingEmployeePage {
	
	private WebDriver driver;
	
	public ExistingEmployeePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	private By recordsData = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]");
	private By searchBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
			
	//for ByUsername (Admin) 
	private By sendUsername = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");
	
	//for ByUserRole (Admin)
	private By userRoleDropdownBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i");
	private By selectAdminOption = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]");
	
	//for ByUserStatus (Enabled)
	private By userStatusDropdownBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]");
	private By selectEnabledOption = By.className("oxd-select-text-input");
	
	// common methods
	public void displayRecords() {
		List<WebElement> records = driver.findElements(recordsData);
		for(WebElement record : records) {
			System.out.println(record.getText());
		}
	}
	
	public void refreshPage() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(5000);
	}

	public void clickSearchButton() throws InterruptedException {
		driver.findElement(searchBtn).click();;
		Thread.sleep(2000);
	}
	
	
	// methods for specific testng class
	public void sendUsername(String username) {
		driver.findElement(sendUsername).sendKeys(username);
	}
	
	public void automateUserRoleDropdown() {
		driver.findElement(userRoleDropdownBtn).click();
		driver.findElement(selectAdminOption).sendKeys(Keys.ENTER);
	}
	
	public void automateUserStatusDropDown() {
		driver.findElement(userStatusDropdownBtn).click();
		driver.findElement(selectEnabledOption).sendKeys(Keys.ENTER);
	}
	
	
}
