package SiparisTutari;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;

public class Swing extends JFrame {
    private JCheckBox iskenderCheckBox;
    private JCheckBox döner50TLCheckBox;
    private JCheckBox ayran6TLCheckBox;
    private JCheckBox kebap80TLCheckBox;
    private JCheckBox su4TLCheckBox;
    private JButton button1;
    private JPanel Panel;
    Map<String, Integer> siparis = new LinkedHashMap<String, Integer>();

    public Swing() {
        add(Panel);
        setSize(400, 300);
        setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator();
            }
        });
    }

    private void Calculator() {
        int tutar = 0;
        boolean check=true;
        String message = "Şipariş Tutarı: \n";

        if (iskenderCheckBox.isSelected())
            siparis.put("İskender", 100);
        else
            siparis.remove("İskender");

        if (döner50TLCheckBox.isSelected())
            siparis.put("Döner", 50);
        else
            siparis.remove("Döner");

        if (ayran6TLCheckBox.isSelected())
            siparis.put("Ayran", 6);
        else
            siparis.remove("Ayran");

        if (kebap80TLCheckBox.isSelected())
            siparis.put("Kebap", 80);
        else
            siparis.remove("Kebap");

        if (su4TLCheckBox.isSelected())
            siparis.put("Su", 4);
        else
            siparis.remove("Su");
        if (siparis.isEmpty()) {
            message += "Şipariş verilmemiştir!";
            check=false;

        } else {

            for (Map.Entry<String, Integer> s : siparis.entrySet()) {
                message += s.getKey() + "\n";
                tutar+=s.getValue();
            }


        }
        if(check){
        message+="Toplam: "+tutar;}
        JOptionPane.showMessageDialog(this, message);
    }
}
class main{
    public static void main(String[] args){

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
                Swing frame=new Swing();
            }
        });
    }
}