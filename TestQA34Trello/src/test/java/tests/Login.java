package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {
    @BeforeMethod
    public void preConditions(){
        if(isLogged()){
            logOut();
        }

    }


    @Test
    public void loginPositive() throws InterruptedException {
        initLogin();
        fillInLoginForm();
        submitLogin();

    }


}
