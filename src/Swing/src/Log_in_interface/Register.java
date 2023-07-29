package Log_in_interface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class  Register extends JFrame{
    private  JTextField JKullanici_adi;
    private  JPasswordField JParola;
    private JButton kaydolButton;
    private JPanel Panel;

    public Register(){
        add(Panel);
        setBounds(250,200,400,350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(false);
        kaydolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register();
            }
        });
    }
    public   void  Register(){
        main main=new main();
        ArrayList<Users> list=main.getUsers();
        String Kullanici_adi=JKullanici_adi.getText();
        String Parola=new String(JParola.getPassword());
        list.add(new Users(Kullanici_adi,Parola));
        JParola.setText("");
        JKullanici_adi.setText("");

        this.setVisible(false);

    }
}
class kayit{
    public static void main(){
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
                Register frame=new Register();
            }
        });
    }
}