/**
 * This class is called when use enters wrong password
 */
package usecases;
import presenter.Presenter;
import ui.ViewLoginPage;

public class UseCaseFalseLogin {

    /**
     * This method calls the falseLogin method from the presenter class if the user enters the wrong password
     */
    public static void falseLogin(ViewLoginPage x){
        Presenter.falseLogin(x);
    }

}
