package usecases;
import presenter.Presenter;
import ui.ViewLoginPage;

public class UseCaseLogin{
    public static void login(ViewLoginPage x) {
        Presenter.login(x);
    }
}