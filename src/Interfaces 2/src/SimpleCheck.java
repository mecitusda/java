public class SimpleCheck implements ICheckS{
    public boolean User_Check(User user){
        if(user.getYas()<18){
            System.out.println("18 yaşından küçükler kayıt olamaz.\n");
            return false;
        }
        else{
            return true;
        }
    }
}
