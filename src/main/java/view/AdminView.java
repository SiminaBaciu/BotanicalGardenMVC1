package view;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminView extends JFrame{
    Container container = getContentPane();

    private JTable usersTable = new JTable(new DefaultTableModel());

    private JLabel idLabel = new JLabel("ID: ");

    private JTextField id = new JTextField();

    private JLabel usernameLabel = new JLabel("Username: ");
    private JTextField username = new JTextField();

    private JLabel passwordLabel = new JLabel("Password: ");
    private JTextField password = new JTextField();

    private JLabel typeLabel = new JLabel("Type: ");
    private JTextField type = new JTextField();

    private JButton back = new JButton("Back");
    private JButton insert = new JButton("Insert");
    private JButton delete = new JButton("Delete");
    private JButton update = new JButton("Update");
    private JButton plants = new JButton("View plants");
    private JScrollPane scrollPane = new JScrollPane();

    public AdminView() {

        setLayoutManag();
        setLocAndSize();
        addComponent();
        this.setTitle("Admin");
        this.setBounds(500, 150, 900, 700);
        scrollPane.setViewportView(usersTable);

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

        usernameLabel.setBounds(170, 30, 200, 30);
        username.setBounds(240, 30, 125, 30);

        passwordLabel.setBounds(370, 30, 100, 30);
        password.setBounds(440, 30, 125, 30);

        typeLabel.setBounds(580, 30, 100, 30);
        type.setBounds(630, 30, 125, 30);

        plants.setBounds(130, 520, 100, 50);
        insert.setBounds(260, 520, 100, 50);
        delete.setBounds(390, 520, 100, 50);
        update.setBounds(520, 520, 100, 50);
        back.setBounds(650, 520, 100, 50);
        back.addActionListener(e -> {
            setVisible(false);

        });

        scrollPane.setBounds(140, 90, 600, 400);
    }


    public void addComponent() {
        container.add(id);
        container.add(idLabel);
        container.add(username);
        container.add(password);
        container.add(usernameLabel);
        container.add(passwordLabel);
        container.add(type);
        container.add(typeLabel);
        container.add(delete);
        container.add(update);
        container.add(insert);
        container.add(back);
        container.add(plants);
        container.add(scrollPane);

    }

    public int getId() {
        return Integer.parseInt(id.getText());
    }

    public JTable getUsersTable() {
        return usersTable;
    }

    public void setUsersTable(JTable usersTable) {
        this.usersTable = usersTable;
    }

    public void setId(JTextField id) {
        this.id = id;
    }

    public String getUsername() {
        return username.getText();
    }

    public void setUsername(JTextField username) {
        this.username = username;
    }

    public String getPassword() {
        return password.getText();
    }

    public void setPassword(JTextField password) {
        this.password = password;
    }

    public String getTypes() {
        return type.getText();
    }

    public void setTypes(JTextField type) {
        this.type = type;
    }

    public JButton getBack() {
        return back;
    }

    public void setBack(JButton back) {
        this.back = back;
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

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

}
