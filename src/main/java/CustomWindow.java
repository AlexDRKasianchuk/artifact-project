package main.java;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Container;

public class CustomWindow extends JFrame {
    public CustomWindow(String arg) {
        super("sd");
        this.setVisible(true);
        this.setMinimumSize(new Dimension(400,400));
        Container pane = getContentPane();
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel(arg);
        jPanel.add(jLabel);
        pane.add(jLabel);

        pack();
    }
}
