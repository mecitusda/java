package Example;

import java.io.*;
import java.util.Objects;

public class oyun_Kayit {
    public static void kaydet(Kart [][] kartDurum){
        try( ObjectOutputStream kaydet=new ObjectOutputStream(new FileOutputStream("OyunDepo.txt"))) {
           kaydet.writeObject(kartDurum);
           System.out.println("Oyun kaydedildi!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Kart[][] KayitBul(){
        try(ObjectInputStream Al=new ObjectInputStream(new FileInputStream("OyunDepo.txt"))){
            return (Kart[][])Al.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
