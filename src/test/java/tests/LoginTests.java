package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginPositiveTest(){
     // open login form
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("abc@def.com", "$Abcdef12345");
        // click on button login
        app.getHelperUser().submitLogin();
        // assert
        app.getHelperUser().pause(3000);
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));
    }
    @Test
    public void loginNegativeTestWrongEmail(){
          // open login form
            app.getHelperUser().openLoginRegistrationForm();
          // fill login form
          app.getHelperUser().fillLoginRegistrationForm("abcdef.com", "$Abcdef12345");
          // click on button login
          app.getHelperUser().submitLogin();
          // assert
          app.getHelperUser().pause(3000);
          Assert.assertTrue(app.getHelperUser().isAlertPresent());
          }
    @Test
    public void loginNegativeTestWrongPassword(){
            // open login form
            app.getHelperUser().openLoginRegistrationForm();
//        // fill login form
            app.getHelperUser().fillLoginRegistrationForm("abc@def.com", "Abcdef12345");
//         // click on button login
            app.getHelperUser().submitLogin();
//        // assert
            app.getHelperUser().pause(3000);
            Assert.assertTrue(app.getHelperUser().isAlertPresent());}

}
