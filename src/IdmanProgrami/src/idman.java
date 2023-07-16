import java.util.Scanner;

public class idman {
    private int Squat=0;
    private int Burpee=0;
    private int Pushup=0;
    private int Situp=0;
    Scanner scan=new Scanner(System.in);
public idman(int Pushup,int Situp,int Burpee,int Squat){
    this.Pushup=Pushup;
    this.Burpee=Burpee;
    this.Situp=Situp;
    this.Squat=Squat;
}
    public int getSquat() {
        return Squat;
    }

    public void setSquat(int squat) {
        this.Squat = squat;
    }

    public int getBurpee() {
        return Burpee;
    }

    public void setBurpee(int burpee) {
        this.Burpee = burpee;
    }

    public int getPushup() {
        return Pushup;
    }

    public void setPushup(int pushup) {
        this.Pushup = pushup;
    }

    public int getSitup() {
        return Situp;
    }

    public void setSitup(int situp) {
        this.Situp = situp;
    }
    public  void Hareket_yap(String Hareket_Tur, int Sayi){



        if(Hareket_Tur.equals("Burpee")) {
            if (Burpee > Sayi) {
               Burpee -= Sayi;
                System.out.println("Üzgünüm " + Burpee + " tane daha Burpee yapman gerekiyor...");
            }
            else if(Burpee<=Sayi) {
                Burpee=0;
                System.out.println("Tebrikler Burpee hareketini tamamladın!");
            }
        }
            else if (Hareket_Tur.equals("Squat")) {
                if (Squat > Sayi) {
                    this.Squat -= Sayi;
                    System.out.println("Üzgünüm " + Squat + " tane daha Squat yapman gerekiyor...");
                }
                else if(Squat<=Sayi){
                    Squat=0;
                    System.out.println("Tebrikler Squat hareketini tamamladın!");
                }
            }

                else if (Hareket_Tur.equals("Push Up")) {
                    if (Pushup > Sayi) {
                        this.Pushup -= Sayi;
                        System.out.println("Üzgünüm " + Pushup + " tane daha Push Up yapman gerekiyor...");
                    }
                    else if(Pushup<=Sayi){
                        Pushup=0;
                        System.out.println("Tebrikler Push Up hareketini tamamladın!");
                    }

                }
                   else  if (Hareket_Tur.equals("Sit Up")) {
                        if (Situp > Sayi) {
                            this.Situp -= Sayi;
                            System.out.println("Üzgünüm " + Situp + " tane daha Sit Up yapman gerekiyor...");
                        } else if(Situp<=Sayi){
                            Situp=0;
                            System.out.println("Tebrikler Sit Up hareketini tamamladın!");
                        }
                    }
                   else{
                       System.out.println("Böyle bir hareket yok!");
        }

}
    public  void goString(){
    System.out.println("ToString:\nSquat: "+getSquat()+"\nBurpee: "+getBurpee()+"\nPush Up: "+getPushup()+"\nSit Up: "+getSitup());
    }



            }

