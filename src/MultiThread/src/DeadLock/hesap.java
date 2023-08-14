package DeadLock;

public class hesap {
    private double bakiye=100000.0;
    private String HesapAdı;
    public hesap(String name){
        HesapAdı=name;
    }
    public void Para_Cek(double miktar){
        this.bakiye-=miktar;
    }
    public void Para_yatir(double miktar){
        this.bakiye+=miktar;
    }
    public static void Transfer(hesap hp1,hesap hp2,double miktar){
        if((hp2.bakiye-miktar)>=0) {
            hp1.Para_yatir(miktar);
            hp2.Para_Cek(miktar);
        }
        else{
            return;
        }
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public void ToString(){
        System.out.println(HesapAdı+" bakiye: "+this.bakiye);
    }
}
