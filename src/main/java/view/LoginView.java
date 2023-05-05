package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginView extends JFrame {

    Container container = getContentPane();

    private JLabel usernameLabel = new JLabel("Username:");
    private JTextField username = new JTextField(5);
    private JLabel passwordLabel = new JLabel("Password:");
    private JPasswordField password = new JPasswordField(5);
    private JButton login = new JButton("Login");
    private JButton client = new JButton("Client");

    public LoginView() {

        //adjust size and set layout
        setPreferredSize(new Dimension(500, 300));
        setLayoutManag();
        setLocAndSize();
        addComponent();

        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }


    public void setLayoutManag() {
        container.setLayout(null);
    }

    public void setLocAndSize() {

        username.setBounds(170, 20, 150, 30);
        usernameLabel.setBounds(80, 20, 100, 30);

        password.setBounds(170, 60, 150, 30);
        passwordLabel.setBounds(80, 60, 150, 30);

        login.setBounds(70, 150, 150, 30);
        client.setBounds(270, 150, 150, 30);

    }

    public void addComponent() {
        add(usernameLabel);
        add(username);
        add(passwordLabel);
        add(password);
        add(login);
        add(client);
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public JLabel getUsernameLabel() {
        return usernameLabel;
    }

    public void setUsernameLabel(JLabel usernameLabel) {
        this.usernameLabel = usernameLabel;
    }

    public String getUsername() {
        return username.getText();
    }

    public void setUsername(JTextField username) {
        this.username = username;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public String getPassword() {
        return password.getText();
    }

    public void setPassword(JPasswordField password) {
        this.password = password;
    }

    public JButton getLogin() {
        return login;
    }

    public void setLogin(JButton login) {
        this.login = login;
    }

    public JButton getClient() {
        return client;
    }

    public void setClient(JButton client) {
        this.client = client;
    }
}

