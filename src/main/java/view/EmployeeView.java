package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeView extends JFrame{

    Container container = getContentPane();

    private JLabel idLabel = new JLabel("ID: ");
    private JTextField id = new JTextField();
    private JLabel nameLabel = new JLabel("Name: ");
    private JTextField name = new JTextField();
    private JLabel typeLabel = new JLabel("Type: ");
    private JTextField type = new JTextField();
    private JLabel speciesLabel = new JLabel("Species: ");
    private JTextField species = new JTextField();
    private JButton back = new JButton("Back");
    private JButton insert = new JButton("Insert");
    private JButton delete = new JButton("Delete");
    private JButton update = new JButton("Update");
    private JButton plants = new JButton("View plants");
    private JButton xml = new JButton("XML");
    private JButton txt = new JButton("TXT");
    private JButton csv = new JButton("CSV");
    private JButton json = new JButton("JSON");
    private JButton charts = new JButton("Charts");

    private JTable plantsTable = new JTable(new DefaultTableModel());

    private JScrollPane scrollPane = new JScrollPane();


    public EmployeeView() {
        scrollPane.setViewportView(plantsTable);
        setLayoutManag();
        setLocAndSize();
        addComponent();
        this.setTitle("Employee");
        this.setBounds(500, 150, 900, 700);
    }

    /**
     * Sets the layout manager
     */
    public void setLayoutManag() {
        container.setLayout(null);
    }


    public void setLocAndSize() {
        idLabel.setBounds(50, 30, 100, 30);
        id.setBounds(80, 30, 75, 30);

        nameLabel.setBounds(170, 30, 200, 30);
        name.setBounds(240, 30, 125, 30);

        typeLabel.setBounds(370, 30, 100, 30);
        type.setBounds(440, 30, 125, 30);

        speciesLabel.setBounds(580, 30, 100, 30);
        species.setBounds(630, 30, 125, 30);

        plants.setBounds(130, 520, 100, 50);
        insert.setBounds(260, 520, 100, 50);
        delete.setBounds(390, 520, 100, 50);
        update.setBounds(520, 520, 100, 50);

        xml.setBounds(130, 600, 100, 50);
        txt.setBounds(260, 600, 100, 50);
        csv.setBounds(390, 600, 100, 50);
        json.setBounds(520, 600, 100, 50);
        charts.setBounds(650,600,100,50);

        back.setBounds(650, 520, 100, 50);
        back.addActionListener(e -> {
            setVisible(false);

        });

        scrollPane.setBounds(140, 90, 600, 400);
    }

    /**
     * Adds all view parts into the container
     */
    public void addComponent() {
        container.add(id);
        container.add(idLabel);
        container.add(name);
        container.add(type);
        container.add(nameLabel);
        container.add(typeLabel);
        container.add(species);
        container.add(speciesLabel);
        container.add(delete);
        container.add(update);
        container.add(insert);
        container.add(plants);
        container.add(back);
        container.add(xml);
        container.add(txt);
        container.add(csv);
        container.add(json);
        container.add(charts);
        container.add(scrollPane);
    }

    public int getId() {
        return Integer.parseInt(id.getText());
    }

    public String getName() {
        return name.getText();
    }

    public String getSpecies() {
        return species.getText();
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public JLabel getIdLabel() {
        return idLabel;
    }

    public void setIdLabel(JLabel idLabel) {
        this.idLabel = idLabel;
    }

    public void setId(JTextField id) {
        this.id = id;
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

    public JLabel getTypeLabel() {
        return typeLabel;
    }

    public void setTypeLabel(JLabel typeLabel) {
        this.typeLabel = typeLabel;
    }

    public String getTypes() {
        return type.getText();
    }

    public void setType(JTextField type) {
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

    public JButton getBack() {
        return back;
    }

    public void setBack(JButton back) {
        this.back = back;
    }

    public JButton getCharts() {
        return charts;
    }

    public void setCharts(JButton charts) {
        this.charts = charts;
    }

    public JButton getInsert() {
        return insert;
    }

    public void setInsert(JButton insert) {
        this.insert = insert;
    }

    public JButton getDelete() {
        return delete;
    }

    public void setDelete(JButton delete) {
        this.delete = delete;
    }

    public JButton getUpdate() {
        return update;
    }

    public void setUpdate(JButton update) {
        this.update = update;
    }

    public JButton getPlants() {
        return plants;
    }

    public void setPlants(JButton plants) {
        this.plants = plants;
    }

    public JButton getXml() {
        return xml;
    }

    public void setXml(JButton xml) {
        this.xml = xml;
    }

    public JButton getTxt() {
        return txt;
    }

    public void setTxt(JButton txt) {
        this.txt = txt;
    }

    public JButton getCsv() {
        return csv;
    }

    public void setCsv(JButton csv) {
        this.csv = csv;
    }

    public JButton getJson() {
        return json;
    }

    public void setJson(JButton json) {
        this.json = json;
    }

    public JTable getPlantsTable() {
        return plantsTable;
    }

    public void setPlantsTable(JTable plantsTable) {
        this.plantsTable = plantsTable;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }
}