package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{
    @Test
   public void registrationPositiveTest(){
        // open login form
        app.getHelperUser().openLoginRegistrationForm();
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        app.getHelperUser().fillLoginRegistrationForm("abc_" + i + "@def.com", "$Abcdef12345");
        // click on button login
        app.getHelperUser().click(By.xpath("//button[2]"));
        // assert
        app.getHelperUser().pause(3000);
        Assert.assertTrue(app.getHelperUser().isLogged());
    }
    @Test
    public void registrationNegativeTestWrongEmail(){
        // open login form
        app.getHelperUser().openLoginRegistrationForm();
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        app.getHelperUser().fillLoginRegistrationForm("abc_" + i + "def.com", "$Abcdef12345");
        // click on button login
        app.getHelperUser().click(By.xpath("//button[2]"));
        // assert
        app.getHelperUser().pause(3000);
        Assert.assertTrue(app.getHelperUser().isAlertPresent());
    }

    }

