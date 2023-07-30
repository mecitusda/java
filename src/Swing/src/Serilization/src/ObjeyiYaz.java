import java.io.*;
import java.util.Scanner;

public class ObjeyiYaz {



    public static void main(String [] args){

        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Calisan1.bin"))){
            Scanner scan=new  Scanner(System.in);
            System.out.print("Çalışan'ın bilgileri: \n");
            System.out.print("Ad Soyad: ");
            String isim=scan.nextLine();
            System.out.print("Departman: ");
            String departman=scan.nextLine();
            System.out.print("id: ");
            int id=scan.nextInt();
            Calisan calisan=new Calisan(isim,departman,id);
            out.writeObject(calisan);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı!");
        } catch (IOException e) {
            System.out.println("Dosya'yı ararken bir hata oluştu!");
        }
        System.out.println("Başarıyla Yazıldı!\n");
    }
}
