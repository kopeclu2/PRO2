package gui;
import model.ToDoList;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JTable table;
    private ToDoList toDoList;
    private TodoTableModel model;

    public MainFrame(){
        init();
    }

    private void init() {
        setTitle("Todo List App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640,480);
        setLocationRelativeTo(null);

        toDoList = new ToDoList();
        model = new TodoTableModel();
        model.setList(toDoList);

        intiControlPanel();
        initConentPanel();
    }

    private void initConentPanel() {
        JPanel contentPanel = new JPanel(new BorderLayout());
        table = new JTable();
        table.setModel(model);
        contentPanel.add(new JScrollPane(table));
        add(contentPanel,BorderLayout.CENTER);
    }

    private void intiControlPanel(){

        JPanel controlPanel = new JPanel(new GridLayout(0,1));

        JPanel formPanel = new JPanel(new BorderLayout());
        JLabel lblAddtoDo = new JLabel("Zadejte todo : ");
        JTextField txtAddToDo = new JTextField();
        JButton btnAdd = new JButton("Přidat");

        formPanel.add(lblAddtoDo,BorderLayout.WEST);
        formPanel.add(txtAddToDo,BorderLayout.CENTER);
        formPanel.add(btnAdd,BorderLayout.EAST);

        add(formPanel,BorderLayout.NORTH);


    }


}
