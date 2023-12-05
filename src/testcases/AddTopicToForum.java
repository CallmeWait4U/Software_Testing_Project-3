package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverInstance;

public class AddTopicToForum extends DriverInstance {
        
        @Test
        public void tc_add_topic_to_forum_1() throws Exception {
            driver.findElement(By.id("username")).sendKeys("teacher");
            
            driver.findElement(By.id("password")).sendKeys("moodle");
            
            driver.findElement(By.id("loginbtn")).click();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Critical Thinking: Develop your skills")));
            course.click();
            
            driver.findElement(By.linkText("Module discussion: Speak your mind!")).click();
            
            driver.findElement(By.linkText("Add a new discussion topic")).click();
            
            WebElement subject = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_subject")));
            subject.sendKeys("A foo topic");
            
            WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_messageeditable")));
            message.sendKeys("A example message");
            
            WebElement post = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"id_submitbutton\"]")));
            post.click();
            Thread.sleep(5000);
        }
        
        @Test
        public void tc_add_topic_to_forum_2() throws Exception {
            driver.findElement(By.id("username")).sendKeys("teacher");
            
            driver.findElement(By.id("password")).sendKeys("moodle");
            
            driver.findElement(By.id("loginbtn")).click();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Critical Thinking: Develop your skills")));
            course.click();
            
            driver.findElement(By.linkText("Module discussion: Speak your mind!")).click();
            
            driver.findElement(By.linkText("Add a new discussion topic")).click();
            
            WebElement subject = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_subject")));
            subject.sendKeys("A foo topic");
            
            WebElement post = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"id_submitbutton\"]")));
            post.click();
            Thread.sleep(5000);
        }
        
        @Test
        public void tc_add_topic_to_forum_3() throws Exception {
            driver.findElement(By.id("username")).sendKeys("teacher");
            
            driver.findElement(By.id("password")).sendKeys("moodle");
            
            driver.findElement(By.id("loginbtn")).click();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Critical Thinking: Develop your skills")));
            course.click();
            
            driver.findElement(By.linkText("Module discussion: Speak your mind!")).click();
            
            driver.findElement(By.linkText("Add a new discussion topic")).click();

            WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_messageeditable")));
            message.sendKeys("A example message");
            
            WebElement post = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"id_submitbutton\"]")));
            post.click();
            Thread.sleep(5000);
        }
        
        @Test
        public void tc_add_topic_to_forum_4() throws Exception {
            driver.findElement(By.id("username")).sendKeys("teacher");
            
            driver.findElement(By.id("password")).sendKeys("moodle");
            
            driver.findElement(By.id("loginbtn")).click();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Critical Thinking: Develop your skills")));
            course.click();
            
            driver.findElement(By.linkText("Module discussion: Speak your mind!")).click();
            
            driver.findElement(By.linkText("Add a new discussion topic")).click();
            
            WebElement post = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"id_submitbutton\"]")));
            post.click();
            Thread.sleep(5000);
        }
}