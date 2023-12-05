package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverInstance;

public class SendMessage extends DriverInstance{

    @Test
    public void tc_sendmessage_1() throws Exception {
        driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.findElement(By.id("message-drawer-toggle-656f33148c39c656f3314826966")).click();
        driver.findElement(By.linkText("Group")).click();
        driver.findElement(By.linkText("Team South")).click();
        WebElement messageInput = driver.findElement(By.id("yui_3_18_1_1_1701786461964_47"));
        WebElement sendButton = driver.findElement(By.id("yui_3_18_1_1_1701786461964_54"));
        messageInput.sendKeys("Hello, this is an automated test message!");
        sendButton.click();

        Thread.sleep(3000);
		driver.findElement(By.id("user-menu-toggle")).click();
		driver.findElement(By.linkText("Log out")).click();
    }

    @Test
    public void tc_sendmessage_2() throws Exception {
        driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.findElement(By.id("message-drawer-toggle-656f33148c39c656f3314826966")).click();
        driver.findElement(By.linkText("Starred")).click();
        driver.findElement(By.linkText("Hung Fu")).click();
        WebElement messageInput = driver.findElement(By.id("yui_3_18_1_1_1701786461964_47"));
        WebElement sendButton = driver.findElement(By.id("yui_3_18_1_1_1701786461964_54"));
        messageInput.sendKeys("Hello Hung Fu!");
        sendButton.click();

        Thread.sleep(3000);
    }

    @Test
    public void tc_sendmessage_3() throws Exception {
        driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.findElement(By.id("message-drawer-toggle-656f33148c39c656f3314826966")).click();
        driver.findElement(By.linkText("Privated")).click();
        driver.findElement(By.linkText("Brian Franklin")).click();
        WebElement messageInput = driver.findElement(By.id("yui_3_18_1_1_1701786461964_47"));
        WebElement sendButton = driver.findElement(By.id("yui_3_18_1_1_1701786461964_54"));
        messageInput.sendKeys("Hello Brian Franklin!");
        sendButton.click();

        Thread.sleep(3000);
    }
}