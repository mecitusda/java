package Combobox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame{
    private JPanel Panel;
    private JComboBox Chose;
    private JButton Button;
    public ComboBox(){
        add(Panel);
        setSize(300,400);

        setVisible(true);
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Check();
            }
        });
    }
    public void Check(){
        JOptionPane.showMessageDialog(this,"Seçilen dil: "+Chose.getSelectedItem());
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
              ComboBox frame=new ComboBox();
          }
      });
    }
}
