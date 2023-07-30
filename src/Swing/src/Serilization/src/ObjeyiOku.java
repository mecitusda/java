import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
    public static void main(String [] args){
    try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("Calisan1.bin"))){
        Calisan calisan= (Calisan) in.readObject();
        System.out.println("Okuma başarılı...\n\n*****************************************\n\n"+calisan);



    } catch (FileNotFoundException e) {
            System.out.println("Dosya Bulunamadı...");
    } catch (IOException e) {
            System.out.println("Dosya okunurken bir hata oluştu!");
    } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı!");
    }

    }
}
