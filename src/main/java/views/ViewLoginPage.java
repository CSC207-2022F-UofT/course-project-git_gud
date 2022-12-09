//package views;
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
////import controllers.LogInController;
//
////User Interface
//public class ViewLoginPage implements ActionListener {
//    /**
//     * This is a UI class that instantiates the JFrame and all other components the user will first
//     * see when the program runs
//     */
//    public final JButton loginButton;
//
//    public final JFrame frame;
//    public final JTextField usernameField;
//    public final JPasswordField passwordField;
//    public final JTextField emailField;
//    public final JLabel message;
//    public final JButton signupButton;
//
//
//    public ViewLoginPage(){
//        frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(600,600);
//        frame.setTitle("Git_Gud;");
//        frame.setLayout(null);
//        JLabel usernameLabel = new JLabel("Username");
//        usernameLabel.setBounds(50,100,75,25);
//        usernameLabel.setLocation(50,100);
//
//        usernameField = new JTextField();
//        usernameField.setBounds(130,100,200,25);
//        usernameField.setLocation(130,100);
//
//        JLabel emailLabel = new JLabel("Email");
//        emailLabel.setBounds(50,100,75,25);
//        emailLabel.setLocation(50,150);
//
//        emailField = new JTextField();
//        emailField.setBounds(130,150,200,25);
//        emailField.setLocation(130,150);
//
//        JLabel passwordLabel = new JLabel("Password");
//        passwordLabel.setBounds(50,200,75,25);
//        passwordLabel.setLocation(50,200);
//
//        passwordField = new JPasswordField();
//        passwordField.setBounds(130,200,200,25);
//        passwordField.setLocation(130,200);
//
//        message = new JLabel();
//        message.setBounds(50,100,200,35);
//        message.setLocation(120,350);
//        message.setText("");
//
//        loginButton = new JButton("Login");
//        loginButton.setBounds(130,300,75,25);
//        loginButton.setLocation(135,275);
//        loginButton.addActionListener(this);
//
//        signupButton = new JButton("Signup");
//        signupButton.setBounds(210, 275, 75, 25);
//        signupButton.setLocation(210,275);
//        signupButton.setFocusable(false);
//        signupButton.addActionListener(this);
//
//        frame.add(usernameLabel);
//        frame.add(emailLabel);
//        frame.add(message);
//        frame.add(passwordLabel);
//        frame.add(usernameField);
//        frame.add(passwordField);
//        frame.add(emailField);
//        frame.add(loginButton);
//        frame.add(signupButton);
//        frame.setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == loginButton){
//            LogInController x = new LogInController();
//            x.loginButton(this);
//        } else if (e.getSource()== signupButton) {
//            LogInController y = new LogInController();
//            y.signupButton(this);
//        }
//    }
//}
