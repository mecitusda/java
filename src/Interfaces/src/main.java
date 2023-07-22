public class main {
    public static void main(String [] args) throws InterruptedException {
        String Sartlar="Yurtdışı çıkış için gerekli şartlar:\n1-)Siyasi yasağının olmaması.\n2-)Vize'ye sahip olmak.\n3-)Harç bedelini yatırmak.";
        String message="Yurtdışı'na çıkış izni reddedilmiştir.";
        System.out.println("Atatürk Havalimanı'na Hoşgeldiniz.");
        while(true){

            System.out.println("*************************************\n"+Sartlar);
            Yolcu yolcu=new Yolcu();
            System.out.println("\nHarç bedeli kontrol ediliyor...");
            Thread.sleep(3000);
            if(!yolcu.Harc_Kontrol()){
                System.out.println(message);
                continue;
            }
            System.out.println("\nVize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            if(!yolcu.Vize_Kontrol()){
                System.out.println(message);
                continue;
            }
            System.out.println("\nSiyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            if(yolcu.SiyasiYasak_Kontrol()){
                System.out.println(message);
                continue;
            }
            System.out.println("\n\nTebrikler bütün şartları sağladınız.Yurtdışı çıkış izniniz kabul edilmiştir!");
            break;
        }


    }
}
