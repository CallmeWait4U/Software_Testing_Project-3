package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.DriverInstance;

public class UploadFile extends DriverInstance {
	
	@Test
	public void tc_upload_file_1() throws Exception {
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
	    course.click();
	    
		driver.findElement(By.linkText("(Mobile assignment) View from your window")).click();
		
		List<WebElement> wElements = driver.findElements(By.xpath("//button[contains(.,'Add submission')]"));
		if (wElements.size() > 0) {
			driver.findElement(By.xpath("//button[contains(.,'Add submission')]")).click();
		} else {
			driver.findElement(By.xpath("//button[contains(.,'Remove submission')]")).click();
			driver.findElement(By.xpath("//button[contains(.,'Continue')]")).click();
			driver.findElement(By.xpath("//button[contains(.,'Add submission')]")).click();
		}
		
	    WebElement button0 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/div/a/i")));
	    button0.click();
	    
	    WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/input")));
	    button1.sendKeys("D:\\University\\HCMUT\\4_Fourth_year\\Semester_1\\Software_Testing\\Project_3\\Free_Test_Data_100KB_PDF - 1.pdf");
	    
		driver.findElement(By.xpath("//button[contains(.,'Upload this file')]")).click();
	    
	    WebElement button_submit = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_submitbutton")));
	    button_submit.click();
	}
	
	@Test
	public void tc_upload_file_2() throws Exception {
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
	    course.click();
	    
		driver.findElement(By.linkText("(Mobile assignment) View from your window")).click();
		
		List<WebElement> wElements = driver.findElements(By.xpath("//button[contains(.,'Add submission')]"));
		if (wElements.size() > 0) {
			driver.findElement(By.xpath("//button[contains(.,'Add submission')]")).click();
		} else {
			driver.findElement(By.xpath("//button[contains(.,'Remove submission')]")).click();
			driver.findElement(By.xpath("//button[contains(.,'Continue')]")).click();
			driver.findElement(By.xpath("//button[contains(.,'Add submission')]")).click();
		}
		
	    WebElement button0 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/div/a/i")));
	    button0.click();
	    
	    WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/input")));
	    button1.sendKeys("D:\\University\\HCMUT\\4_Fourth_year\\Semester_1\\Software_Testing\\Project_3\\txt-100kb - 1.txt");
	    
		driver.findElement(By.xpath("//button[contains(.,'Upload this file')]")).click();
	    
	    WebElement button_submit = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_submitbutton")));
	    button_submit.click();
	}
	
	@Test
	public void tc_upload_file_3() throws Exception {
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
	    course.click();
	    
		driver.findElement(By.linkText("(Mobile assignment) View from your window")).click();
		
		List<WebElement> wElements = driver.findElements(By.xpath("//button[contains(.,'Add submission')]"));
		if (wElements.size() > 0) {
			driver.findElement(By.xpath("//button[contains(.,'Add submission')]")).click();
		} else {
			driver.findElement(By.xpath("//button[contains(.,'Remove submission')]")).click();
			driver.findElement(By.xpath("//button[contains(.,'Continue')]")).click();
			driver.findElement(By.xpath("//button[contains(.,'Add submission')]")).click();
		}
		
	    WebElement button0 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/div/a/i")));
	    button0.click();
	    
	    WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/input")));
	    button1.sendKeys("D:\\University\\HCMUT\\4_Fourth_year\\Semester_1\\Software_Testing\\Project_3\\pdf-2mb - 1.pdf");
	    
		driver.findElement(By.xpath("//button[contains(.,'Upload this file')]")).click();

	    WebElement button_close = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div/div/span/button")));
	    button_close.click();
	    
	    WebElement button_submit = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_submitbutton")));
	    button_submit.click();
	}
	
	@Test
	public void tc_upload_file_4() throws Exception {
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
	    course.click();
	    
		driver.findElement(By.linkText("(Mobile assignment) View from your window")).click();
		
		List<WebElement> wElements = driver.findElements(By.xpath("//button[contains(.,'Add submission')]"));
		if (wElements.size() > 0) {
			driver.findElement(By.xpath("//button[contains(.,'Add submission')]")).click();
		} else {
			driver.findElement(By.xpath("//button[contains(.,'Remove submission')]")).click();
			driver.findElement(By.xpath("//button[contains(.,'Continue')]")).click();
			driver.findElement(By.xpath("//button[contains(.,'Add submission')]")).click();
		}
		
	    WebElement button0 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/div/a/i")));
	    button0.click();
	    
	    WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/input")));
	    button1.sendKeys("D:\\University\\HCMUT\\4_Fourth_year\\Semester_1\\Software_Testing\\Project_3\\txt-2mb - 1.txt");
	    
		driver.findElement(By.xpath("//button[contains(.,'Upload this file')]")).click();

	    WebElement button_close = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div/div/span/button")));
	    button_close.click();
	    
	    WebElement button_submit = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_submitbutton")));
	    button_submit.click();
	}

}
