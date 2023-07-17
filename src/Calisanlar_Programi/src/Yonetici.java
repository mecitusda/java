public class Yonetici extends Calisanlar{
    private int Sorumlu_kisi_sayisi;
    public Yonetici(String ad, String soyad, int id,int Sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.Sorumlu_kisi_sayisi=Sorumlu_kisi_sayisi;
    }


    @Override
    public void Bilgileri_Goster() {
        super.Bilgileri_Goster();
        System.out.println("Yöneticinin Sorumlu olduğu kişi sayısı: "+Sorumlu_kisi_sayisi);
    }

    public void Zam_Yap(double Zam){
        System.out.println(getAd()+" çalışanlara "+Zam+" TL zam yaptı...");
    }
}
