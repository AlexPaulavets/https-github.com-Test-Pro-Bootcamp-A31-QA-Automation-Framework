import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest{

    @Test
    public void testPlayASing(){
        login("demo@class.com", "te$t$tudent");
        playSong();
        isSongPlaying();

    }

    public void playSong(){

        WebElement playNxtBtn = driver.findElement(By.xpath("//i[@data-testid='play-next-btn']"));
        WebElement playBtn = driver.findElement(By.xpath("//span[@data-testid='play-btn']"));

        playNxtBtn.click();
        playBtn.click();

    }
    public void isSongPlaying(){

        WebElement soundbar = driver.findElement(By.xpath("//div[@data-testid='sound-bar-play']"));
        Assert.assertTrue(soundbar.isDisplayed());

    }

}
