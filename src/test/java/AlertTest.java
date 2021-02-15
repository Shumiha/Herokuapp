import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertTest {
    @Test
    public void jsAlert() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\IdeaProjects\\Herokuapp\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.cssSelector("[onclick='jsAlert()']")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"I am a JS Alert");
        alert.dismiss();
        driver.quit();
    }

    @Test
    public void jsConfirm() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\IdeaProjects\\Herokuapp\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.cssSelector("[onclick='jsConfirm()']")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"I am a JS Confirm");
        alert.accept();
        driver.quit();
    }

    @Test
    public void jsPrompt() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\IdeaProjects\\Herokuapp\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.cssSelector("[onclick='jsPrompt()']")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"I am a JS prompt");
        driver.quit();
    }

}
