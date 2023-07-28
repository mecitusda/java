package Table;

import SiparisTutari.Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Table extends JFrame{

    private JTextField Urun_adi;
    private JTextField Fiyat;
    private JTable Table;
    private JButton ekleButton;

    private JButton cikarButton;

    private JComboBox Kategori;

    private JButton duzeltButton;
    private JTextField Urun_Adi;
    private JLabel Uyari;
    private JPanel JPanel;
    public Table(){
        Uyari.setText("(* __ *)");
        add(JPanel);
        setSize(500,400);
        setDefaultCloseOperation(Swing.DISPOSE_ON_CLOSE);
        setVisible(true);
        tablo.addColumn("Ürün adı");
        tablo.addColumn("Kategori");
        tablo.addColumn("Fiyat");
        setTitle("Adisyon");


        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ekle();
            }
        });
        cikarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            cikar();
            }
        });
        duzeltButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            duzenle();
            }
        });

        Table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Clicked();
            }
        });
    }

    DefaultTableModel tablo= (DefaultTableModel) Table.getModel();

    public void Clicked(){
        int chosen=Table.getSelectedRow();
        Urun_Adi.setText(tablo.getValueAt(chosen,0).toString());
        Kategori.setSelectedItem(tablo.getValueAt(chosen,1).toString());
        Fiyat.setText(tablo.getValueAt(chosen,2).toString());


    }
    public void ekle(   ){
        String warning="";
        if(Urun_Adi.getText().trim().equals("")){
            warning="Ürün adı Boş bırakılamaz!";
    }
        else{
            String searchName = Urun_Adi.getText();
            boolean found=false;
            for (int row = 0; row < tablo.getRowCount(); row++) {
                for (int col = 0; col < tablo.getColumnCount(); col++) {
                    Object value = tablo.getValueAt(row, col);
                    if (value != null && value.toString().equalsIgnoreCase(searchName)) {
                        found = true;
                        break;
                    }
                }
            }
            if (found) {
                warning="Bu ürün zaten tabloda var!";
            }
            else{
            Object[] eklenecek={Urun_Adi.getText(),Kategori.getSelectedItem(),Fiyat.getText()};
            tablo.addRow(eklenecek);
            warning="Başarıyla eklendi...";
        }
            Uyari.setText(warning);
        }



    }

    public void cikar(){
        String warning="";
        int chosen=Table.getSelectedRow();
        if(chosen==-1)
        {
            if(tablo.getRowCount()==0){
                warning="Ürün tablosu şu anda boş!";
            }
            else{
                warning="Lütfen silmek istediğiniz ürünü seçin!";
            }

        }
        else{
            tablo.removeRow(chosen);
            warning="Başarıyla silindi!";
        }
        Uyari.setText(warning);

    }

    public void duzenle(){
        String warning="";
        int chosen=Table.getSelectedRow();
        if(chosen==-1)
        {
            if(tablo.getRowCount()==0){
                warning="Ürün tablosu şu anda boş!";
            }
            else{
                warning="Lütfen güncellemek istediğiniz ürünü seçin!";
            }

        }
        else{
            tablo.setValueAt(Urun_Adi.getText(),chosen,0);
            tablo.setValueAt(Kategori.getSelectedItem(),chosen,1);
            tablo.setValueAt(Fiyat.getText(),chosen,2);
            warning="Başarıyla güncellendi!";
        }
        Uyari.setText(warning);




}}
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
                Table frame=new Table();
            }
        });
    }
}
