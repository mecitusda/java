import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

public static void ListGoster(LinkedList<String> list){
    for (String s:list) {
        System.out.println(s);
    }
}
public static void ListGosteriterator(LinkedList<String> list){
    ListIterator iterator=list.listIterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
}
public static void Sirala(LinkedList<String> list,String new_one){
    ListIterator<String> iterator=list.listIterator();

    while(iterator.hasNext()){
        String iteratorsayi=iterator.next();
        if(iteratorsayi.compareTo(new_one)==0){
            System.out.println("Bu içerik listede bulunuyor...");
            return;
        }

        else if(iteratorsayi.compareTo(new_one)>0){
                iterator.previous();
                iterator.add(new_one);
                return;
        }

    }
    iterator.add(new_one);

}

















    public static void main(String[] args) {

        LinkedList<String> list=new LinkedList<String>();
        LinkedList<String> siralilist=new LinkedList<String>();
        list.add("ali");                      //
        list.add("mehmet");                  //Sırasız ekleme.
        list.add("arif");                   //
        ListGosteriterator(list); //ListGosteriterator(); 'de kullanabiliriz.Üstte içeriği var.
        System.out.println("---------------------------\nSıralı hali: ");
        Sirala(siralilist,"ali");
        Sirala(siralilist,"mehmet");
        Sirala(siralilist,"arif");
        ListGosteriterator(siralilist);

    }
}