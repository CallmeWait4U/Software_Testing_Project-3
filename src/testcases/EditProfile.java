package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverInstance;

public class EditProfile extends DriverInstance {
	
	@Test
	public void tc_edit_profile_1() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		driver.findElement(By.cssSelector(".userbutton")).click();
    driver.findElement(By.linkText("Profile")).click();
    driver.findElement(By.linkText("Edit profile")).click();
    driver.findElement(By.id("id_firstname")).click();
    driver.findElement(By.id("id_firstname")).sendKeys("Barbaraa");
    driver.findElement(By.id("id_lastname")).click();
    driver.findElement(By.id("id_lastname")).sendKeys("Gardnerr");
    driver.findElement(By.id("id_email")).click();
    driver.findElement(By.id("id_email")).sendKeys("barbaragardner@example.com");
    driver.findElement(By.id("id_submitbutton")).click();
		
		driver.findElement(By.id("user-menu-toggle")).click();

		driver.findElement(By.linkText("Log out")).click();
	}
	
	@Test
	public void tc_edit_profile_2() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		driver.findElement(By.cssSelector(".userbutton")).click();
    driver.findElement(By.linkText("Profile")).click();
    driver.findElement(By.linkText("Edit profile")).click();
    driver.findElement(By.id("id_firstname")).click();
    driver.findElement(By.id("id_firstname")).sendKeys(" ");
    driver.findElement(By.id("id_lastname")).click();
    driver.findElement(By.id("id_lastname")).sendKeys("Gardnerr");
    driver.findElement(By.id("id_email")).click();
    driver.findElement(By.id("id_email")).sendKeys("barbaragardner@example.com");
    driver.findElement(By.id("id_submitbutton")).click();
		
		driver.findElement(By.id("user-menu-toggle")).click();

		driver.findElement(By.linkText("Log out")).click();
	}
	
	@Test
	public void tc_edit_profile_3() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		driver.findElement(By.cssSelector(".userbutton")).click();
    driver.findElement(By.linkText("Profile")).click();
    driver.findElement(By.linkText("Edit profile")).click();
    driver.findElement(By.id("id_firstname")).click();
    driver.findElement(By.id("id_firstname")).sendKeys("Barbaraa");
    driver.findElement(By.id("id_lastname")).click();
    driver.findElement(By.id("id_lastname")).sendKeys(" ");
    driver.findElement(By.id("id_email")).click();
    driver.findElement(By.id("id_email")).sendKeys("barbaragardner@example.com");
    driver.findElement(By.id("id_submitbutton")).click();
		
		driver.findElement(By.id("user-menu-toggle")).click();

		driver.findElement(By.linkText("Log out")).click();
	}

	@Test
	public void tc_edit_profile_4() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		driver.findElement(By.cssSelector(".userbutton")).click();
    driver.findElement(By.linkText("Profile")).click();
    driver.findElement(By.linkText("Edit profile")).click();
    driver.findElement(By.id("id_firstname")).click();
    driver.findElement(By.id("id_firstname")).sendKeys("Barbaraa");
    driver.findElement(By.id("id_lastname")).click();
    driver.findElement(By.id("id_lastname")).sendKeys("Gardnerr");
    driver.findElement(By.id("id_email")).click();
    driver.findElement(By.id("id_email")).sendKeys("barbaragardner");
    driver.findElement(By.id("id_submitbutton")).click();
		
		driver.findElement(By.id("user-menu-toggle")).click();

		driver.findElement(By.linkText("Log out")).click();
	}

	@Test
	public void tc_edit_profile_5() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		driver.findElement(By.cssSelector(".userbutton")).click();
    driver.findElement(By.linkText("Profile")).click();
    driver.findElement(By.linkText("Edit profile")).click();
    driver.findElement(By.id("id_firstname")).click();
    driver.findElement(By.id("id_firstname")).sendKeys("Barbaraa");
    driver.findElement(By.id("id_lastname")).click();
    driver.findElement(By.id("id_lastname")).sendKeys("Gardnerr");
    driver.findElement(By.id("id_email")).click();
    driver.findElement(By.id("id_email")).sendKeys(" ");
    driver.findElement(By.id("id_submitbutton")).click();
		
		driver.findElement(By.id("user-menu-toggle")).click();

		driver.findElement(By.linkText("Log out")).click();
	}
}
