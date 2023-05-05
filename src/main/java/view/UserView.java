package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Class ClientView creates the view for the clients
 */
public class UserView extends JFrame {

    Container container = getContentPane();
    private JLabel carnivoreLabel = new JLabel("Carnivore: ");
    private JTextField is_carnivorous = new JTextField();
    private JLabel nameLabel = new JLabel("Name: ");
    private JTextField name = new JTextField();
    private JLabel zoneLabel = new JLabel("Zone: ");
    private JTextField zone = new JTextField();
    private JLabel typeLabel = new JLabel("Type: ");
    private JTextField type = new JTextField();
    private JLabel speciesLabel = new JLabel("Species: ");
    private JTextField species = new JTextField();
    private JTable plantsTable = new JTable(new DefaultTableModel());

    private JButton back = new JButton("Back");
    private JButton sortByType = new JButton("Sort Type");
    private JButton sortBySpecies = new JButton("Sort Species");
    private JButton filter = new JButton("Filter");
    private JButton search = new JButton("Search");
    private JScrollPane scrollPane = new JScrollPane();


    public UserView() {

        setLayoutManag();
        setLocAndSize();
        addComponent();
        this.setTitle("Clients");
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(500, 150, 900, 700);

        scrollPane.setViewportView(plantsTable);
    }

    /**
     * Sets the layout manager
     */
    public void setLayoutManag() {
        container.setLayout(null);
    }

    public void setLocAndSize() {

        carnivoreLabel.setBounds(20, 30, 100, 30);
        is_carnivorous.setBounds(90, 30, 75, 30);

        zoneLabel.setBounds(170, 30, 200, 30);
        zone.setBounds(210, 30, 125, 30);

        typeLabel.setBounds(340, 30, 100, 30);
        type.setBounds(380, 30, 125, 30);

        speciesLabel.setBounds(510, 30, 100, 30);
        species.setBounds(565, 30, 125, 30);

        nameLabel.setBounds(700, 30, 100, 30);
        name.setBounds(740, 30, 125, 30);

        sortByType.setBounds(130, 520, 100, 50);
        sortBySpecies.setBounds(260, 520, 100, 50);
        filter.setBounds(390, 520, 100, 50);
        back.setBounds(520, 520, 100, 50);
        search.setBounds(650, 520, 100, 50);
        back.addActionListener(e -> {
            setVisible(false);

        });

        scrollPane.setBounds(140, 90, 600, 400);
    }

    /**
     * Adds all view parts into the container
     */
    public void addComponent() {
        container.add(is_carnivorous);
        container.add(carnivoreLabel);
        container.add(zone);
        container.add(type);
        container.add(name);
        container.add(zoneLabel);
        container.add(typeLabel);
        container.add(nameLabel);
        container.add(species);
        container.add(speciesLabel);
        container.add(sortByType);
        container.add(sortBySpecies);
        container.add(filter);
        container.add(back);
        container.add(search);
        container.add(scrollPane);

    }

    public Container getContainer() {
        return container;
    }

    public JLabel getCarnivoreLabel() {
        return carnivoreLabel;
    }

    public void setCarnivoreLabel(JLabel carnivoreLabel) {
        this.carnivoreLabel = carnivoreLabel;
    }

    public String getIs_carnivorous() {
        return is_carnivorous.getText();
    }

    public void setIs_carnivorous(JTextField is_carnivorous) {
        this.is_carnivorous = is_carnivorous;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public void setName(JTextField name) {
        this.name = name;
    }

    public JLabel getZoneLabel() {
        return zoneLabel;
    }

    public void setZoneLabel(JLabel zoneLabel) {
        this.zoneLabel = zoneLabel;
    }

    public String getZone() {
        return zone.getText();
    }

    public void setZone(JTextField zone) {
        this.zone = zone;
    }

    public JLabel getTypeLabel() {
        return typeLabel;
    }

    public void setTypeLabel(JLabel typeLabel) {
        this.typeLabel = typeLabel;
    }

    public String getTypes() {
        return type.getText();
    }

    public void setTypes(JTextField type) {
        this.type = type;
    }

    public JLabel getSpeciesLabel() {
        return speciesLabel;
    }

    public void setSpeciesLabel(JLabel speciesLabel) {
        this.speciesLabel = speciesLabel;
    }

    public void setSpecies(JTextField species) {
        this.species = species;
    }

    public JTable getPlantsTable() {
        return plantsTable;
    }

    public void setPlantsTable(JTable plantsTable) {
        this.plantsTable = plantsTable;
    }

    public JButton getBack() {
        return back;
    }

    public void setBack(JButton back) {
        this.back = back;
    }

    public JButton getSortByType() {
        return sortByType;
    }

    public void setSortByType(JButton sortByType) {
        this.sortByType = sortByType;
    }

    public JButton getSortBySpecies() {
        return sortBySpecies;
    }

    public void setSortBySpecies(JButton sortBySpecies) {
        this.sortBySpecies = sortBySpecies;
    }

    public JButton getFilter() {
        return filter;
    }

    public void setFilter(JButton filter) {
        this.filter = filter;
    }

    public JButton getSearch() {
        return search;
    }

    public void setSearch(JButton search) {
        this.search = search;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public String getSpecies() {
        return species.getText();
    }

    public String getName() {
        return name.getText();
    }

}
