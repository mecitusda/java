import java.util.Scanner;

public class Yolcu implements YurtDisi_cikis_kurallari{
    private double Harc;
    private String SiyasiYasak;
    private String Vize_Kontrol;
   public Yolcu(){
       Scanner scan=new Scanner(System.in);
       System.out.print("Ne kadar harç yatırdınız? :");
       this.Harc=scan.nextDouble();
       scan.nextLine();
       System.out.print("Siyasi yasağınız var mı?(evet ya da hayır) :");
       this.SiyasiYasak=scan.nextLine();
       System.out.print("Vizeniz var mı?(evet ya da hayır) :");
       this.Vize_Kontrol=scan.nextLine();
   }

    @Override
    public boolean SiyasiYasak_Kontrol() {
        if(this.SiyasiYasak.equals("evet")){
            System.out.println("Siyasi yasağınızdan dolayı yurtdışı'na çıkamazsınız!");
            return true;
        }
        else{
            System.out.println("Siyasi yasağınız bulunmamaktadır.");
            return false;
        }

    }

    @Override
    public boolean Harc_Kontrol() {
        if(this.Harc<150&&this.Harc>0){
            System.out.println("Ödenmemiş harç tutarı bulunmaktadır!");
            return false;
        }
        else{
            System.out.println("Harç işlemleriniz tamamlanmıştır!");
            return true;
        }
    }

    @Override
    public boolean Vize_Kontrol() {
        if(this.Vize_Kontrol.equals("evet")){
            System.out.println("Vize işleminiz tamamlanmıştır!");
            return true;
        }
        else {
            System.out.println("Vize bulunmamaktadır!");
            return false;
        }
    }
}
