package com;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton goodbyeButton;
    private StringListener textListener;
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();

        if(clicked == helloButton){
            //textPanel.appendText("Hello\n");
            textListener.textEmitted("Hello\n");
        }
        else if( clicked == goodbyeButton)
        {
            //textPanel.appendText("Goodbye\n");
            textListener.textEmitted("Goodbye\n");
        }
    }

    public Toolbar()
    {
        setBorder(BorderFactory.createEtchedBorder());
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");
        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(goodbyeButton);
    }

    public void setStringListener(StringListener listener){
        this.textListener = listener;
    }
}
