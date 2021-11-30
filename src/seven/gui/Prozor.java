package seven.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * 1. Kontejner
 * 2.Komponente UI Controler
 * 3.Layout menadžeri
 */

public class Prozor {
    private JFrame frame;
    private JTextField textField;
    private JButton addButton;
    private JButton printButton;
    private ArrayList<String> names = new ArrayList<>();

    public Prozor(){
        this.frame = new JFrame("Prozor u Java svijet");
        this.textField = new JTextField("Unesi ime: ");
        this.addButton = new JButton("Dodaj");
        DodajListener dodajListener = new DodajListener(this);
        this.addButton.addActionListener(dodajListener);
        PrintListener printListener = new PrintListener(this);
        this.printButton = new JButton("Print");
        this.printButton.addActionListener(printListener);




        Container container = frame.getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(textField);
        container.add(addButton);
        container.add(printButton);

    }

    public void dodaj(){
        String text = textField.getText();
        names.add(text);
        textField.setText("");

    }
    public void print(){
        for (int i=0;i<names.size();i++){
            String name = names.get(i);
            System.out.println(name);
        }
    }

    public void setDimension(int width, int height){
        frame.setSize(width,height);
    }
    public void show(){
        frame.setVisible(true);
    }

}
