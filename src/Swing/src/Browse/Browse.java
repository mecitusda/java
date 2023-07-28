package Browse;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Browse extends JFrame {
    private JTextField Aramamotoru;
    private JPanel Panel1;
    private JButton AramaCubugu;

    public Browse() {

        add(Panel1);
        setSize(600,450);
        setTitle("Arama Motoru");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(400,450));
        AramaCubugu.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            AramaCubuguActionPerformed(e);
           }
       });

   }



    private void AramaCubuguActionPerformed(ActionEvent a){
       String aranacak=Aramamotoru.getText();
       Desktop pc=Desktop.getDesktop();
    try {
        pc.browse(new URI(aranacak));
    } catch (IOException e) {
        throw new RuntimeException(e);
    } catch (URISyntaxException e) {
        throw new RuntimeException(e);
    }
}


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
class Main{
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


                Browse frame = new Browse();
                frame.setVisible(true);
            }
        });
    }
}