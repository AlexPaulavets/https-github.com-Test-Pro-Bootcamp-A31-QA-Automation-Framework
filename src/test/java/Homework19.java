import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Homework19 extends BaseTest{


    @Test
    public void DeletePlaylistTest(){

        String playlistName = "test playlist";

        login("demo@class.com", "te$t$tudent");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@title='Create a new playlist']"))).click();

        //WebElement addPlaylist = driver.findElement(By.xpath("//i[@title='Create a new playlist']"));
        //wait.until(ExpectedConditions.visibilityOf(addPlaylist)).click();

        WebElement newPlaylist = driver.findElement(By.xpath("//li[text()='New Playlist']"));
        newPlaylist.click();

        WebElement nameField = driver.findElement(By.xpath("//input[@name='name']"));
        nameField.clear();
        nameField.sendKeys("playlistName", Keys.ENTER);

        WebElement testPlaylist = driver.findElement(By.xpath("//li/a[test()='"+playlistName+"']"));
        testPlaylist.click();

        WebElement deletePlaylist = driver.findElement(By.xpath("//button[@title='Delete this playlist']"));
        deletePlaylist.click();

        List<WebElement> playlistNames = (List<WebElement>) driver.findElement(By.xpath("//section[@id='playLists']//li/a"));

        for(WebElement p : playlistNames){
            String name = p.getText();
            if (name.equals(playlistName)) {
                Assert.assertTrue(false);
            }
        }
    }


}
