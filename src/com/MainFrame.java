package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private TextPanel textPanel;
    private Toolbar toolbar;
    private FormPanel formPanel;
    public MainFrame()
    {
        super("Hello World");

        setLayout(new BorderLayout());

        formPanel = new FormPanel();
        toolbar = new Toolbar();
        textPanel = new TextPanel();

        toolbar.setStringListener( new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });

        formPanel.setFormListener( new FormListener()
        {
           public void formEventOccured(FormEvent e)
           {
               String name = e.getName();
               String occupation = e.getOccupation();
               textPanel.appendText(name + ":" + occupation + "\n");
           }
        });

        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.WEST);
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }
}
