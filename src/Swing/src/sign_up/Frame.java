package sign_up;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Frame extends JFrame {

    private JButton kaydolButton;
    private JButton girişYapButton;
    private JTextField Kullanici_Adi;
    private JPanel Panel1;
    private JPasswordField Password;
    private ArrayList<String> kullanici = new ArrayList<String>();
    private ArrayList<String> kullanicisifre = new ArrayList<String>();

    public Frame() {
        add(Panel1);
        setSize(600, 450);
        setTitle("Giriş arayüzü");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(400, 450));



        kaydolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               kaydolAction();
            }
        });
        girişYapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Giris_KontrolAction();
            }
        });

    }

    private void kaydolAction(){
        String Kullaniciadi=Kullanici_Adi.getText();
        String Sifre=new String(Password.getPassword());
        String message="";
        boolean check=kaydol(Kullaniciadi,Sifre);
        if(check){
           message="Başarıyla Kaydoldunuz!";
        }
        else{
            message="Hatalı giriş yaptınız! ";
        }
        JOptionPane.showMessageDialog(this,message);
        Kullanici_Adi.setText("");
        Password.setText("");

    }
    private void Giris_KontrolAction(){
        String message="";
        String Kullaniciadi=Kullanici_Adi.getText();
        String Sifre=new String(Password.getPassword());

        if(signupcheck(Kullaniciadi,Sifre)){
            message="Hoşgeldiniz "+Kullaniciadi+" !";
            JOptionPane.showMessageDialog(this,message);
            System.exit(0);
        }
        else{
            message="Hatalı giriş yaptınız! ";
            JOptionPane.showMessageDialog(this,message);
        }



        Kullanici_Adi.setText("");
        Password.setText("");
    }
    public boolean signupcheck(String kullaniciadi, String password) {
        if(kullaniciadi.equals("")||password.equals("")){
            return false;
        }

        int temp = kullanici.indexOf(kullaniciadi);
        if(temp== -1){//eğer kullanıcı adı kayıtlı değilse indexof -1 gönderir
            return false;
        }

       if(kullanicisifre.get(temp).equals(password)) {
            return true;//şifre kontrol
        }
        else{
            return false;
        }



    }

public Boolean kaydol(String kullanici, String password){
    if(kullanici.equals("")||password.equals("")){

        return false;
    }
    this.kullanici.add(kullanici);
    this.kullanicisifre.add(password);
    return true;

}


}