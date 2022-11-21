/**
 * This class login the user
 */
package usecases;
import presenter.Presenter;
import ui.ViewLoginPage;

public class UseCaseLogin{

    /**
     * This method calls the login method from the Presenter class after the user successfully login
     */
    public static void login(ViewLoginPage x) {
        Presenter.login(x);
    }
}