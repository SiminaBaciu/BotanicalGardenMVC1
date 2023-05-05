package controller;

import model.AppUser;
import model.dao.UserDAO;
import view.LoginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;

public class LoginController {
    LoginView loginView;
    UserDAO userDAO;

    public LoginController() {
        this.loginView = new LoginView();
        this.userDAO = new UserDAO();

        loginView.getClient().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserController userController = new UserController();
            }
        });

        loginView.getLogin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserDAO userDAO = new UserDAO();
                String username = loginView.getUsername();
                String password = loginView.getPassword();

                List<AppUser> users = userDAO.findAll();
                for (AppUser user : users) {
                    if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                        if (user.getType() == null) {
                            System.out.println("Wrong username or password");
                        } else {
                            switch (Objects.requireNonNull(user.getType())) {
                                case "EMPLOYEE" -> {
                                    System.out.println("Correct");
                                    EmployeeController employeeController = new EmployeeController();
                                }
                                case "ADMIN" -> {
                                    System.out.println("Correct");
                                    AdminController adminController = new AdminController();
                                }
                            }
                        }
                    }
                }
            }
        });
    }
}