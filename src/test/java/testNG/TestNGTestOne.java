package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
 
public class TestNGTestOne {
  	
  	WebDriver driver;
  	//private static final Logger logger = LogManager.getLogger(TestNGTestOne.class);
  	
  @Test
  public void f() {
  	//Setting up the chrome driver exe, the second argument is the location where you have kept the driver in your system
  	 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit.Bhatt\\eclipse-workspace\\TestNG\\src\\main\\java\\driver\\chromedriver.exe");
  	System.setProperty("webdriver.ie.driver", "C:\\Users\\mohit.bhatt\\Desktop\\TestNG_project\\src\\main\\java\\driver\\IEDriverServer.exe");
  	 
  	//Setting the driver to chrome driver
  	  //driver = new ChromeDriver();
  	 driver = new InternetExplorerDriver();
  	  String url = "https://www.google.com";
  	  driver.get(url);
  	  //Capturing the title and validating if expected is equal to actual
  	  String expectedTitle = "Google";
  	  String actualTitle = driver.getTitle();
  	  Assert.assertEquals(actualTitle, expectedTitle);
    }
  @BeforeMethod
  public void beforeMethod() {
  	  System.out.println("Starting the browser session");
  	  //logger.info("TEsting reportPortal");
  }
 
  @AfterMethod
  public void afterMethod() {
  	  System.out.println("Closing the browser session");
  	  driver.quit();
  }
}

