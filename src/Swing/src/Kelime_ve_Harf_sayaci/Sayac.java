package Kelime_ve_Harf_sayaci;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class Sayac extends JFrame{
    private JTextArea textArea1;
    private JPanel Panel;
    private JLabel kelime_Sayisi;
    private JLabel Harf_Sayisi;

    public Sayac(){
        add(Panel);
        setSize(600,450);
        setTitle("Kelime ve Harf Sayacı");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(400,450));


        textArea1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                say();
            }
        });
    }

    public void say(){
        int harf_sayac=0;
        int kelimesay=0;
        String metin=textArea1.getText();
        for(int i=0;i<metin.length();i++){
            if(metin.charAt(i)!=' '){
                harf_sayac++;
            }
        }
        String [] kelimesayisi=metin.split(" ");
        kelimesay= kelimesayisi.length;

            kelime_Sayisi.setText("Kelime sayısı :"+kelimesay);


        Harf_Sayisi.setText("Harf sayısı :"+harf_sayac);


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
                Sayac sayac= new Sayac();
                sayac.setVisible(true);
            }
        });
    }
}
