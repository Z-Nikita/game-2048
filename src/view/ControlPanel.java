package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    public ControlPanel (JPanel jPanel) {
        JButton redButton = new JButton("RED");
        JButton blueButton = new JButton("BLUE");
        JButton greenButton = new JButton("GREEN");

        this.setBackground(Color.GRAY);

        this.add(redButton);
        this.add(blueButton);
        this.add(greenButton);

        redButton.addActionListener(new Controller(jPanel, Color.RED));
        greenButton.addActionListener(new Controller(jPanel, Color.GREEN));
        blueButton.addActionListener(new Controller(jPanel, Color.BLUE));
    }

}
