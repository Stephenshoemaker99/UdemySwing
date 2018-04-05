package com;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {
    private JLabel nameLabel;
    private JLabel occupationLabel;
    private JTextField nameField;
    private JTextField occupationField;
    private JButton okBtn;
    public FormPanel() {
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);

        nameLabel = new JLabel("Name: ");
        occupationLabel = new JLabel("Occupation");
        nameField = new JTextField(10);
        occupationField = new JTextField( 10);

        okBtn = new JButton("OK");

        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));
        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        add(nameLabel, gc);

        gc.gridx = 2;
        gc.gridy = 0;

        add(nameField, gc);
        gc.gridx = 0;
        gc.gridy = 1;
        add(occupationLabel, gc);
        gc.gridx = 2;
        gc.gridy = 1;
        add(occupationField, gc);
        gc.gridy = 2;
        gc.gridx = 1;
        add(okBtn, gc);


    }
}