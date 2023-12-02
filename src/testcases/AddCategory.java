package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverInstance;

public class AddCategory extends DriverInstance {
	
	@Test
	public void tc_add_category_1() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("manager");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		driver.findElement(By.linkText("Site administration")).click();

		driver.findElement(By.linkText("Courses")).click();
		
		WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add a category")));
		course.click();
		
		WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_name")));
		name.sendKeys("test");
		
		WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_submitbutton")));
		submit.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-menu-toggle")).click();

		driver.findElement(By.linkText("Log out")).click();
	}
	
	@Test
	public void tc_add_category_2() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("manager");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		driver.findElement(By.linkText("Site administration")).click();

		driver.findElement(By.linkText("Courses")).click();
		
		WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add a category")));
		course.click();
		
		WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_name")));
		name.sendKeys("");
		
		WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_submitbutton")));
		submit.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-menu-toggle")).click();

		driver.findElement(By.linkText("Log out")).click();
	}
	
	@Test
	public void tc_add_category_3() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("manager");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		driver.findElement(By.linkText("Site administration")).click();

		driver.findElement(By.linkText("Courses")).click();
		
		WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add a category")));
		course.click();

		WebElement typeCategory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/span/span")));
		typeCategory.click();
		
		WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_name")));
		name.sendKeys("test");
		
		WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_submitbutton")));
		submit.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-menu-toggle")).click();

		driver.findElement(By.linkText("Log out")).click();
	}
	
	@Test
	public void tc_add_category_4() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("manager");
		
		driver.findElement(By.id("password")).sendKeys("moodle");
		
		driver.findElement(By.id("loginbtn")).click();
		
		driver.findElement(By.linkText("Site administration")).click();

		driver.findElement(By.linkText("Courses")).click();
		
		WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add a category")));
		course.click();

		WebElement typeCategory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/span/span")));
		typeCategory.click();
		
		WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_name")));
		name.sendKeys("");
		
		WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_submitbutton")));
		submit.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-menu-toggle")).click();

		driver.findElement(By.linkText("Log out")).click();
	}

}
