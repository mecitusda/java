import java.util.Scanner;

public  class ATM_Kod extends  ATM_Person{
    static ATM_Person person =new ATM_Person("Ahmet",3461,65400);;

    public ATM_Kod(String isim, int sifre, double Bakiye) {
        super(isim, sifre, Bakiye);
    }


    public static void Bakiye_Sorgula(){
        System.out.println("Bakiyeniz: "+person.getBakiye());
    }
    public static double Bakiye(){
        return person.getBakiye();
    }
    public static void Para_Cekme(double cekilen_miktar){
        if(cekilen_miktar> person.getBakiye()){
            System.out.println("Yetersiz Bakiye");
        }
        else{
           double YeniBakiye= person.getBakiye()-cekilen_miktar;
            person.setBakiye(YeniBakiye);
            System.out.println("İşlem Başarılı.\n-"+cekilen_miktar+"\nYeni Bakiye: "+Bakiye());

        }

    }

    public static void Para_Yatırma(double Yatirilan_Miktar){
        double YeniBakiye= person.getBakiye()+Yatirilan_Miktar;
        person.setBakiye(YeniBakiye);
        System.out.println("İşlem başarılı.\n+"+Yatirilan_Miktar+"\nYeni bakiye: "+Bakiye());
    }

    public static void Menü(String isim){
        String islem;
        Scanner scan=new Scanner(System.in);
        System.out.println("------------------Hoşgeldiniz "+isim+"------------------\n1-)Bakiye Öğrenme\n2-)Para çekme\n3-)Para Yatırma\nÇıkış için q'ya basınız.");
        islem=scan.nextLine();
        switch(islem){
            case "1":
                Bakiye_Sorgula();
                break;
            case "2":
                System.out.println("Çekilecek Miktar: ");
                double miktar_cekilecek=scan.nextDouble();
                Para_Cekme(miktar_cekilecek);
                break;
            case "3":
                System.out.println("Yatırılacak Miktar: ");
                double miktar_yatirilacak=scan.nextDouble();
                Para_Yatırma(miktar_yatirilacak);
                break;
            case "q":
                System.out.println("Çıkış Yapıldı.");
                System.exit(0);
            default:
                System.out.println("Yanlış tuşlama yaptınız.");
        }
    }
    public  static void  main(String [] args){

        //Kişiyi bankaya kayıtlı olarak kabul ediyoruz.

        while (true) {
            Menü(person.getIsim());
        }



    }
}
