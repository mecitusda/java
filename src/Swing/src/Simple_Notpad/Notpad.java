package Simple_Notpad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Notpad extends JFrame{
    private JMenu Dosya;
    private JMenu Duzenle;
    private JPanel Panel;
    private JMenuItem Dosya_Ac;
    private JMenuBar Menu;
    private JMenuItem Dosya_Kaydet;
    private JMenuItem Dosya_Cikis;
    private JMenuItem Duzenle_Renk;
    private JMenu Duzenle_Yazı_Tipi;
    private JScrollPane Metin_Scrol;
    private JTextArea Metin;
    private JMenuItem Verdana;
    private JMenuItem Batang;

    public Notpad(){
        ImageIcon icon= new ImageIcon("C:\\Users\\mirac\\OneDrive\\Masaüstü\\Udemy kurs\\Java\\Swing\\src\\Simple_Notpad\\Pencil_Icon.png");
        setIconImage(icon.getImage());


        add(Panel);
        setBounds(500,400,500,380);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setTitle("Notter ++");
        Dosya_Cikis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        Dosya_Ac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Dosya_ac();
            }
        });

        Dosya_Kaydet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dosya_kaydet();
            }
        });


        Duzenle_Renk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Renk_Duzenle();

            }
        });
        Verdana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verdana();

            }
        });

        Batang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bodoniMT();
            }
        });




















    }
    public void bodoniMT(){
        Metin.setFont(new Font("Bodoni MT",Font.BOLD,18));
    }

    public void verdana(){
        Metin.setFont(new Font("Verdana",Font.BOLD,18));
    }
    public void Renk_Duzenle(){
        Color renk=JColorChooser.showDialog(this,"Bir Renk Seçiniz!",Color.WHITE);
        Metin.setForeground(renk);
    }
    public void Dosya_kaydet(){
        JFileChooser file=new JFileChooser();
        int Check=file.showSaveDialog(this);
        if(Check==JFileChooser.APPROVE_OPTION){
            String Dosya_Yolu=file.getSelectedFile().getPath();
            try( FileWriter writer=new FileWriter(Dosya_Yolu)) {


                writer.write(Metin.getText());




            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }



    }
    public void Dosya_ac(){
        JFileChooser file=new JFileChooser();
        int Check=file.showOpenDialog(this);
        String Content="";
        if(Check==JFileChooser.APPROVE_OPTION){
            File ChosenFile=file.getSelectedFile();
            try(Scanner scan=new Scanner(new BufferedReader(new FileReader(ChosenFile)));) {

                while(scan.hasNextLine()){
                    Content+=scan.nextLine()+"\n";
                }


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        }

        Metin.setText(Content);

    }




    private void createUIComponents() {
        // TODO: place custom component creation code here
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
                Notpad frame=new Notpad();
            }
        });
    }
}