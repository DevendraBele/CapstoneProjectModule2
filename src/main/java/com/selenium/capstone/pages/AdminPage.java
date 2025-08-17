package com.selenium.capstone.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {
	
	private WebDriver driver;
	
	public AdminPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By sidebarMenuoptions = By.className("oxd-main-menu-item-wrapper");			
	private By adminOptions = By.className("oxd-main-menu-item");
	
	public int getSidebarOptionsCount() {
		
		List<WebElement> options = driver.findElements(sidebarMenuoptions);
		return options.size();
	}
	
	public void printEmAll() {
		
//		String dashboardURL = driver.getCurrentUrl();
//		System.out.println(dashboardURL);
		List<WebElement> options = driver.findElements(sidebarMenuoptions);
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
	}
	
	public void clickAdminMenu() {
		driver.findElement(adminOptions).click();
	}
	


}
