package com.selenium.capstone.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.capstone.pages.AdminPage;
import com.selenium.capstone.pages.LoginPage;
import com.selenium.capstone.utilities.baseTest;

public class AdminTest extends baseTest{
  
  @Test(priority = 1)
  public void adminLoginFunctionalityTest() throws InterruptedException {
	
	  LoginPage loginPage = new LoginPage(driver);
	  loginPage.login("Admin", "admin123");
	  
	  Thread.sleep(2000);
	  
	  AdminPage adminPage = new AdminPage(driver);
	  
	  //sidebarCount 
	  int sidebarCount = adminPage.getSidebarOptionsCount();
	  System.out.println("count " + sidebarCount);
	  
	  //sidebarPrintEmAll
	  adminPage.printEmAll();
	  
	  Assert.assertEquals(sidebarCount, 12, "Sidebar options count mismatch!");
	  
	  adminPage.clickAdminMenu();
	  
	  String currentURL = driver.getCurrentUrl();
	  //System.out.println(currentURL);
	  Assert.assertTrue(currentURL.contains("admin"), "Admin page is not opened!");
	  
  }
}
