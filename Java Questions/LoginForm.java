import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {

  
    private JLabel lblUsername, lblPassword, lblMessage;
    private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JButton btnLogin, btnClear;
    
    
    private String correctUsername = "user";
    private String correctPassword = "password";

    
    public LoginForm() {
        
        setTitle("Login Form");

        
        setLayout(new FlowLayout());
        
        
        lblUsername = new JLabel("Username: ");
        tfUsername = new JTextField(20);
        
        lblPassword = new JLabel("Password: ");
        pfPassword = new JPasswordField(20);
        
        btnLogin = new JButton("Login");
        btnClear = new JButton("Clear");
        
        lblMessage = new JLabel("");
        lblMessage.setForeground(Color.RED);
        
        
        add(lblUsername);
        add(tfUsername);
        add(lblPassword);
        add(pfPassword);
        add(btnLogin);
        add(btnClear);
        add(lblMessage);
        
       
        btnLogin.addActionListener(this);
        btnClear.addActionListener(this);
        
        
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            
            String username = tfUsername.getText();
            String password = new String(pfPassword.getPassword());
            
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                lblMessage.setForeground(Color.GREEN);
                lblMessage.setText("Login Successful!");
            } else {
                lblMessage.setForeground(Color.RED);
                lblMessage.setText("Invalid credentials, try again.");
            }
        } else if (e.getSource() == btnClear) {
            
            tfUsername.setText("");
            pfPassword.setText("");
            lblMessage.setText("");
        }
    }

    public static void main(String[] args) {
        
        new LoginForm();
    }
}
