package ProgressBar;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class doneframe extends JFrame{
    private JButton button1;
    private JPanel Panel;

    public doneframe() {
    setBounds(250,250,200,150);
    add(Panel);
    setVisible(true);
    button1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.exit(0);
        }
    });
}


}
