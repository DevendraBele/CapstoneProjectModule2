package com.selenium.capstone.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.selenium.capstone.pages.AdminPage;
import com.selenium.capstone.pages.ExistingEmployeePage;
import com.selenium.capstone.pages.LoginPage;
import com.selenium.capstone.utilities.baseTest;

public class ExistingEmployeeTestByUserStatus extends baseTest{

  @Test
  public void searchExistingEmployeeTestByUserStatus() throws InterruptedException {
	  
	  LoginPage loginPage = new LoginPage(driver);
	  loginPage.login("Admin", "admin123");
	  
	  Thread.sleep(2000);
	  
	  AdminPage adminPage = new AdminPage(driver);
	  adminPage.clickAdminMenu();
	  
	  Thread.sleep(2000);
	  
	  ExistingEmployeePage existingEmployeePage = new ExistingEmployeePage(driver);
	  
	  existingEmployeePage.automateUserStatusDropDown();
	  
	  Thread.sleep(3000);
	  
	  existingEmployeePage.clickSearchButton();
	  
	  Thread.sleep(9000);
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0, 500)");
	  
	  existingEmployeePage.displayRecords();
  }
}
