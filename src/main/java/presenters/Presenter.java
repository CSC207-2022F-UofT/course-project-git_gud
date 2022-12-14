/**
 * This presenter class contains methods to be called for different use cases which updates the view
 */
package presenters;


import views.ViewLoginPage;
import views.dashboard.SettingsPage;

public class Presenter {

    /**
     * This method completes registration by going back to the login page after user finishes signing up
     */
    public void completeRegistration(ViewLoginPage x){
//        Inject the part of the view that needs updating here, using dependency inversion because of the dependency rule
        x.message.setText("You can sign in now");
        x.passwordField.setText("");
        x.usernameField.setText("");
        x.emailField.setText("");
        x.signupButton.setVisible(false);
        x.loginButton.setVisible(true);
    }
    /**
     * This method tells the user that password is wrong
     */
    public void falseLogin(ViewLoginPage x){
        x.message.setText("Please Enter Correct Password");
        x.passwordField.setText("");
    }

    /**
     * This method transitions to the dashboard as user has successfully logged in
     */
    public void login(ViewLoginPage x){
        x.frame.dispose();
        SettingsPage dashboardViewer = new SettingsPage();
        dashboardViewer.CreateSettingsPage(null);
    }

    /**
     * This method asks the user to signup
     */
    public void pleaseSignup(ViewLoginPage x){
        x.loginButton.setVisible(false);
        x.message.setText("Please Sign up");
    }

    /**
     * Thsi method tells the user the username already exists error when trying to sign up
     */
    public void usernameExists(ViewLoginPage x){
        x.message.setText("Username Already Exists");
        x.usernameField.setText("");
    }

}
