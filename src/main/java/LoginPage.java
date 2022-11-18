
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage implements ActionListener {
    JButton loginButton;
    JTextField usernameField;
    JPasswordField passwordField;
    LoginPage(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        JLabel usernamelabel = new JLabel("Username");
        usernamelabel.setBounds(50,100,75,25);
        usernamelabel.setLocation(50,100);

        usernameField = new JTextField();
        usernameField.setBounds(130,100,200,25);
        usernameField.setLocation(130,100);

        JLabel emaillabel = new JLabel("Email");
        emaillabel.setBounds(50,100,75,25);
        emaillabel.setLocation(50,150);

        JTextField emailfield = new JTextField();
        emailfield.setBounds(130,150,200,25);
        emailfield.setLocation(130,150);

        JLabel passwordlabel = new JLabel("Password");
        passwordlabel.setBounds(50,200,75,25);
        passwordlabel.setLocation(50,200);

        passwordField = new JPasswordField();
        passwordField.setBounds(130,200,200,25);
        passwordField.setLocation(130,200);

        JLabel message = new JLabel();
        message.setBounds(50,100,100,35);
        message.setLocation(120,250);
        message.setText("testing");

        loginButton = new JButton("Login");
        loginButton.setBounds(125,200,100,25);
        loginButton.setLocation(125,200);
        loginButton.addActionListener(this);

        frame.add(usernamelabel);
        frame.add(emaillabel);
        frame.add(message);
        frame.add(passwordlabel);
        frame.add(usernameField);
        frame.add(passwordField);
        frame.add(emailfield);
        frame.add(loginButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton){
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());
        }
    }
}
