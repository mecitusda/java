package Graphics;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;

public class Panel extends JPanel {
    public Panel(){
        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Image image=new ImageIcon("C:\\Users\\mirac\\OneDrive\\Masaüstü\\Udemy kurs\\Java\\Swing\\src\\Graphics\\uzaygemisi.png").getImage();
        g.drawImage(image,300,580,40,40,this);
        g.draw3DRect(200,200,45,45,true);
        g.fillArc(300,300,150,150,0,270);
    }
}
