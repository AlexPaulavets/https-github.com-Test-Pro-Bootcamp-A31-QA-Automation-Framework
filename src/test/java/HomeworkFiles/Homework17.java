package HomeworkFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;



public class Homework17{

    public static WebDriver driver = null;
    public static String url = null;
    public static WebDriverWait wait = null;

@Test
    public static void addSongToPlaylist(){

    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    String url = "http://bbb.testpro.io/";
    driver.get(url);

        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        emailField.clear();
        emailField.sendKeys("ssalem413@outlook.com");

        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
        passwordField.clear();
        passwordField.sendKeys("te$t$tudent");

        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
        submitButton.click();

        WebElement songsList = driver.findElement(By.xpath("//*[@class='songs']"));
        songsList.click();

        WebElement songSelected = driver.findElement(By.xpath("//*[@id=\"queueWrapper\"]/div/div/div[1]/table/tr/td[2]"));
        songSelected.click();

        WebElement addToButton = driver.findElement(By.xpath("//button[@class=\"btn-add-to\"]"));
        addToButton.click();

        WebElement addToPlaylist = driver.findElement(By.xpath("//button[@class=\"btn-add-to\"]"));
        addToPlaylist.click();

        //Actions acts = new Actions(driver);
        //acts.clickAndHold(songsList)
          //  .release(playlist)
            //.build()
           // .perform();

       // playlist.click();


}

    //public static void launchBrowser(String BaseURL) {
       // Homework17.driver = new ChromeDriver();
//        LoginTests.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //url = BaseURL;
        //driver.get(url);
    //wait = new WebDriverWait(Homework17.driver, Duration.ofSeconds(20));
    //}
}
