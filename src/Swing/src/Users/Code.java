package Users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Code extends JFrame{
    private JList Kullanici_list;
    private JPanel Panel;
    private JButton Kullanici_Ekle;
    private JButton Kullanici_sil;
    private JLabel warning;
    DefaultListModel list;

    Code(){
        list= (DefaultListModel) Kullanici_list.getModel();
        setBounds(200,200,350,600);
        add(Panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Kullanici_Ekle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ekle();
            }
        });
        Kullanici_sil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            sil();
            }
        });
    }
public void ekle(){
        String message="";
        String kullanici_ad=JOptionPane.showInputDialog("Kullanıcı ismi:");
        if(kullanici_ad!=null){
            if(kullanici_ad.trim().equals("")){
                message="Kullanıcı adı girmediniz...";

            }
            else{
                list.addElement(kullanici_ad);
                message="Başarıyla eklendi.";
            }
        }
        else{
            message="İşlem iptal edildi...";
        }
        warning.setText(message);
}
public void sil(){
        String message="";
        int chosen=Kullanici_list.getSelectedIndex();
        if(chosen==-1){
            if(list.getSize()==0){
                    message="Liste boş...";
            }
            else{
                message="Lütfen bir kullanıcı seçiniz...";
            }
        }
        else{
            list.remove(chosen);
        }
    warning.setText(message);



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
                Code frame=new Code();
            }
        });
    }
}
