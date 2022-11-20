package presenter;

import ui.ViewLoginPage;

public class Presenter {
    public static void completeRegistration(ViewLoginPage x){
//        Inject the part of the view that needs updating here, using dependency inversion because of the dependency rule
        x.message.setText("You can sign in now");
        x.passwordField.setText("");
        x.usernameField.setText("");
        x.emailField.setText("");
        x.signupButton.setVisible(false);
    }
    public static void falseLogin(ViewLoginPage x){
        x.message.setText("Please Enter Correct Password");
        x.passwordField.setText("");
    }

    public static void login(ViewLoginPage x){

    }

    public static void pleaseSignup(ViewLoginPage x){
        x.loginButton.setVisible(false);
        x.message.setText("Please Sign up");
    }

    public static void usernameExists(ViewLoginPage x){
        x.message.setText("Username Already Exists");
        x.usernameField.setText("");
    }

}
