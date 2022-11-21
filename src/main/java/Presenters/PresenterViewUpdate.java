package Presenters;

import Views.*;
import Views.ViewLoginPage;

import javax.swing.*;

public class PresenterViewUpdate {
    /**
     * PresenterViewUpdate consists of classes that update the current view(depending on the setting) to display
     * a confirmation message. The only differing class is UpdateDeleteView, which is used by both delete and logout
     * functions and creates a new login/signup page view to begin the process anew.
     */
    public static class UpdateEmailView extends PresenterViewUpdate {
        public UpdateEmailView(EmailView var2) {
            super();
            JLabel newInfo = new JLabel("Your Email Has Been Changed!");
            var2.email.add(newInfo);
            var2.email.revalidate();
        }
    }

    public static class UpdateUsernameView extends PresenterViewUpdate {
        public UpdateUsernameView(UsernameView var1) {
            super();
            JLabel newInfo = new JLabel("Your Username Has Been Changed!");
            var1.username.add(newInfo);
            var1.username.revalidate();
        }
    }

    public static class UpdatePasswordView extends PresenterViewUpdate {
        public UpdatePasswordView(PasswordView var3) {
            super();
            JLabel newInfo = new JLabel("Your Password Has Been Changed!");
            var3.password.add(newInfo);
            var3.password.revalidate();
        }
    }

    public static class UpdateFatView extends PresenterViewUpdate {
        public UpdateFatView(FatView var4) {
            super();
            JLabel newInfo = new JLabel("Your Fat Has Been Changed!");
            var4.fat.add(newInfo);
            var4.fat.revalidate();
        }
    }

    public static class UpdateWeightView extends PresenterViewUpdate {
        public UpdateWeightView(WeightView var5) {
            super();
            JLabel newInfo = new JLabel("Your Weight Has Been Changed!");
            var5.weight.add(newInfo);
            var5.weight.revalidate();
        }
    }

    public static class UpdateDeleteLogoutView extends PresenterViewUpdate {
        public UpdateDeleteLogoutView() {
            super();
            ViewLoginPage smth = new ViewLoginPage();
        }
    }
}
