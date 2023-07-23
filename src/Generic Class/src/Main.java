public class Main {
    public static void main(String[] args) {
Character [] harf={'a','b','c','d'};
Integer [] sayi={1,2,3,4};
Double[] kesirli={3.5,23.6,34.6,21.54};
String [] metin={"ahmet","mehmet","arif","mirac"};
        GPrint<Integer> print =new GPrint<Integer>();
        GPrint<Character> printc =new GPrint<Character>();
        GPrint<Double> printD =new GPrint<Double>();
        GPrint<String> printS =new GPrint<String>();

print.yazdir(sayi);
System.out.println("---------------------");
printc.yazdir(harf);
        System.out.println("---------------------");
printD.yazdir(kesirli);
        System.out.println("---------------------");
printS.yazdir(metin);
System.out.println("Methodla çağırma: ");
yazdir(kesirli);
    }
    public static <E> void yazdir(E[] deger){

        for(E i:deger){
            System.out.println(i);
        }
    }
}