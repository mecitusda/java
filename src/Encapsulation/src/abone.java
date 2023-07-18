public class abone {

    private String AboneIsim;
    private double bakiye=120;
    private String sehir;

    public abone(String aboneIsim,double bakiye,String sehir){
        this.setAboneIsim(aboneIsim);
        if(bakiye>=0&&bakiye<=120)
            this.setBakiye(bakiye);
        else{
            System.out.println("Bakiye limitiniz 120 TL'dir.Bakiyeniz 120 ile değiştirilmiştir.");
        }
        this.setSehir(sehir);
    }


    public String getAboneIsim() {
        return AboneIsim;
    }

    public void setAboneIsim(String aboneIsim) {
        AboneIsim = aboneIsim;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public void dogalgaz_kullan(double miktar){
        if((bakiye-miktar)<0){
            System.out.println("Yetersiz bakiye...");
        }
        else{
            bakiye-=miktar;
            if(bakiye==0){
                System.out.println("Bakiyeniz bitmiştir.Lütfen en kısa sürede bakiye yükleyiniz.");
            }
            else{
                System.out.println("Başarıyla kullanıldı.\n\nYeni Bakiye: "+bakiye);
            }
        }


    }
    public void bakiyeogren(){
        System.out.println("Bakiyeniz: "+bakiye);
    }
}
