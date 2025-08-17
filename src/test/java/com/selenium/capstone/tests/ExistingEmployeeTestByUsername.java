package com.selenium.capstone.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.selenium.capstone.pages.AdminPage;
import com.selenium.capstone.pages.ExistingEmployeePage;
import com.selenium.capstone.pages.LoginPage;
import com.selenium.capstone.utilities.baseTest;

public class ExistingEmployeeTestByUsername extends baseTest{
  	
	@Test
	public void searchExistingEmployeeByUsername() throws InterruptedException {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("Admin", "admin123");
		  
		Thread.sleep(2000);
		  
		AdminPage adminPage = new AdminPage(driver);
		adminPage.clickAdminMenu();
		
		String currentURL = driver.getCurrentUrl();
		if(currentURL.contains("SystemUsers")) {
			System.out.println("all set brother for username");
		}
		
		ExistingEmployeePage employeePage = new ExistingEmployeePage(driver);
		
		Thread.sleep(2000);
		
		employeePage.sendUsername("Admin");
		employeePage.clickSearchButton();
		
		Thread.sleep(3000);
		
		employeePage.displayRecords();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		
		Thread.sleep(2000);
		
		employeePage.refreshPage();
	}
  
  
}
