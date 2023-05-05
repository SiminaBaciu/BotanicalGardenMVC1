package controller;

import model.Plant;
import model.dao.PlantDAO;
import view.UserView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UserController {
    UserView userView;
    PlantDAO plantDAO;

    public UserController(){
        this.plantDAO = new PlantDAO();
        this.userView = new UserView();
        userView.setVisible(true);
        userView.getScrollPane().setViewportView(updatePlantTable());

        userView.getFilter().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type = userView.getTypes();
                String species = userView.getSpecies();
                String zone = userView.getZone();
                String carnivore = userView.getIs_carnivorous();
                userView.getScrollPane().setViewportView(plantDAO.createFilteredTable(type, species,zone,carnivore));
            }
        });

        userView.getSearch().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = userView.getName();
                plantDAO.searchPlants(name);
                userView.getScrollPane().setViewportView(plantDAO.createSearchedByNameTable(name));
            }
        });


        userView.getSortBySpecies().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plantDAO.getPlantsSortedBySpecies();
                userView.getScrollPane().setViewportView(plantDAO.createSortedBySpeciesTable());
            }
        });

        userView.getSortByType().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plantDAO.getPlantsSortedByType();
                userView.getScrollPane().setViewportView(plantDAO.createSortedByTypeTable());
            }
        });
    }
    public JTable updatePlantTable() {
        ArrayList<Plant> plants = (ArrayList<Plant>) plantDAO.findAll();
        return plantDAO.createTable(plants);
    }
}

