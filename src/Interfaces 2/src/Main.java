public class Main {
    public static void main(String[] args) {
        UserManager manager=new UserManager(new ComplicatedCheck());
        while(true){
            manager.Sign_Up();
        }
    }
}