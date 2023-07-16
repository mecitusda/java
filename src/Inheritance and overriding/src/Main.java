import javax.sound.midi.SysexMessage;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Calisan> Calisanlar=new ArrayList<>();
        Yonetici ahmet=new Yonetici("ahmet","IT",50000,15);
        Calisan mehmet=new Calisan("mehmet","IT",25000);//Mehmet'in Yusuf ve Arifle Maaş farkının sebebi Ahmet
        Calisan arif=new Calisan("Arif","IT",25000);   //şahsi olarak 5000 TL Mehmet'e zam yaptı.
        Calisan yusuf=new Calisan("Yusuf","IT",25000);
        Calisanlar.add(yusuf);
        Calisanlar.add((arif));
        Calisanlar.add(mehmet);
        mehmet.Bilgilerigoster();
        ahmet.Zam_Yap(5000.0,mehmet);
        System.out.println("\nMehmete zam yapıldı...\n*******************\n");
        mehmet.Bilgilerigoster();
        ahmet.Herkese_Zam_Yap(5000,Calisanlar);
        System.out.println("\n*****************\nHerkese Zam Yapıldı.\n\n");
        mehmet.Bilgilerigoster();
        arif.Bilgilerigoster();
        yusuf.Bilgilerigoster();

    }
}