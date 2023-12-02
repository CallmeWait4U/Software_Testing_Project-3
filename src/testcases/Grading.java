package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverInstance;

public class Grading extends DriverInstance {
	
	@Test
	public void tc_grading_1() throws Exception {
		driver.findElement(By.id("username")).sendKeys("teacher");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
	    course.click();
	    
	    driver.findElement(By.linkText("Assignment: Languages of Love")).click();
	    
	    driver.findElement(By.linkText("View all submissions")).click();
	    
	    driver.findElement(By.linkText("Grade")).click();
	    
	    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
	    input.clear();
	    input.sendKeys("-1");
	    
	    WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Save changes')]")));
	    save.click();
	    
	    Thread.sleep(5000);
	}
	
	@Test
	public void tc_grading_2() throws Exception {
		driver.findElement(By.id("username")).sendKeys("teacher");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
	    course.click();
	    
	    driver.findElement(By.linkText("Assignment: Languages of Love")).click();
	    
	    driver.findElement(By.linkText("View all submissions")).click();
	    
	    driver.findElement(By.linkText("Grade")).click();
	    
	    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
	    input.clear();
	    input.sendKeys("0");
	    
	    WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Save changes')]")));
	    save.click();
	    
	    Thread.sleep(5000);
	}
	

	@Test
	public void tc_grading_3() throws Exception {
		driver.findElement(By.id("username")).sendKeys("teacher");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
	    course.click();
	    
	    driver.findElement(By.linkText("Assignment: Languages of Love")).click();
	    
	    driver.findElement(By.linkText("View all submissions")).click();
	    
	    driver.findElement(By.linkText("Grade")).click();
	    
	    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
	    input.clear();
	    input.sendKeys("1");
	    
	    WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Save changes')]")));
	    save.click();
	    
	    Thread.sleep(5000);
	}
	

	@Test
	public void tc_grading_4() throws Exception {
		driver.findElement(By.id("username")).sendKeys("teacher");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
	    course.click();
	    
	    driver.findElement(By.linkText("Assignment: Languages of Love")).click();
	    
	    driver.findElement(By.linkText("View all submissions")).click();
	    
	    driver.findElement(By.linkText("Grade")).click();
	    
	    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
	    input.clear();
	    input.sendKeys("50");
	    
	    WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Save changes')]")));
	    save.click();
	    
	    Thread.sleep(5000);
	}
	

	@Test
	public void tc_grading_5() throws Exception {
		driver.findElement(By.id("username")).sendKeys("teacher");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
	    course.click();
	    
	    driver.findElement(By.linkText("Assignment: Languages of Love")).click();
	    
	    driver.findElement(By.linkText("View all submissions")).click();
	    
	    driver.findElement(By.linkText("Grade")).click();
	    
	    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
	    input.clear();
	    input.sendKeys("99");
	    
	    WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Save changes')]")));
	    save.click();
	    
	    Thread.sleep(5000);
	}
	

	@Test
	public void tc_grading_6() throws Exception {
		driver.findElement(By.id("username")).sendKeys("teacher");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
	    course.click();
	    
	    driver.findElement(By.linkText("Assignment: Languages of Love")).click();
	    
	    driver.findElement(By.linkText("View all submissions")).click();
	    
	    driver.findElement(By.linkText("Grade")).click();
	    
	    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
	    input.clear();
	    input.sendKeys("100");
	    
	    WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Save changes')]")));
	    save.click();
	    
	    Thread.sleep(5000);
	}
	
	@Test
	public void tc_grading_7() throws Exception {
		driver.findElement(By.id("username")).sendKeys("teacher");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
	    course.click();
	    
	    driver.findElement(By.linkText("Assignment: Languages of Love")).click();
	    
	    driver.findElement(By.linkText("View all submissions")).click();
	    
	    driver.findElement(By.linkText("Grade")).click();
	    
	    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
	    input.clear();
	    input.sendKeys("101");
	    
	    WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Save changes')]")));
	    save.click();
	    
	    Thread.sleep(5000);
	}

}
