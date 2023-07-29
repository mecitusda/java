package Log_in_interface;

public class Users {
    private String Kullanici_adi;
    private String sifre;

    public Users(String kullanici_adi,String sifre) {
        this.setKullanici_adi(kullanici_adi);
        this.setSifre(sifre);
    }


    public String getKullanici_adi() {
        return Kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        Kullanici_adi = kullanici_adi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}
