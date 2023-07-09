import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and ty    pe `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      if(scanner.hasNextFloat()){
          float yas=scanner.nextFloat();
          System.out.println("Girdiginiz yas degeri: "+yas);
      }
      else{
          System.out.println("Bir sayi girmediniz...");
      }
        }
    }
