import java.util.ArrayList;
import java.util.LinkedList;
import java.util.SimpleTimeZone;

public class Main {
    static LinkedList teams=new LinkedList();
    static LinkedList<Team> sirala=new LinkedList<>();
    static String[] team_Names={"Galatasaray","FenerBahçe","Beşiktaş","TrabzonSpor","İstanbul Başakşehir",
     "Barcelona","Real Madrid","Liverpool","Manchester United","Chelsea","Man City","Juventus","Arsenal",
            "Bayern Münih","Dortmund","PSG","Milan","Internazionale"};

    public static void prepare_team(){//takımları oluşturup içerisine oyuncuları atıyorum.
            for(int i=0;i<18;i++)
                teams.add(new Team(team_Names[i]));//takımlar oluşturuldu.

        for(int i=0;i<18;i++) {
             Team takim= (Team) teams.get(i);

            for (int a = 0; a < 3; a++) {//Kaleci ekle
                takim.setGoalKeepers(Create_Player.Create(new GoalKeeper()));

            }
            for (int k = 0; k < 6; k++) {//hücumcu ekle
                 takim.setAttackers(Create_Player.Create(new Attacker()));
            }
            for (int l = 0; l < 10; l++) {//savunmacı
                takim.setDefenders(Create_Player.Create(new Defender()));
            }
            for (int j = 0; j < 6; j++) {//orta saha
                takim.setMidfielders(Create_Player.Create(new Midfielder()));
            }
            takim.calculate();
        }

    }

    public static void Oynanmayanlari_ekle(){//her takımın içerisinde tutulan oynamaları gereken takımları ekliyorum.
        for(int i=0;i<18;i++){
            for(int j=0;j<18;j++){
                if(i==j){

                }
                else{
                    Team temp=(Team)teams.get(i);
                    Team temp2=(Team)teams.get(j);
                    temp.addOynanmayan_Takimlar(temp2);
                }
            }

        }
    }

    public static Team get_high_point(LinkedList<Team> t){//Sıralama yaparken puanı en büyüğü buluyor.
        Team higher= t.get(0);
        for(int i=1;i<t.size();i++) {

            if(higher.getPoint()< sirala.get(i).getPoint()){
                higher=sirala.get(i);
            }
        }
        t.remove(higher);
        return higher;
    }
    public  static void team_status(int a,LinkedList<Team> sirala){//takım bilgilerini konsola yazıyor.
        int siralama=1;
        System.out.println("\n"+a+". hafta puan sıralaması");
        System.out.println("         isim                               maç istatikleri");
        LinkedList<Team> list=sirala;
        for(int i=0;i<18;i++) {
            Team yazilacak=get_high_point(list);
            System.out.printf( "%2d.%-19s     O: %2d  G: %2d  B: %2d  M: %2d  A: %3d  Y: %3d  AVG: %3d  P: %2d",siralama++,yazilacak.getTeam_Name(), yazilacak.getPlayed_Count(), yazilacak.getWin_Count(), yazilacak.getDraws_Count(), yazilacak.getLose_Count(), yazilacak.getGoal_Count(), yazilacak.getGoal_agains(), yazilacak.getAv(),yazilacak.getPoint());
            System.out.println();
            list.remove(yazilacak);
        }

    }


    public static void main(String[] args) {
            prepare_team();
            Oynanmayanlari_ekle();
            int a=1;
            for(int i=0;i<2;i++) {
                teams = new Fixtur().team_matching(teams);
                /*for(int j=0;j<18;j++){//Sıralarken takımları geçici değişkene atıyorum
                    sirala.add((Team)teams.get(i));
                }
                team_status(a++,sirala);*/
            }
    }
}