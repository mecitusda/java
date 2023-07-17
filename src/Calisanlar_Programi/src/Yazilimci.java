import java.util.ArrayList;

public class Yazilimci extends Calisanlar {
        private ArrayList<String> Diller;
    public Yazilimci(String ad, String soyad, int id,ArrayList<String> Diller) {
        super(ad, soyad, id);
        this.Diller=Diller;
    }
    public void formatAt(String isletim_sis){
    System.out.println(getAd()+" "+isletim_sis+" işletim sistemi'ni yüklüyor...");

    }

    @Override
    public void Bilgileri_Goster() {
        super.Bilgileri_Goster();
        System.out.print("Bilinen diller: ");
        for(int i=0;i<Diller.size();i++){
            if(i==Diller.size()-1){
                System.out.println(Diller.get(i)+".\n");
                break;
            }
            System.out.print(Diller.get(i)+",");
        }
    }
}
