package com.selenium.capstone.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.capstone.pages.LoginPage;
import com.selenium.capstone.utilities.baseTest;

public class LoginTest extends baseTest{
	
  @Test(priority = 1)
  public void loginWithValidCredentials() throws InterruptedException {
	  
	  LoginPage loginPage= new LoginPage(driver);
	  
	  loginPage.login("Admin", "admin123");
	  
	  Thread.sleep(3000);
	  
	  String currentURL = driver.getCurrentUrl();
      boolean loggedIn = currentURL.contains("/dashboard");

      Assert.assertTrue(loggedIn, "Login failed! URL does not contain '/dashboard'");
	  
  }
}
