
public class account {
    private String isim;
    private double Bakiye;
    private String HesapNo;
    private String Eposta;
    private String TelefonNo;

    public account() {
    }

    public account(String isim, String TelefonNo, String Eposta) {
        this(isim, "Bilgi Yok", Eposta, TelefonNo, 0.0);
    }

    public account(String isim, String HesapNo) {
        this(isim, HesapNo, "Bilgi Yok", "Bilgi Yok", 0.0);
    }

    public account(String isim, String HesapNo, double Bakiye) {
        this(isim, HesapNo, "Bilgi Yok", "Bilgi Yok", Bakiye);
    }

    public account(String isim, String HesapNo, String Eposta, String TelefonNo, double Bakiye) {
        this.Bakiye = Bakiye;
        this.Eposta = Eposta;
        this.TelefonNo = TelefonNo;
        this.isim = isim;
        this.HesapNo = HesapNo;
    }

    public String getIsim() {
        return this.isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getBakiye() {
        return this.Bakiye;
    }

    public void setBakiye(double bakiye) {
        this.Bakiye = bakiye;
        System.out.println("İşlem Başarılı...\nYeni Bakiye: " + this.Bakiye);
    }

    public String getHesapNo() {
        return this.HesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.HesapNo = hesapNo;
    }

    public String getEposta() {
        return this.Eposta;
    }

    public void setEposta(String eposta) {
        this.Eposta = eposta;
    }

    public String getTelefonNo() {
        return this.TelefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.TelefonNo = telefonNo;
    }

    public void Para_Cek(double miktar) {
        if (miktar > 5000.0) {
            System.out.println("Günlük 5000 TL'den fazla para çekemezsiniz!");
        } else if (miktar > this.Bakiye) {
            System.out.println("Yetersiz bakiye...");
        } else {
            double Yeni_Bakiye = this.Bakiye - miktar;
            this.setBakiye(Yeni_Bakiye);
        }

    }

    public void Para_Yatir(double miktar) {
        double Yeni_Bakiye = this.Bakiye + miktar;
        this.setBakiye(Yeni_Bakiye);
    }

    public void Bakiye_sorgula() {
        System.out.println("Bakiye: " + this.Bakiye);
    }

    public String toString() {
        return "account{isim='" + this.isim + "', Bakiye=" + this.Bakiye + ", HesapNo='" + this.HesapNo + "', Eposta='" + this.Eposta + "', TelefonNo='" + this.TelefonNo + "'}";
    }
}
