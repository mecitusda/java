package Copy_MP3;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class main{
    public static ArrayList<Integer> Content=new ArrayList<>();

    public static void fileRead(String isim){
        try {
            FileInputStream in=new FileInputStream(isim);
            Integer Temp;
            while((Temp=in.read())!=-1){
                Content.add(Temp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void fileWrite(String isim){
        try {
            FileOutputStream out=new FileOutputStream(isim);
            for(Integer i:Content){
                out.write(i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copyMp3(String Content,String NFName){
        fileRead(Content);
        fileWrite(NFName);
    }
    public static void main(String [] args){
        FileDialog fileDialog = new FileDialog(new Frame(), "Dosya Seç", FileDialog.LOAD);
        fileDialog.setVisible(true);
        String file = fileDialog.getFile();
        System.out.println(file);
        copyMp3("C:\\Users\\mirac\\OneDrive\\Masaüstü\\Udemy kurs\\Java\\MultiThread\\src\\Copy_MP3\\"+file,"marşkopya.mp3");
        int a=5;
        int b=0;

        System.out.println(a/b);


    }
}
