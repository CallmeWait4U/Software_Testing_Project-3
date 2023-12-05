package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import base.DriverInstance;

public class Login extends DriverInstance{

	@Test
    public void tc_login_1() throws Exception {
		driver.findElement(By.id("username")).sendKeys("privacyofficer");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
	
	@Test
    public void tc_login_2() throws Exception {
		driver.findElement(By.id("username")).sendKeys("teacher");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
	
	@Test
    public void tc_login_3() throws Exception {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
	
	@Test
    public void tc_login_4() throws Exception {
		driver.findElement(By.id("username")).sendKeys("parent");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
	
	@Test
    public void tc_login_5() throws Exception {
		driver.findElement(By.id("username")).sendKeys("invalidusername");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
	
	@Test
    public void tc_login_6() throws Exception {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("invalidpassword");
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
	
	@Test
    public void tc_login_7() throws Exception {
		driver.findElement(By.id("username")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
	
	@Test
    public void tc_login_8() throws Exception {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
}
