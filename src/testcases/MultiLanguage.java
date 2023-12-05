package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverInstance;

public class MultiLanguage extends DriverInstance{

    @Test
    public void tc_multilanguage_1() throws Exception {
        driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.findElement(By.id("user-menu-toggle")).click();
        driver.findElement(By.linkText("Language")).click();
        
        driver.findElement(By.linkText("English (en)")).click();

        Thread.sleep(3000);
		driver.findElement(By.id("user-menu-toggle")).click();
		driver.findElement(By.linkText("Log out")).click();
    }

    @Test
    public void tc_multilanguage_2() throws Exception {
        driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.findElement(By.id("user-menu-toggle")).click();
        driver.findElement(By.linkText("Language")).click();
        
        driver.findElement(By.linkText("Vietnamese (vi)")).click();

        Thread.sleep(3000);
		driver.findElement(By.id("user-menu-toggle")).click();
		driver.findElement(By.linkText("Log out")).click();
    }

    @Test
    public void tc_multilanguage_3() throws Exception {
        driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.findElement(By.id("user-menu-toggle")).click();
        driver.findElement(By.linkText("Language")).click();
        
        driver.findElement(By.linkText("eesti (et)")).click();

        Thread.sleep(3000);
		driver.findElement(By.id("user-menu-toggle")).click();
		driver.findElement(By.linkText("Log out")).click();
    }

    @Test
    public void tc_multilanguage_4() throws Exception {
        driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.findElement(By.id("user-menu-toggle")).click();
        driver.findElement(By.linkText("Language")).click();
        
        driver.findElement(By.linkText("Ebon (mh)")).click();

        Thread.sleep(3000);
		driver.findElement(By.id("user-menu-toggle")).click();
		driver.findElement(By.linkText("Log out")).click();
    }

}