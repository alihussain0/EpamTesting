package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class GoogleLogin {
    public  void googleTest() throws InterruptedException

    {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://mail.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ali.rahber@maxelevn.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Alir77$$");

        Thread.sleep(1000);


        driver.close()
    }

}