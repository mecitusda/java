public class User {
    private String isim;
    private int yas;
    private String sifre;

    public User(String isim,int yas) {
        this.setIsim(isim);
        this.setYas(yas);
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}
