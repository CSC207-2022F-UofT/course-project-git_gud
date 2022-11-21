package Controllers;

import Views.*;
import javax.swing.*;

public class PresenterViewUpdate {
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
}
