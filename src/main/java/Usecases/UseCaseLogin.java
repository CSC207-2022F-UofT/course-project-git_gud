/**
 * This class login the user
 */
package Usecases;
import Presenters.Presenter;
import Views.ViewLoginPage;

public class UseCaseLogin{

    /**
     * This method calls the login method from the Presenter class after the user successfully login
     */
    public static void login(ViewLoginPage x) {
        Presenter.login(x);
    }
}