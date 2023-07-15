

import java.util.Scanner;

public class Main extends account{
    public static void Menu(){
        System.out.println("----------- Lütfen yapmak istediğiniz işlemi seçin -----------\n1-)Para çekme.\n2-)Para yatırma\n3-)Bakiye sorgulama\nq-)Çıkış yap");

    }
    public static boolean Options(char choose,account account){

        Scanner scan=new Scanner(System.in);
        double miktar;


        if(choose=='1'){
            System.out.println("Çekmek istediğiniz miktarı giriniz: ");
            miktar=scan.nextDouble();
            account.Para_Cek(miktar);
        }
        else if(choose=='2'){
            System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
            miktar=scan.nextDouble();
            account.Para_Yatir(miktar);
        }
        else if(choose=='3'){
            account.Bakiye_sorgula();
        }
        else{
            if(choose=='q'){
                return true;
            }
            else{
                System.out.println("Yanlış tuşlama yaptınız...");
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        account acc1 = new account("Mirac", "52165853215");
        account acc2 = new account("Mirac", "54463697562", 6524);

        Runnable Bank =()-> {
            while (true) {

                account chosen_acc;
                System.out.println("----------- Hoşgeldiniz -----------\nHesap Seçiniz:\n1-)account1\n2-)account2");
                while (true) {                                                     //
                    int choose = scan.nextInt();                                  //
                    if (choose == 1) {                                           //
                        chosen_acc = acc1;                                      //
                        break;                                                 //
                    } else if (choose == 2) {                                 //    Choose Bank.account.
                        chosen_acc = acc2;                                   //
                        break;                                              //
                    } else {                                               //
                        System.out.println("Böyle bir hesap yok...");     //
                    }                                                    //
                }                                                       //
                while (true) {                                               //
                    Menu();                                                 //
                    char choose = scan.next().charAt(0);                   //
                    scan.nextLine();                                      //
                    boolean dongu=Options(choose, chosen_acc);           //         Menü+Choose option and if its quit.
                                                                        //
                    if(dongu) {                                        //then break.
                        break;                                        //
                    }                                                //
                }                                                   //
            }
        };
        Bank.run();
    }
}



