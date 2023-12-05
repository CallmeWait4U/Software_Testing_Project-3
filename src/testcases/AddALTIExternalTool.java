package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverInstance;

public class AddALTIExternalTool extends DriverInstance {
        
        @Test
        public void tc_add_alti_external_tool_1() throws Exception {
            driver.findElement(By.id("username")).sendKeys("teacher");
            
            driver.findElement(By.id("password")).sendKeys("moodle");
            
            driver.findElement(By.id("loginbtn")).click();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
            course.click();
            
            driver.findElement(By.xpath("//*[@id=\"moremenu-dropdown-656f7063b3ae3\"]")).click();
            
            driver.findElement(By.xpath("//*[@id=\"yui_3_18_1_1_1701802084088_50\"]/ul/li[11]/a")).click();

            WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add tool")));
            add.click();
            
            WebElement toolName = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
            toolName.clear();
            toolName.sendKeys("Search Slideshare for presentations");
            WebElement toolURL = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
            toolURL.clear();
            toolURL.sendKeys("https://www.edu-apps.org/tool_redirect?id=slideshare");
            
            driver.findElement(By.xpath("//*[@id=\"id_submitbutton\"]")).click();
            
            Thread.sleep(5000);
        }
        @Test
        public void tc_add_alti_external_tool_2() throws Exception {
            driver.findElement(By.id("username")).sendKeys("teacher");
            
            driver.findElement(By.id("password")).sendKeys("moodle");
            
            driver.findElement(By.id("loginbtn")).click();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
            course.click();
            
            driver.findElement(By.xpath("//*[@id=\"moremenu-dropdown-656f7063b3ae3\"]")).click();
            
            driver.findElement(By.xpath("//*[@id=\"yui_3_18_1_1_1701802084088_50\"]/ul/li[11]/a")).click();

            WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add tool")));
            add.click();
            
            WebElement toolName = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
            toolName.clear();
            toolName.sendKeys("Search Slideshare for presentations");
            WebElement toolURL = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
            toolURL.clear();
            
            driver.findElement(By.xpath("//*[@id=\"id_submitbutton\"]")).click();
            
            Thread.sleep(5000);
        }   
        @Test
        public void tc_add_alti_external_tool_3() throws Exception {
            driver.findElement(By.id("username")).sendKeys("teacher");
            
            driver.findElement(By.id("password")).sendKeys("moodle");
            
            driver.findElement(By.id("loginbtn")).click();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
            course.click();
            
            driver.findElement(By.xpath("//*[@id=\"moremenu-dropdown-656f7063b3ae3\"]")).click();
            
            driver.findElement(By.xpath("//*[@id=\"yui_3_18_1_1_1701802084088_50\"]/ul/li[11]/a")).click();

            WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add tool")));
            add.click();
            
            WebElement toolName = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
            toolName.clear();
            toolName.sendKeys("Search Slideshare for presentations");
            WebElement toolURL = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
            toolURL.clear();
            
            driver.findElement(By.xpath("//*[@id=\"id_submitbutton\"]")).click();
            
            Thread.sleep(5000);
        }
        @Test
        public void tc_add_alti_external_tool_4() throws Exception {
            driver.findElement(By.id("username")).sendKeys("teacher");
            
            driver.findElement(By.id("password")).sendKeys("moodle");
            
            driver.findElement(By.id("loginbtn")).click();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
            course.click();
            
            driver.findElement(By.xpath("//*[@id=\"moremenu-dropdown-656f7063b3ae3\"]")).click();
            
            driver.findElement(By.xpath("//*[@id=\"yui_3_18_1_1_1701802084088_50\"]/ul/li[11]/a")).click();

            WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add tool")));
            add.click();
            
            WebElement toolName = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
            toolName.clear();
            WebElement toolURL = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
            toolURL.clear();
            toolURL.sendKeys("https://www.edu-apps.org/tool_redirect?id=slideshare");
            
            driver.findElement(By.xpath("//*[@id=\"id_submitbutton\"]")).click();
            
            Thread.sleep(5000);
        }
        @Test
        public void tc_add_alti_external_tool_5() throws Exception {
            driver.findElement(By.id("username")).sendKeys("teacher");
            
            driver.findElement(By.id("password")).sendKeys("moodle");
            
            driver.findElement(By.id("loginbtn")).click();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
            course.click();
            
            driver.findElement(By.xpath("//*[@id=\"moremenu-dropdown-656f7063b3ae3\"]")).click();
            
            driver.findElement(By.xpath("//*[@id=\"yui_3_18_1_1_1701802084088_50\"]/ul/li[11]/a")).click();

            WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add tool")));
            add.click();
            
            WebElement toolName = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
            toolName.clear();
            WebElement toolURL = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
            toolURL.clear();
            
            driver.findElement(By.xpath("//*[@id=\"id_submitbutton\"]")).click();
            
            Thread.sleep(5000);
        }
        @Test
        public void tc_add_alti_external_tool_6() throws Exception {
            driver.findElement(By.id("username")).sendKeys("teacher");
            
            driver.findElement(By.id("password")).sendKeys("moodle");
            
            driver.findElement(By.id("loginbtn")).click();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Celebrating Cultures")));
            course.click();
            
            driver.findElement(By.xpath("//*[@id=\"moremenu-dropdown-656f7063b3ae3\"]")).click();
            
            driver.findElement(By.xpath("//*[@id=\"yui_3_18_1_1_1701802084088_50\"]/ul/li[11]/a")).click();

            WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add tool")));
            add.click();
            
            WebElement toolName = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
            toolName.clear();
            WebElement toolURL = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_grade")));
            toolURL.clear();
            toolURL.sendKeys("test");
            
            driver.findElement(By.xpath("//*[@id=\"id_submitbutton\"]")).click();
            
            Thread.sleep(5000);
        }
}