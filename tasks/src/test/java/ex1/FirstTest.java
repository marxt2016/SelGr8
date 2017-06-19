package ex1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by qwer on 19.06.2017.
 */
public class FirstTest {

    private WebDriver driver;

    @Before
    public void start() {
        driver = new ChromeDriver();

    }

    @Test
    public void firstTest (){
        driver.get ("http://www.ya.ru");
        driver.findElement(By.name("text")).sendKeys("qa");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }

}
