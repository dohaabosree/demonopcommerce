package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver ;
    @Before
    public static void setUp(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://demo.nopcommerce.com/");

    }
    @After
    public static void  tearDown() throws InterruptedException {
        Thread.sleep(1000);
       //driver.quit();

    }
}
