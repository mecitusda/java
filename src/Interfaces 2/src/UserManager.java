import java.util.Scanner;

public class UserManager {
    ICheckS Check;

    public UserManager(ICheckS complicatedCheck) {
        Check = complicatedCheck;
    }

    public void Sign_Up(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Ad: ");
        String ad=scan.nextLine();
        System.out.print("Yaş: ");
        int yas=scan.nextInt();
        User user=new User(ad,yas);
        if(Check.User_Check(user)){
            System.out.println("Başarılı!\nHoşgeldiniz " + user.getIsim() + "!\n");
        }
    }
}
