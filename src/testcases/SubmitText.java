package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverInstance;


public class SubmitText extends DriverInstance{
    @Test
    public void tc_submit_text_1() throws Exception {
        driver.findElement(By.id("username")).sendKeys("student");
        
        driver.findElement(By.id("password")).sendKeys("moodle");
        
        driver.findElement(By.id("loginbtn")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Critical Thinking: Develop your skills")));
        course.click();
        WebElement assignment = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("End of course summative assignment")));
        assignment.click();
        
        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"single_button656f7e051c6948\"]")));
        submit.click();
        
        WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tinymce\"]/p")));
        message.clear();
        
        driver.findElement(By.xpath("//*[@id=\"id_submitbutton\"]")).click();
        Thread.sleep(5000);
    }
    @Test
    public void tc_submit_text_2() throws Exception {
        driver.findElement(By.id("username")).sendKeys("student");
        
        driver.findElement(By.id("password")).sendKeys("moodle");
        
        driver.findElement(By.id("loginbtn")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Critical Thinking: Develop your skills")));
        course.click();
        WebElement assignment = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("End of course summative assignment")));
        assignment.click();
        
        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"single_button656f7e051c6948\"]")));
        submit.click();
        
        WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tinymce\"]/p")));
        message.clear();
        message.sendKeys("1");
        
        driver.findElement(By.xpath("//*[@id=\"id_submitbutton\"]")).click();
        Thread.sleep(5000);
    }
    @Test
    public void tc_submit_text_3() throws Exception {
        driver.findElement(By.id("username")).sendKeys("student");
        
        driver.findElement(By.id("password")).sendKeys("moodle");
        
        driver.findElement(By.id("loginbtn")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Critical Thinking: Develop your skills")));
        course.click();
        WebElement assignment = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("End of course summative assignment")));
        assignment.click();
        
        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"single_button656f7e051c6948\"]")));
        submit.click();
        
        WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tinymce\"]/p")));
        message.clear();
        message.sendKeys("A example message");
        
        driver.findElement(By.xpath("//*[@id=\"id_submitbutton\"]")).click();
        Thread.sleep(5000);
    }
    @Test
    public void tc_submit_text_4() throws Exception {
        driver.findElement(By.id("username")).sendKeys("student");
        
        driver.findElement(By.id("password")).sendKeys("moodle");
        
        driver.findElement(By.id("loginbtn")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Critical Thinking: Develop your skills")));
        course.click();
        WebElement assignment = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("End of course summative assignment")));
        assignment.click();
        
        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"single_button656f7e051c6948\"]")));
        submit.click();
        
        WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tinymce\"]/p")));
        message.clear();
        message.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas felis magna, iaculis nec accumsan vel, imperdiet vel nunc. Maecenas efficitur tellus nec odio tempus tincidunt. Nunc elementum cursus tortor sed sodales. Sed vitae euismod orci. Praesent vehicula nulla eu eros pharetra tempor. Donec id felis augue. Nam in nisl ultricies, auctor purus eu, tristique est.\r\n" + //
                "\r\n" + //
                "Nam tincidunt blandit neque ac faucibus. Phasellus consequat risus vel fringilla sodales. Mauris dui metus, elementum at nunc ac, lobortis dapibus augue. Aliquam dignissim facilisis leo at convallis. Sed ac diam rhoncus, ultrices nibh sit amet, pellentesque tellus. Donec at nunc augue. Proin fermentum posuere urna, et pulvinar risus dignissim eget.\r\n" + //
                "\r\n" + //
                "Etiam eu risus consectetur, viverra lorem a, elementum erat. Donec congue neque imperdiet tempor faucibus. Nunc fermentum in risus vitae mollis. Nunc mollis finibus scelerisque. Pellentesque augue mauris, rhoncus a arcu commodo, convallis luctus ante. Quisque sit amet odio id quam elementum pellentesque. Donec a tristique massa. Duis semper magna est, eu bibendum ligula tempor vestibulum. Integer ac feugiat ligula, quis sagittis massa. Aenean ut vestibulum erat.\r\n" + //
                "\r\n" + //
                "In hac habitasse platea dictumst. Donec facilisis, arcu quis tempor mattis, magna nisi euismod est, vel semper neque mi eget ex. Quisque sed enim vitae ante sodales tincidunt. Sed non augue ultricies, scelerisque sem et, scelerisque lacus. Sed mi eros, congue eget commodo id, ultrices sit amet ipsum. Nulla facilisi. In hac habitasse platea dictumst. Nunc a commodo erat. Praesent lacus enim, dignissim in tellus tristique, hendrerit fermentum mauris. Pellentesque vel tristique tortor. Curabitur libero magna, fermentum eget volutpat convallis, viverra a magna. Ut venenatis dignissim viverra. Sed ac ultrices mi, a ultricies sapien. Donec mollis convallis egestas. Sed dignissim felis pretium condimentum molestie.\r\n" + //
                "\r\n" + //
                "Duis blandit eleifend diam, eget ultricies leo finibus non. In tincidunt lobortis nisl, eget sagittis enim semper id. Ut fermentum augue et orci cursus, id iaculis enim accumsan. Curabitur accumsan, ligula at blandit posuere, sapien ipsum laoreet ante, vel pretium arcu augue at felis. Quisque vitae nulla a elit malesuada faucibus. Ut vel nulla nec quam maximus mollis et non est. Fusce volutpat ultricies gravida. Aliquam nisi dolor, ultricies vel efficitur in, elementum in erat. Sed turpis neque, semper nec cursus vitae, rutrum in enim. Fusce urna diam, accumsan eu convallis sed, semper quis erat. Aenean pellentesque, ligula a sodales sodales, nisi ipsum cursus elit, sed pretium urna metus id urna. Nam augue nibh, tincidunt a nulla nec, aliquam sodales purus. Nulla sit amet velit non justo gravida hendrerit.\r\n" + //
                "\r\n" + //
                "Nunc maximus non leo dignissim pulvinar. Vestibulum vitae volutpat arcu, in fermentum metus. Morbi vitae feugiat augue. Ut finibus ante vel scelerisque porta. Donec placerat diam sed dolor consequat pharetra. Etiam vel erat elementum dolor gravida dapibus. Suspendisse eget sem velit. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Phasellus eu tempor ante. Nulla quis augue id nunc consequat scelerisque eget a libero. Curabitur non fringilla libero. Mauris molestie id magna non posuere. Vestibulum tempor velit a odio congue, ut placerat ex venenatis. Aenean at porttitor mi. Proin gravida euismod.");
        
        driver.findElement(By.xpath("//*[@id=\"id_submitbutton\"]")).click();
        Thread.sleep(5000);
    }
    @Test
    public void tc_submit_text_5() throws Exception {
        driver.findElement(By.id("username")).sendKeys("student");
        
        driver.findElement(By.id("password")).sendKeys("moodle");
        
        driver.findElement(By.id("loginbtn")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Critical Thinking: Develop your skills")));
        course.click();
        WebElement assignment = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("End of course summative assignment")));
        assignment.click();
        
        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"single_button656f7e051c6948\"]")));
        submit.click();
        
        WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tinymce\"]/p")));
        message.clear();
        message.sendKeys("A Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas felis magna, iaculis nec accumsan vel, imperdiet vel nunc. Maecenas efficitur tellus nec odio tempus tincidunt. Nunc elementum cursus tortor sed sodales. Sed vitae euismod orci. Praesent vehicula nulla eu eros pharetra tempor. Donec id felis augue. Nam in nisl ultricies, auctor purus eu, tristique est.\r\n" + //
                "\r\n" + //
                "Nam tincidunt blandit neque ac faucibus. Phasellus consequat risus vel fringilla sodales. Mauris dui metus, elementum at nunc ac, lobortis dapibus augue. Aliquam dignissim facilisis leo at convallis. Sed ac diam rhoncus, ultrices nibh sit amet, pellentesque tellus. Donec at nunc augue. Proin fermentum posuere urna, et pulvinar risus dignissim eget.\r\n" + //
                "\r\n" + //
                "Etiam eu risus consectetur, viverra lorem a, elementum erat. Donec congue neque imperdiet tempor faucibus. Nunc fermentum in risus vitae mollis. Nunc mollis finibus scelerisque. Pellentesque augue mauris, rhoncus a arcu commodo, convallis luctus ante. Quisque sit amet odio id quam elementum pellentesque. Donec a tristique massa. Duis semper magna est, eu bibendum ligula tempor vestibulum. Integer ac feugiat ligula, quis sagittis massa. Aenean ut vestibulum erat.\r\n" + //
                "\r\n" + //
                "In hac habitasse platea dictumst. Donec facilisis, arcu quis tempor mattis, magna nisi euismod est, vel semper neque mi eget ex. Quisque sed enim vitae ante sodales tincidunt. Sed non augue ultricies, scelerisque sem et, scelerisque lacus. Sed mi eros, congue eget commodo id, ultrices sit amet ipsum. Nulla facilisi. In hac habitasse platea dictumst. Nunc a commodo erat. Praesent lacus enim, dignissim in tellus tristique, hendrerit fermentum mauris. Pellentesque vel tristique tortor. Curabitur libero magna, fermentum eget volutpat convallis, viverra a magna. Ut venenatis dignissim viverra. Sed ac ultrices mi, a ultricies sapien. Donec mollis convallis egestas. Sed dignissim felis pretium condimentum molestie.\r\n" + //
                "\r\n" + //
                "Duis blandit eleifend diam, eget ultricies leo finibus non. In tincidunt lobortis nisl, eget sagittis enim semper id. Ut fermentum augue et orci cursus, id iaculis enim accumsan. Curabitur accumsan, ligula at blandit posuere, sapien ipsum laoreet ante, vel pretium arcu augue at felis. Quisque vitae nulla a elit malesuada faucibus. Ut vel nulla nec quam maximus mollis et non est. Fusce volutpat ultricies gravida. Aliquam nisi dolor, ultricies vel efficitur in, elementum in erat. Sed turpis neque, semper nec cursus vitae, rutrum in enim. Fusce urna diam, accumsan eu convallis sed, semper quis erat. Aenean pellentesque, ligula a sodales sodales, nisi ipsum cursus elit, sed pretium urna metus id urna. Nam augue nibh, tincidunt a nulla nec, aliquam sodales purus. Nulla sit amet velit non justo gravida hendrerit.\r\n" + //
                "\r\n" + //
                "Nunc maximus non leo dignissim pulvinar. Vestibulum vitae volutpat arcu, in fermentum metus. Morbi vitae feugiat augue. Ut finibus ante vel scelerisque porta. Donec placerat diam sed dolor consequat pharetra. Etiam vel erat elementum dolor gravida dapibus. Suspendisse eget sem velit. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Phasellus eu tempor ante. Nulla quis augue id nunc consequat scelerisque eget a libero. Curabitur non fringilla libero. Mauris molestie id magna non posuere. Vestibulum tempor velit a odio congue, ut placerat ex venenatis. Aenean at porttitor mi. Proin gravida euismod.");
        
        driver.findElement(By.xpath("//*[@id=\"id_submitbutton\"]")).click();
        Thread.sleep(5000);
    }
}
