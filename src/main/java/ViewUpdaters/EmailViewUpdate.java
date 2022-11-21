package ViewUpdaters;

import Views.EmailView;

import javax.swing.*;

public class EmailViewUpdate {
    public EmailViewUpdate(EmailView var2){
        JLabel newInfo = new JLabel("Your Email Has Been Changed!");
        var2.email.add(newInfo);
        var2.email.revalidate();
    }
}
