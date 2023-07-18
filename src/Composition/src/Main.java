public class Main {
    public static void main(String[] args) {
        ayak ayak =new ayak(42,5);
        goz goz=new goz(2,"mavi");
        el el=new el("Orta");
        insan ahmet=new insan(ayak,goz,el);

        System.out.println("Ahmet'in özellikleri:\n------------------------\nGöz rengi "+ahmet.getGoz().getRenk()+"'dir.\nGöz numarası ise "+ahmet.getGoz().getNumara()+"'dir.");
        System.out.println("Ayak numarası "+ahmet.getAyak().getNumara()+"'dir.\nAyak kuvveti: "+ahmet.getAyak().getKuvvet()+"'dir.");
        System.out.println("El büyüklüğü ise "+ahmet.getEl().getBuyukluk()+"'dır.");
    }
}