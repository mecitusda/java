package ProgressBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bar extends JFrame{
    private JProgressBar progressBar1;
    private JButton button1;
    private JPanel Panel;
    private int sayac=0;
    public Bar() {
    setBounds(200,200,600,400);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    add(Panel);
    setVisible(true);
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Timer timer=new Timer(50,null);
            timer.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                progressBar1.setValue(sayac++);

                if(progressBar1.getValue()==100){

                    doneframe done=new doneframe();
                    setVisible(false);
                    done.setVisible(true);
                    timer.stop();

                }
                }
            });

            timer.start();
        }

    });

}
}
class main{
    public static void main(String [] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Bar frame = new Bar();
            }
        });
    }
}
