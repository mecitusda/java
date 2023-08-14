import java.util.Random;

public class Player_Chance {


    private static int chance;

    public static int high_Chance(){
        while (true) {
            chance=new Random().nextInt(100);
            chance%=20;
            if(chance>14&&chance<=20)
                return chance;

        }
    }
    public static int normal_Chance(){
        while (true){
            chance=new Random().nextInt(20);
            chance%=20;
            if(chance>10&&chance<=14)
                return chance;
        }
    }

    public static int low_Chance(){
        while(true){
            chance=new Random().nextInt(100);
            chance%=20;
            if(chance>0&&chance<=10)
                return chance;

        }
    }

    public static int goal_Chance(Team attacker,Team defender){
       int gol=0;
        for(int i=0;i<20;i++) {

             //double attacker_Goal_Chance =attacker.getTeam_average_Strength()*0.306+attacker.getAverage_Attacker_Strength()*0.5615+attacker.getAverage_Midfielder_Strength()*0.11+attacker.getAverage_Defender_Strength()*0.12+attacker.getAverage_Goalkeeper_Strength()*0.088+new Random().nextDouble(220)%21;
             //double defender_Def_Chance =defender.getTeam_average_Strength()*0.307+defender.getAverage_Goalkeeper_Strength()*0.3+defender.getAverage_Defender_Strength()*0.31+defender.getAverage_Midfielder_Strength()*0.12 +defender.getAverage_Attacker_Strength()*0.1% new Random().nextDouble(200)%20;
            double attacker_Goal_Chance =attacker.getTeam_average_Strength()*0.306+attacker.getAverage_Attacker_Strength()*0.5615+attacker.getAverage_Midfielder_Strength()*0.11+attacker.getAverage_Defender_Strength()*0.12+attacker.getAverage_Goalkeeper_Strength()*0.088+new Random().nextDouble(110)%21;
           double defender_Def_Chance =defender.getTeam_average_Strength()*0.307+defender.getAverage_Goalkeeper_Strength()*0.3+defender.getAverage_Defender_Strength()*0.31+defender.getAverage_Midfielder_Strength()*0.12 +defender.getAverage_Attacker_Strength()*0.1% new Random().nextDouble(100)%20;

                if(attacker_Goal_Chance>defender_Def_Chance){
                     //gol attı.
                    //gol yedi.
                    gol++;
                }

        }
        return gol;
    }

}
