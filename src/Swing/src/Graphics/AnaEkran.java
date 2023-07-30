package Graphics;

import javax.swing.*;

public class AnaEkran extends JFrame {

    public AnaEkran(String çizimEkranı) {
    }

    public static void main(String [] args){
        Panel panel=new Panel();
        AnaEkran Aekran=new AnaEkran("Çizim ekranı");
        Aekran.setBounds(450,200,900,700);
        Aekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Aekran.add(panel);
        Aekran.setVisible(true);
    }
}
