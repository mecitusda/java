import java.util.Scanner;

public class Armstrong_Number {
    public static int check(int number){
        int check=0;
        while(number>0){
            number/=10;
            check++;}
    return check;
    }
    public static void main(String []args){
        int Armstrong;
        Scanner scan = new Scanner(System.in);
        while (true) {


        System.out.println("Kontrol edilecek Sayiyi giriniz:");
        int number=scan.nextInt();

        int ust=check(number);

        int temp,temp2;
        int toplam=0;
        temp2=number;
        do{
            temp=number%10;
            toplam+=(Math.pow(temp,ust));
            number/=10;
        }while(number>0);
       if(temp2==toplam){
           System.out.println("Bu bir Armstrong Sayısıdır.");
       }
       else{
           System.out.println("Bu bir Armstrong Sayısı değildir.");
       }
        }
    }
}
