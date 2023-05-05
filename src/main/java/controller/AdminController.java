package controller;

import model.AppUser;
import model.dao.UserDAO;
import view.AdminView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdminController {
    AdminView adminView;
    UserDAO userDAO;

    public AdminController() {
        this.adminView = new AdminView();
        adminView.setVisible(true);
        this.userDAO = new UserDAO();
        adminView.getScrollPane().setViewportView(updateUserTable());

        adminView.getDelete().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = String.valueOf(adminView.getId());
                userDAO.delete(id);
                adminView.getScrollPane().setViewportView(updateUserTable());
            }
        });

        adminView.getInsert().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = adminView.getId();
                String username = adminView.getUsername();
                String password = adminView.getPassword();
                String type = adminView.getTypes();
                AppUser appUser = new AppUser(id, username, password, type);
                userDAO.insert(appUser);
                adminView.getScrollPane().setViewportView(updateUserTable());
            }
        });

        adminView.getUpdate().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = adminView.getId();
                String username = adminView.getUsername();
                String password = adminView.getPassword();
                String type = adminView.getTypes();
                AppUser appUser = new AppUser(id, username, password, type);
                userDAO.Update(appUser);
                adminView.getScrollPane().setViewportView(updateUserTable());
            }
        });

        adminView.getPlants().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserController userController = new UserController();
            }
        });


    }

    public JTable updateUserTable() {
        ArrayList<AppUser> users = (ArrayList<AppUser>) userDAO.findAll();
        return userDAO.createTable(users);
    }
}
