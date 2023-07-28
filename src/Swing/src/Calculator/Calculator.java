package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JButton toplam;
    private JPanel Panel;
    private JButton cikarma;
    private JTextField SonucText;
    private JTextField ikinciText;
    private JTextField ilkText;
    private JButton carpma;
    private JButton bolum;

    public Calculator(){
        add(Panel);
        setSize(500,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(350,450));

        toplam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ilksay=Integer.parseInt(ilkText.getText());
                double ikincisay=Integer.parseInt(ikinciText.getText());
                double sonuc=ilksay+ikincisay;
                SonucText.setText(String.valueOf(sonuc));
            }
        });
        cikarma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ilksay=Integer.parseInt(ilkText.getText());
                double ikincisay=Integer.parseInt(ikinciText.getText());
                double sonuc=ilksay-ikincisay;
                SonucText.setText(String.valueOf(sonuc));

            }
        });
        carpma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ilksay=Integer.parseInt(ilkText.getText());
                double ikincisay=Integer.parseInt(ikinciText.getText());
                double sonuc=ilksay*ikincisay;
                SonucText.setText(String.valueOf(sonuc));

            }
        });
        bolum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ilksay=Integer.parseInt(ilkText.getText());
                double ikincisay=Integer.parseInt(ikinciText.getText());
                double sonuc=(double)ilksay/ikincisay;
                SonucText.setText(String.valueOf(sonuc));

            }
        });
    }
}
class main{
    public static void main(String [] args){
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            Calculator calculator=new Calculator();
            calculator.setVisible(true);
        }
    });
    }
}