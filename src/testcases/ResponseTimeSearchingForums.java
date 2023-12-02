package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverInstance;

public class ResponseTimeSearchingForums extends DriverInstance {
	
	@Test
	public void tc_response_time_searching_forums_1() throws Exception {
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Mindful course creation")));
	    course.click();
	    
	    WebElement forum = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div[2]/div/div/div/div/a")));
	    forum.click();
	    
	    driver.findElement(By.name("search")).sendKeys("on");
	    
	    Thread.sleep(500);
	    
	    WebElement button_search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/div/div/form/div/div/button/i")));
	    button_search.click();
	    
	    Thread.sleep(1000);
	}

	@Test
	public void tc_response_time_searching_forums_2() throws Exception {
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Mindful course creation")));
	    course.click();
	    
	    WebElement forum = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div[2]/div/div/div/div/a")));
	    forum.click();
	    
	    driver.findElement(By.name("search")).sendKeys("up");
	    
	    Thread.sleep(500);
	    
	    WebElement button_search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/div/div/form/div/div/button/i")));
	    button_search.click();
	    
	    Thread.sleep(1000);
	}

}
