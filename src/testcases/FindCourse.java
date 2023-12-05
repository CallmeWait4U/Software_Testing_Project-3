package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverInstance;

public class FindCourse extends DriverInstance{

    @Test
    public void tc_findcourse_1() throws Exception {
        driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement searchInput = driver.findElement(By.id("nav-search-query"));
        searchInput.sendKeys("Moodle and Mountaineering");
        searchInput.submit();
    }

    @Test
    public void tc_findcourse_2() throws Exception {
        driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("moodle");
		driver.findElement(By.id("loginbtn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement searchInput = driver.findElement(By.id("nav-search-query"));
        searchInput.sendKeys("Kiem tra phan mem");
        searchInput.submit();
    }

}