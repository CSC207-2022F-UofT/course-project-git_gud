
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//User Interface
public class ViewLoginPage implements ActionListener {
    JButton loginButton;
    JTextField usernameField;
    JPasswordField passwordField;
    JTextField emailField;
    JLabel message;
    ViewLoginPage(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(50,100,75,25);
        usernameLabel.setLocation(50,100);

        usernameField = new JTextField();
        usernameField.setBounds(130,100,200,25);
        usernameField.setLocation(130,100);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(50,100,75,25);
        emailLabel.setLocation(50,150);

        emailField = new JTextField();
        emailField.setBounds(130,150,200,25);
        emailField.setLocation(130,150);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50,200,75,25);
        passwordLabel.setLocation(50,200);

        passwordField = new JPasswordField();
        passwordField.setBounds(130,200,200,25);
        passwordField.setLocation(130,200);

        message = new JLabel();
        message.setBounds(50,100,100,35);
        message.setLocation(120,250);
        message.setText("testing");

        loginButton = new JButton("Login");
        loginButton.setBounds(125,200,100,25);
        loginButton.setLocation(125,200);
        loginButton.addActionListener(this);

        frame.add(usernameLabel);
        frame.add(emailLabel);
        frame.add(message);
        frame.add(passwordLabel);
        frame.add(usernameField);
        frame.add(passwordField);
        frame.add(emailField);
        frame.add(loginButton);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton){
            Controller.Verify(this);
        }
    }
}
