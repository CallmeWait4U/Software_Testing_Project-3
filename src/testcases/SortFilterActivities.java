package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverInstance;

public class SortFilterActivities extends DriverInstance {
	
	@Test
	public void tc_sort_filter_activities_1() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		driver.findElement(By.id("sortingdropdown")).click();
    
		driver.findElement(By.linkText("Sort by last accessed")).click();
		
		driver.findElement(By.id("user-menu-toggle")).click();

		driver.findElement(By.linkText("Log out")).click();
	}
	
	@Test
	public void tc_sort_filter_activities_2() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Search']")).click();
    
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("and");
    
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys(Keys.ENTER);
    
		driver.findElement(By.cssSelector(".btn-clear > .icon")).click();
		
		driver.findElement(By.id("user-menu-toggle")).click();

		driver.findElement(By.linkText("Log out")).click();
	}

	@Test
	public void tc_sort_filter_activities_3() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("manager");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		driver.findElement(By.id("groupingdropdown")).click();

    driver.findElement(By.linkText("In progress")).click();

		driver.findElement(By.id("groupingdropdown")).click();

		driver.findElement(By.linkText("Future")).click();

    driver.findElement(By.id("groupingdropdown")).click();

    driver.findElement(By.linkText("Past")).click();

		driver.findElement(By.id("groupingdropdown")).click();

		driver.findElement(By.linkText("Starred")).click();

		driver.findElement(By.id("groupingdropdown")).click();
    
		driver.findElement(By.linkText("Removed from view")).click();
		
		driver.findElement(By.id("user-menu-toggle")).click();

		driver.findElement(By.linkText("Log out")).click();
	}
}
