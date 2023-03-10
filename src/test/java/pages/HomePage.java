package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{

    WebDriver driver;
    WebDriverWait wait;

    By userAvatarIcon = By.cssSelector("img.avatar");
    public HomePage(WebDriver givenDriver){
        super(givenDriver);
        //driver = givenDriver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public WebElement getUserAvatarIcon() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(userAvatarIcon));
    }

    By firstPlaylist = By.cssSelector(".playlist:nth-child(3)");
    By playlistInputField = By.cssSelector("input[name='name']");

    public void doubleClickFirstPlayList(){
        doubleClick(driver.findElement(firstPlaylist));
    }

    public void enterPlaylistName(String playlistName){
        driver.findElement(playlistInputField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
        driver.findElement(playlistInputField).sendKeys(playlistName);
        driver.findElement(playlistInputField).sendKeys(Keys.ENTER);
    }

    public HomePage getUserAvatar(){
        driver.findElement(By.xpath(("//*[@id=\"userBadge\"]")));
        return this;
    }
    public boolean doesPlaylistExist(String playlistName){
        WebElement playListElement = driver.findElement(By.xpath("//a[text()='"+playlistName+"']"));
        return playListElement.isDisplayed();
    }
    public boolean isDisplayed(){
        return true;
    }

}
