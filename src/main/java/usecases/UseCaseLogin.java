/**
 * This class login the user
 */
package usecases;
import presenters.Presenter;
import views.ViewLoginPage;

public class UseCaseLogin{
    /**
     * This method calls the login method from the Presenter class after the user successfully login
     */
    public void login(ViewLoginPage x) {
        Presenter presenter = new Presenter();
        presenter.login(x);
    }
}