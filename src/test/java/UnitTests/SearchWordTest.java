package UnitTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SearchWordTest {
 
	WebDriver driver;
//	String sURL = "https://www.google.com.au/?gfe_rd=cr&ei=ckzuVd-sGsLu8weT2qGICw&gws_rd=ssl";
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
  }  
	
  @Test(enabled=false)
  public void searchWord() {
	  driver.findElement(By.id("lst-ib")).sendKeys("Facebok");
	  driver.findElement(By.xpath("//*[@id='sblsbb']/button")).click();	  
	  System.out.println(driver.getTitle());
	  
	  driver.findElement(By.linkText("Facebook Login")).click();
  }
  
  @Test
  public void Facebook() {
	  driver.findElement(By.id("email")).sendKeys("Selenium");
	  driver.findElement(By.id("pass")).sendKeys("Selenium");
	  
	  driver.findElement(By.id("u_0_x")).click();
	  
	  System.out.println(driver.getTitle());
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
