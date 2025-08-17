package com.selenium.capstone.tests;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.selenium.capstone.pages.AdminPage;
import com.selenium.capstone.pages.ExistingEmployeePage;
import com.selenium.capstone.pages.LoginPage;
import com.selenium.capstone.utilities.baseTest;

public class ExistingEmployeeTestByUserRole extends baseTest {
  
  @Test
  public void searchExistingEmployeeTestByUserRole() throws InterruptedException {
	  
	  LoginPage loginPage = new LoginPage(driver);
	  loginPage.login("Admin", "admin123");
	  
	  Thread.sleep(2000);
	  
	  AdminPage adminpage = new AdminPage(driver);
	  adminpage.clickAdminMenu();
	  
	  Thread.sleep(2000);
	  
	  ExistingEmployeePage employeePage = new ExistingEmployeePage(driver);
	  
	  employeePage.automateUserRoleDropdown();
	  
	  employeePage.clickSearchButton();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0, 500)");
//	  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  
	  employeePage.displayRecords();
	  
	  Thread.sleep(5000);
	  
	  employeePage.refreshPage();
  }
}
