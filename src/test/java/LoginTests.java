import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    // @Test(enabled = true, priority = 0, description = "LoginEmptyEmailPasswordTest")
   @Test(dataProvider = "incorrectLoginProviders", dataProviderClass = BaseTest.class)
    public void LoginEmptyEmailPasswordTest (String email, String password) {

        login(email, password);
        Assert.assertEquals(driver.getCurrentUrl(), url);

    }
    @Test(enabled = true, priority = 1, description = "LoginValidemailValidPasswordTest")
    public static void loginValidEmailValidPasswordTest () {


        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();

        WebElement avatarIcon = driver.findElement(By.cssSelector("img.avatar"));
        Assert.assertTrue(avatarIcon.isDisplayed());

    }

    @Test(enabled = true, priority= 2, description = "LoginInvalidemailValidPasswordTest")
    public static void loginInvalidEmailValidPasswordTest () {



        provideEmail("invalid@class.com");
        providePassword("te$t$tudent");
        clickSubmit();

        Assert.assertEquals(driver.getCurrentUrl(), url);

    }


}