package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverInstance;

public class ResponseTimeSubmitingAQuiz extends DriverInstance{
	@Test
	public void tc_response_time_submiting_a_quiz_forums_1() throws Exception {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		Thread.sleep(5000);
		
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));
		search.sendKeys("Critical Thinking", Keys.ENTER);
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".multiline"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Quiz icon']"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/button"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("id_submitbutton"))).click();

		for(int i = 1; i <= 10; i++) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//div[%d]/div[2]/div/fieldset/div/div/input", i)))).click();
		}

		
		WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("mod_quiz-next-nav")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[5]/div/div/form/button"))).click();
		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[5]/div[2]/div/div/div[3]/button[2]"))).click();
		
		
		
	}
	
	@Test
	public void tc_response_time_submiting_a_quiz_forums_2() throws Exception {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		Thread.sleep(5000);
		
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));
		search.sendKeys("Critical Thinking", Keys.ENTER);
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".multiline"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Quiz icon']"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/button"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("id_submitbutton"))).click();

		WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("mod_quiz-next-nav")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[5]/div/div/form/button"))).click();
		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[5]/div[2]/div/div/div[3]/button[2]"))).click();
	}
}
