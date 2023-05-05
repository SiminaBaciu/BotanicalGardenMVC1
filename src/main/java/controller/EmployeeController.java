package controller;

import model.Plant;
import model.dao.PlantDAO;
import view.EmployeeView;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeController {
    public PlantDAO plantDAO;
    public EmployeeView employeeView;

    public EmployeeController() {
        this.plantDAO = new PlantDAO();
        this.employeeView = new EmployeeView();
        employeeView.setVisible(true);
        employeeView.getScrollPane().setViewportView(updatePlantTable());

        employeeView.getDelete().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = String.valueOf(employeeView.getId());
                plantDAO.delete(id);
                employeeView.getScrollPane().setViewportView(updatePlantTable());
            }
        });

        employeeView.getInsert().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.valueOf(employeeView.getId());
                String name = employeeView.getName();
                String type = employeeView.getTypes();
                String species = employeeView.getSpecies();
                Plant p = new Plant(id, name, type, species, "NW", true);
                plantDAO.insert(p);
                employeeView.getScrollPane().setViewportView(updatePlantTable());
            }
        });
        employeeView.getUpdate().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.valueOf(employeeView.getId());
                String name = employeeView.getName();
                String type = employeeView.getTypes();
                String species = employeeView.getSpecies();
                Plant p = new Plant(id, name, type, species, "NW", true);
                plantDAO.Update(p);
                employeeView.getScrollPane().setViewportView(updatePlantTable());
            }
        });

        employeeView.getJson().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plantDAO.sqlToJSON();
            }
        });

        employeeView.getXml().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    plantDAO.sqlToXML();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (TransformerException ex) {
                    ex.printStackTrace();
                } catch (ParserConfigurationException ex) {
                    ex.printStackTrace();
                }
            }
        });

        employeeView.getTxt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plantDAO.sqlToTXT();
            }
        });

        employeeView.getCsv().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plantDAO.sqlToCSV();
            }
        });

        employeeView.getPlants().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserController userController = new UserController();
            }
        });

        employeeView.getCharts().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlantStatsChartController plantStatsChartController = new PlantStatsChartController();
            }
        });
    }

    public JTable updatePlantTable() {
        ArrayList<Plant> plants = (ArrayList<Plant>) plantDAO.findAll();
        return plantDAO.createTable(plants);
    }
}
