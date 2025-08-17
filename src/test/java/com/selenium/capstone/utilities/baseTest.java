package com.selenium.capstone.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class baseTest {
  
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest test;
	
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
//	  extent = ExtentManager.getInstance();
  }

  @AfterClass
  public void afterClass() {
	  
	  if(driver != null) {
		  driver.quit();
	  }
	  if (extent != null) {
          extent.flush();
      }
  }

}
