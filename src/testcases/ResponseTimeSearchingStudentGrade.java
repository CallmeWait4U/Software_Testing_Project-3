package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverInstance;

public class ResponseTimeSearchingStudentGrade extends DriverInstance {
    @Test
	public void tc_response_time_searching_student_grade_1() throws Exception {
        driver.findElement(By.id("username")).sendKeys("teacher");
        
        driver.findElement(By.id("password")).sendKeys("moodle");
        
        driver.findElement(By.id("loginbtn")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Critical Thinking: Develop your skills")));
        course.click();
        
        WebElement grade = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"moremenu-656f81aab33cb-nav-tabs\"]/li[4]/a")));
        grade.click();
        
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchinput-656f81ef497b3656f81eeae9a131\"]")));
        search.click();
        search.sendKeys("Brian");
        
        WebElement view = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"select-all\"]")));
        view.click();
        
        Thread.sleep(1000);
    }
    @Test
	public void tc_response_time_searching_student_grade_2() throws Exception {
        driver.findElement(By.id("username")).sendKeys("teacher");
        
        driver.findElement(By.id("password")).sendKeys("moodle");
        
        driver.findElement(By.id("loginbtn")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Critical Thinking: Develop your skills")));
        course.click();
        
        WebElement grade = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"moremenu-656f81aab33cb-nav-tabs\"]/li[4]/a")));
        grade.click();
        
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchinput-656f81ef497b3656f81eeae9a131\"]")));
        search.click();
        search.sendKeys("desmond");
        
        Thread.sleep(1000);
    }
}
