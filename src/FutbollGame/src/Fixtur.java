import java.util.*;

public class Fixtur {//bu class'ta fixtur eşleştirmesi yapıyorum
    private  ArrayList<Team> teams=new ArrayList<>(18);//eşleşecek takımları tutuyor.
    Map<Team,Team> match_yapacaklar = new LinkedHashMap<Team, Team>(9);//takımları eşleştirmede kullanıyorum

    public Fixtur(){

    }

    public void takimlar_dogru(){//birbiriyle maç yapabilecek takımları arıyor.
        while (true) {//eşleşme doğru şekilde tamamlanana kadar çalışyor.
            while (teams.size() != 0) { //takım sayısı 0'lanana kadar birbiriyle maç yapabilecek 2 takımı eşleştiriyor(eşleşen takımlar
                // match_yapacaklar değişkeninde tutuluyor.)

                Collections.shuffle(teams);//rasgele seçmek için takımları karıştırıyor.
                Team team1 = teams.get(0);
                Collections.shuffle(teams);
                Team team2 = teams.get(0);

                if (team1.getTeam_Name().equals(team2.getTeam_Name())) {//aynı takımsa continue
                    continue;
                }

                match_yapacaklar.put(team1, team2);//seçilenleri match_yapacaklar listesine atıyor.
                teams.remove(team1);
                teams.remove(team2);
            }

            boolean uyuşmayan_var=false;
            for (Map.Entry<Team, Team> s : match_yapacaklar.entrySet()) {

                if (s.getKey().getDeplasmanda_oynananlar().contains(s.getValue())&&s.getKey().getEvde_oynanlar().contains(s.getValue())) {
                    uyuşmayan_var=true;//eğer iki takım hem deplasman hemde evde oynadıysa bu 2 takımın eşleşmesini engelliyoruz.

                    break;
                }
                else if (s.getKey().getEvde_oynanlar().contains(s.getValue())&&s.getKey().getDeplasmanda_oynananlar().contains(s.getValue())) {
                    uyuşmayan_var=true;//eğer iki takım hem deplasman hemde evde oynadıysa bu 2 takımın eşleşmesini engelliyoruz.
                    break;
                }

            }
            if(uyuşmayan_var){
                for(Map.Entry<Team,Team> s : match_yapacaklar.entrySet()) {
                    teams.add(s.getKey());//seçilenlerden herhangi biri uyuşmuyorsa match_yapacakları teams'e geri ekliyoruz
                    teams.add(s.getValue());


                }
                match_yapacaklar.clear();//her döngüde tekrar kullanabilmek için temizliyoruz.
                continue;//ve uyuşmayan olduğu için döngüyü tekrardan çalıştırıyoruz.
            }
            return;//döngü bitince eşleşince döngüyü kırıyoruz.
        }
    }



    public  ArrayList<Team> team_matching(ArrayList<Team> team) {
        teams = team;
        int temp=1;
        int T1 = 0;
        int T2 = 0;

        takimlar_dogru();//match yapacakları ayarladım.Şuan maça hazırlar.



        for(Map.Entry<Team,Team> s : match_yapacaklar.entrySet()){

            Team team1=s.getKey();
            Team team2=s.getValue();
            teams.add(team1);
            teams.add(team2);
            if (!team1.getDeplasmanda_oynananlar().contains(team2) ) {//team1 deplasmanda oynamadıysa
                team2.add_Supperter_Strength();//2. takımın sahasında oynandığı için ev sahibi şansını ekledim.
                T1 = Player_Chance.goal_Chance(team1, team2); //maç yapıldı
                T2 = Player_Chance.goal_Chance(team2, team1);//
                team2.addEvde_oynananlar(team1);//takım1 ile evde oynandı
                team1.addDeplasmanda_oynananlar(team2);//takım2 ile deplasmanda oynandı
                team1.setPlayed_Count(1);//oynanan maç sayılarını arttırdım.
                team2.setPlayed_Count(1);


                team2.remove_Supperter_Strength();  //maçtan sonra gücü düzeltiyorum
                team1.setGoal_Count(T1);
                team1.setGoal_agains(T2);//atılan golleri yazıyorum.
                team2.setGoal_Count(T2);
                team2.setGoal_agains(T1);
                if (T1 > T2) {
                    team1.setWin_Count(1);
                    team2.setLose_Count(1);//win ve lose u arttırıyorum
                } else if (T1 < T2) {
                    team2.setWin_Count(1);
                    team1.setLose_Count(1);//win ve lose u arttırıyorum
                } else {
                    team1.setDraws_Count(1);
                    team2.setDraws_Count(1);//win ve lose u arttırıyorum
                }
                System.out.println((temp++) + ". maç " + team1.getTeam_Name() + " " + T1 + "-" + T2 + " " + team2.getTeam_Name());//maç sonucu

            }

            else if (!team1.getEvde_oynanlar().contains(team2)) {//team1 evde oynamadıysa


                team1.add_Supperter_Strength();//1. takımın sahasında oynandığı için ev sahibi şansını ekledim.
                T1 = Player_Chance.goal_Chance(team1, team2); //maç yapıldı
                T2 = Player_Chance.goal_Chance(team2, team1);//

                team1.addEvde_oynananlar(team2);//takım2 ile evde oynandı
                team2.addDeplasmanda_oynananlar(team1);//takım1 ile deplasmanda oynandı
                team1.setPlayed_Count(1);
                team2.setPlayed_Count(1);
                //oynanmayanlardan çıkarıldı
                team1.remove_Supperter_Strength();//maçtan sonra gücü düzeltiyorum
                team1.setGoal_Count(T1);
                team1.setGoal_agains(T2);//atılan golleri yazıyorum.
                team2.setGoal_Count(T2);
                team2.setGoal_agains(T1);
                if (T1 > T2) {
                    team1.setWin_Count(1);
                    team2.setLose_Count(1);//win ve lose u arttırıyorum
                } else if (T1 < T2) {
                    team2.setWin_Count(1);
                    team1.setLose_Count(1);//win ve lose u arttırıyorum
                } else {
                    team1.setDraws_Count(1);
                    team2.setDraws_Count(1);//win ve lose u arttırıyorum
                }
                System.out.println((temp++) + ". maç " + team1.getTeam_Name() + " " + T1 + "-" + T2 + " " + team2.getTeam_Name());

            }

        }
        // match_yapacaklar.clear();//tekrardan kullanabilmek için temizliyoruz.
        return teams;

    }

}











