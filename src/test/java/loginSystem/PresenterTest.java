package loginSystem;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import presenters.Presenter;
import views.ViewLoginPage;
import static org.junit.Assert.assertEquals;

public class PresenterTest {
    ViewLoginPage testpage = new ViewLoginPage();
    @Before
    public void setup(){
        testpage.frame.setVisible(false);
    }
    @Test void presenterCompleteRegistrationTest(){
        Presenter testpresenter = new Presenter();
        testpresenter.completeRegistration(testpage);
        Assertions.assertEquals("You can sign in now", String.valueOf(testpage.message.getText()));
    }
    @Test void presenterFalseLoginTest(){
        Presenter testpresenter = new Presenter();
        testpresenter.falseLogin(testpage);
        Assertions.assertEquals("Please Enter Correct Password", String.valueOf(testpage.message.getText()));
    }
    @Test void presenterPleaseSignUp(){
        Presenter testpresenter = new Presenter();
        testpresenter.pleaseSignup(testpage);
        Assertions.assertEquals("Please Sign up", String.valueOf(testpage.message.getText()));
    }
    @Test void presenterUsernameExists(){
        Presenter testpresenter = new Presenter();
        testpresenter.usernameExists(testpage);
        Assertions.assertEquals("Username Already Exists", String.valueOf(testpage.message.getText()));
    }
}
