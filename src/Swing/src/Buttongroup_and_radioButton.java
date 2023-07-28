import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.LinkedHashSet;
import java.util.Set;

public class Buttongroup_and_radioButton extends JFrame implements ItemListener {
    private JRadioButton javaRadioButton;
    private JRadioButton cRadioButton;
    private JRadioButton pythonRadioButton;
    private JLabel label;
    private JPanel Panel;
    Set<String> set=new LinkedHashSet<String>();

    public Buttongroup_and_radioButton(){
        add(Panel);
        setSize(300,400);
        pythonRadioButton.addItemListener(this);
        javaRadioButton.addItemListener(this);
        cRadioButton.addItemListener(this);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public void Check(){
        String messageP="Seçilen diller: ";
        if(pythonRadioButton.isSelected()){
            set.add("Python");
        }
        else{
            set.remove("Python");

        }

        if(cRadioButton.isSelected()){
            set.add("C");
        }
        else{
            set.remove("C");

        }

        if(javaRadioButton.isSelected()){
            set.add("Java");
        }
        else{
            set.remove("Java");

        }
        for(String i:set)
            messageP+=i;

        label.setText(messageP);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        Check();
    }
}
class main{
    public static void main(String [] args){
        try {
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Buttongroup_and_radioButton frame=new Buttongroup_and_radioButton();
            }
        });
    }
}