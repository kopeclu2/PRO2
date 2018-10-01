package gui;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(){
        init();
    }

    private void init() {
        setTitle("Todo List App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640,480);
        setLocationRelativeTo(null);
        intiControlPanel();
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
