package CheckBox;

import jdk.jfr.Event;

import javax.swing.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.util.LinkedHashSet;
import java.util.Set;

public class Check extends JFrame implements ItemListener{
    private JCheckBox javaCheckBox;
    private JCheckBox cCheckBox;
    private JCheckBox pytonCheckBox;
    private JPanel Panel;
    private JLabel Chosens;
    Set<String> set=new LinkedHashSet<String>();

    public Check(){
        add(Panel);
        setSize(400,300);
        setVisible(true);


        pytonCheckBox.addItemListener(this);
        cCheckBox.addItemListener(this);
        javaCheckBox.addItemListener(this);
    }

    private void checkBoxs(){


        if(pytonCheckBox.isSelected()){
            set.add("Pyton ");
        }
        else{
            set.remove("Pyton ");
        }
        if(cCheckBox.isSelected()){
            set.add("C ");
        }
        else{
            set.remove("C ");
        }
        if(javaCheckBox.isSelected()){
            set.add("Java ");
        }
        else{
            set.remove("Java ");
        }

        String message="Chosens one:";
        for(String i:set){
          message+=i;
        }
        Chosens.setText(message);
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        checkBoxs();
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
                Check check=new Check();
            }
        });
    }
}