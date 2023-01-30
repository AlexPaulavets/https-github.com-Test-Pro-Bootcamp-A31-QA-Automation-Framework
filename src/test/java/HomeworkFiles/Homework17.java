

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Homework17 extends BaseTest {

    @Test
    public void addSongToPlaylist() throws InterruptedException {

        BaseTest.login("demo@class.com", "te$t$tudent");
        Thread.sleep(2000);
        grabASong();

    }
    public void grabASong(){

        WebElement songSelected = BaseTest.driver.findElement(By.xpath("//article[@data-test='song-card']"));
        WebElement playlist = BaseTest.driver.findElement(By.xpath("//ul[@class='menu submenu menu-add-to']/li[contains(text(),'test')]"));

        Actions acts = new Actions(BaseTest.driver);
        acts.clickAndHold(songSelected)
                .release(playlist)
                .build()
                .perform();
       // acts.dragAndDrop(songSelected, playlist).build().perform();

    }

}
