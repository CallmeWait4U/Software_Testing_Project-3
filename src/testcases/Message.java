package testcases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import base.DriverInstance;
public class Message extends DriverInstance {
	@Test
    public void tc_message_1() throws Exception {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement chatIcon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".fa-comment-o")));
		chatIcon.click();
		

		WebElement privateChat = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[2]/div[4]/div/div[3]/div[5]/div/div[3]/div[1]/button")));
		privateChat.click();


		WebElement firstConversation = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[2]/div[4]/div/div[3]/div[5]/div/div[3]/div[2]/div[2]/a[1]")));
		firstConversation.click();
		

		
		WebElement textarea = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[2]/div[4]/div/div[4]/div[1]/div[1]/div[2]/textarea")));
		textarea.sendKeys("message hello");

		

		driver.findElement(By.cssSelector(".fa-paper-plane")).click();
		Thread.sleep(5000);
    }
	
	@Test
    public void tc_message_2() throws Exception {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement avatar = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".userpicture")));
		avatar.click();
		
		
		WebElement messageA = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[2]/nav/div[2]/div[5]/div/div/div/div/div/div[1]/a[4]")));
		messageA.click();
		
		
		Thread.sleep(5000);
		
		
		WebElement privateChat = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[2]/div[3]/div/div[2]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/button")));
		privateChat.click();


		WebElement firstConversation = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[2]/div[3]/div/div[2]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/div[3]/div[2]/div[2]/a[1]")));
		firstConversation.click();
		

		
		WebElement textarea = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[2]/div[3]/div/div[2]/div/section/div/div/div/div/div[2]/div[3]/div/div[1]/div[2]/textarea")));
		textarea.sendKeys("message hello");

		

		driver.findElement(By.cssSelector(".fa-paper-plane")).click();
		Thread.sleep(3000);
    }
}
