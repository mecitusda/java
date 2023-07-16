import java.util.ArrayList;

public class Yonetici extends Calisan{
    private int SorumluOlduguKisi_say;
    Yonetici(String isim,String departman,double maas,int SorumluOlduguKisi_say){
        super(isim,departman,maas);
        this.setSorumluOlduguKisi_say(SorumluOlduguKisi_say);
    }
    public void Zam_Yap(double zam,Calisan calisan){
        calisan.setMaas(calisan.getMaas()+zam);
    }
    public int getSorumluOlduguKisi_say() {
        return SorumluOlduguKisi_say;
    }

    public void setSorumluOlduguKisi_say(int sorumluOlduguKisi_say) {
        SorumluOlduguKisi_say = sorumluOlduguKisi_say;
    }

    public void Herkese_Zam_Yap(double Zam, ArrayList<Calisan> Calisanlar){
        for(int i=0;i<Calisanlar.size();i++){
            Calisanlar.get(i).setMaas(Calisanlar.get(i).getMaas()+Zam);
        }
    }
    @Override
    public void Bilgilerigoster() {
        super.Bilgilerigoster();
        System.out.println("Sorumlu Olduğu Kişi Sayısı: "+getSorumluOlduguKisi_say());
    }
}
