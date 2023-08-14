// Source code is decompiled from a .class file using FernFlower decompiler.
public class Main {
    public Main() {
    }

    public static void konustur(Object object) {
        if (object instanceof Kopek) {
            Kopek kopek = (Kopek)object;
            System.out.println(kopek.konus());
        } else if (object instanceof Kedi) {
            Kedi kedi = (Kedi)object;
            System.out.println(kedi.konus());
        } else if (object instanceof At) {
            At at = (At)object;
            System.out.println(at.konus());
        } else if (object instanceof Hayvan) {
            Hayvan hayvan = (Hayvan)object;
            System.out.println(hayvan.konus());
        }

    }

    public static void main(String[] args) {
        Kopek kopek = new Kopek("Karaba\u015f");
        Kedi kedi = new Kedi("Tekir");
        At at = new At("\u015eahbatur");
        Hayvan hayvan = new Hayvan("Limon");
        Kus kus = new Kus("Zeytin");
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
        konustur(kus);
    }
}
