public class ComplicatedCheck implements ICheckS{

    public boolean User_Check(User user){
        if(user.getIsim().startsWith("A")){
            if(user.getYas()<18){
                System.out.println("18 yaşından küçükler kayıt olamaz!\n");
                return false;
            }
            else {

                return true;
            }
            }
            else{
                System.out.println("İsminiz gereksinimleri karşılamıyor!\nTekrar deneyiniz.\n");
                return false;
            }

    }
}