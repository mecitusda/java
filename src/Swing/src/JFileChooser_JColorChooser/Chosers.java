package JFileChooser_JColorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Chosers extends JFrame {

    private JTextArea Metin;
    private JButton DosyaButton;
    private JButton Renk_button;
    private JPanel Panel;
    private JMenu Dosya;
    private JMenu Düzenle;

    public Chosers(){
        add(Panel);
        setBounds(600,300,500,350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        DosyaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser file=new JFileChooser();
                int temp=file.showOpenDialog(Chosers.this);
                String Content="";
                if(temp==JFileChooser.APPROVE_OPTION){
                    File dosya=file.getSelectedFile();

                    try {
                        Scanner scan=new Scanner(new BufferedReader(new FileReader(dosya)));
                        while(scan.hasNextLine()){
                            Content+=scan.nextLine()+"\n";
                        }
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }

                }

                Metin.setText(Content);
            }
        });
        Renk_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Color color= JColorChooser.showDialog(Chosers.this,"Bir Renk Seçin", Color.WHITE);
            Metin.setForeground(color);
            }
        });
    }
}
class Main{
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
                Chosers frame=new Chosers();
            }
        });
    }
}
