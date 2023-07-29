package Log_in_interface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class main extends JFrame{
    private JPanel Login_Lanel;
    private JPanel Button_Panel;
    private  JTextField JKullanici;
    private  JPasswordField JParola;
    private JButton kaydolButton;
    private JButton girişYapButton;
    private JPanel Panel;
    private JLabel warning;
    private ArrayList<Users> Users=new ArrayList<>();

    public main(){
        add(Panel);
        setBounds(400,350,500,450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        kaydolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register();
            }
        });
        girişYapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Giris();
            }
        });
    }
    public void Giris() {
        String Kullanici_ad = JKullanici.getText();
        String Sifre = new String(JParola.getPassword());
        if(getUsers().size()==0){
            JKullanici.setText("");
            JParola.setText("");
            JOptionPane.showMessageDialog(this,"Hatalı giriş yaptınız!");
        }else{
        for(Users user: getUsers()){
            if(user.getKullanici_adi().equals(Kullanici_ad)&&user.getSifre().equals(Sifre)){
                JOptionPane.showMessageDialog(this,"Hoşgeldiniz "+user.getKullanici_adi()+" !");
                System.exit(0);
            }

            else{
                JOptionPane.showMessageDialog(this,"Yanlış giriş yaptınız!");
                JKullanici.setText("");
                JParola.setText("");
            }
            }}
        }





    public void Register(){
        Register register=new Register();
        register.setVisible(true);

    }

    public ArrayList<Log_in_interface.Users> getUsers() {
        return Users;
    }

    public void setUsers(ArrayList<Log_in_interface.Users> users) {
        Users = users;
    }
}
class calistir{
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
                main frame=new main();
            }
        });


    }
}
