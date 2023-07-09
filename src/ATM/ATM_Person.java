package ATM;

public class ATM_Person {
    public ATM_Person(String isim,int sifre,double Bakiye) {
        this.sifre = sifre;
        this.Bakiye=Bakiye;
        this.isim=isim;
    }

    private String isim;

    public double getBakiye() {
        return Bakiye;
    }

    public void setBakiye(double bakiye) {
        Bakiye = bakiye;
    }

    private double Bakiye=0;
    private int sifre;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }



}
