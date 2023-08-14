import java.util.Random;

public  class Create_Player {

//Oyuncuların değerlerini rastgele oluşturuyorum
    public static GoalKeeper Create(GoalKeeper player){



        player.technical_Features.setFree_Kick_Taking(new Player_Chance().low_Chance());
        player.technical_Features.setPenalty_taking(new Player_Chance().low_Chance());
        player.technical_Features.setTechnique(new Player_Chance().normal_Chance());
        //Mental
        player.mental_Features.setAggression(new Player_Chance().low_Chance());
        player.mental_Features.setAnticipation(new Player_Chance().high_Chance());
        player.mental_Features.setBravery(new Player_Chance().normal_Chance());
        player.mental_Features.setComposure(new Player_Chance().normal_Chance());
        player.mental_Features.setConcentration(new Player_Chance().normal_Chance());
        player.mental_Features.setDecisions(new Player_Chance().high_Chance());
        player.mental_Features.setDetermination(new Player_Chance().normal_Chance());
        player.mental_Features.setFlair(new Player_Chance().high_Chance());
        player.mental_Features.setLeadership(new Player_Chance().normal_Chance());
        player.mental_Features.setOff_The_Ball(new Player_Chance().low_Chance());
        player.mental_Features.setPositioning(new Player_Chance().high_Chance());
        player.mental_Features.setTeamwork(new Player_Chance().normal_Chance());
        player.mental_Features.setVision(new Player_Chance().low_Chance());
        player.mental_Features.setWork_Rate(new Player_Chance().normal_Chance());
        //Physical
        player.physical_Features.setAcceleration(new Player_Chance().low_Chance());
        player.physical_Features.setAgility(new Player_Chance().high_Chance());
        player.physical_Features.setBalance(new Player_Chance().high_Chance());
        player.physical_Features.setJumping_Reach(new Player_Chance().high_Chance());
        player.physical_Features.setNatural_Fitness(new Player_Chance().normal_Chance());
        player.physical_Features.setPace(new Player_Chance().low_Chance());
        player.physical_Features.setStamina(new Player_Chance().normal_Chance());
        player.physical_Features.setStrength(new Player_Chance().high_Chance());
        //GoalKeeping
        player.goal_Keeping.setAerial_Reach(new Player_Chance().high_Chance());
        player.goal_Keeping.setCommand_Of_Area(new Player_Chance().high_Chance());
        player.goal_Keeping.setCommunication(new Player_Chance().normal_Chance());
        player.goal_Keeping.setEccentricity(new Player_Chance().low_Chance());
        player.goal_Keeping.setFirst_Touch(new Player_Chance().low_Chance());
        player.goal_Keeping.setHandling(new Player_Chance().normal_Chance());
        player.goal_Keeping.setKicking(new Player_Chance().normal_Chance());
        player.goal_Keeping.setOne_On_Ones(new Player_Chance().high_Chance());
        player.goal_Keeping.setPassing(new Player_Chance().low_Chance());
        player.goal_Keeping.setPunching(new Player_Chance().normal_Chance());
        player.goal_Keeping.setReflexes(new Player_Chance().high_Chance());
        player.goal_Keeping.setRushing_Out(new Player_Chance().low_Chance());
        player.goal_Keeping.setThrowing(new Player_Chance().normal_Chance());
        player.calculate();
        return player;


    }
    public static Midfielder Create(Midfielder player){

        //Technical
        player.technical_Features.setCorners(new Player_Chance().normal_Chance());
        player.technical_Features.setCrossing(new Player_Chance().normal_Chance());
        player.technical_Features.setDribbling(new Player_Chance().normal_Chance());
        player.technical_Features.setFinishing(new Player_Chance().normal_Chance());
        player.technical_Features.setFirst_Touch(new Player_Chance().high_Chance());
        player.technical_Features.setFree_Kick_Taking(new Player_Chance().normal_Chance());
        player.technical_Features.setHeading(new Player_Chance().high_Chance());
        player.technical_Features.setLong_Shots(new Player_Chance().normal_Chance());
        player.technical_Features.setLong_Throws(new Player_Chance().low_Chance());
        player.technical_Features.setMarking(new Player_Chance().low_Chance());
        player.technical_Features.setPassing(new Player_Chance().high_Chance());
        player.technical_Features.setPenalty_taking(new Player_Chance().normal_Chance());
        player.technical_Features.setTackling(new Player_Chance().normal_Chance());
        player.technical_Features.setTechnique(new Player_Chance().high_Chance());
        //Mental
        player.mental_Features.setAggression(new Player_Chance().normal_Chance());
        player.mental_Features.setAnticipation(new Player_Chance().normal_Chance());
        player.mental_Features.setBravery(new Player_Chance().normal_Chance());
        player.mental_Features.setComposure(new Player_Chance().high_Chance());
        player.mental_Features.setConcentration(new Player_Chance().low_Chance());
        player.mental_Features.setDecisions(new Player_Chance().normal_Chance());
        player.mental_Features.setDetermination(new Player_Chance().normal_Chance());
        player.mental_Features.setFlair(new Player_Chance().normal_Chance());
        player.mental_Features.setLeadership(new Player_Chance().high_Chance());
        player.mental_Features.setOff_The_Ball(new Player_Chance().high_Chance());
        player.mental_Features.setPositioning(new Player_Chance().normal_Chance());
        player.mental_Features.setTeamwork(new Player_Chance().high_Chance());
        player.mental_Features.setVision(new Player_Chance().normal_Chance());
        player.mental_Features.setWork_Rate(new Player_Chance().low_Chance());
        //Physical
        player.physical_Features.setAcceleration(new Player_Chance().normal_Chance());
        player.physical_Features.setAgility(new Player_Chance().high_Chance());
        player.physical_Features.setBalance(new Player_Chance().high_Chance());
        player.physical_Features.setJumping_Reach(new Player_Chance().low_Chance());
        player.physical_Features.setNatural_Fitness(new Player_Chance().high_Chance());
        player.physical_Features.setPace(new Player_Chance().high_Chance());
        player.physical_Features.setStamina(new Player_Chance().normal_Chance());
        player.physical_Features.setStrength(new Player_Chance().normal_Chance());
        player.calculate();
        return player;

    }


    public static  Attacker Create(Attacker player){

        //Technical
        player.technical_Features.setCorners(new Player_Chance().low_Chance());
        player.technical_Features.setCrossing(new Player_Chance().normal_Chance());
        player.technical_Features.setDribbling(new Player_Chance().high_Chance());
        player.technical_Features.setFinishing(new Player_Chance().normal_Chance());
        player.technical_Features.setFirst_Touch(new Player_Chance().high_Chance());
        player.technical_Features.setFree_Kick_Taking(new Player_Chance().normal_Chance());
        player.technical_Features.setHeading(new Player_Chance().normal_Chance());
        player.technical_Features.setLong_Shots(new Player_Chance().normal_Chance());
        player.technical_Features.setLong_Throws(new Player_Chance().low_Chance());
        player.technical_Features.setMarking(new Player_Chance().low_Chance());
        player.technical_Features.setPassing(new Player_Chance().high_Chance());
        player.technical_Features.setPenalty_taking(new Player_Chance().normal_Chance());
        player.technical_Features.setTackling(new Player_Chance().low_Chance());
        player.technical_Features.setTechnique(new Player_Chance().high_Chance());
        //Mental
        player.mental_Features.setAggression(new Player_Chance().normal_Chance());
        player.mental_Features.setAnticipation(new Player_Chance().high_Chance());
        player.mental_Features.setBravery(new Player_Chance().normal_Chance());
        player.mental_Features.setComposure(new Player_Chance().high_Chance());
        player.mental_Features.setConcentration(new Player_Chance().normal_Chance());
        player.mental_Features.setDecisions(new Player_Chance().normal_Chance());
        player.mental_Features.setDetermination(new Player_Chance().normal_Chance());
        player.mental_Features.setFlair(new Player_Chance().high_Chance());
        player.mental_Features.setLeadership(new Player_Chance().low_Chance());
        player.mental_Features.setOff_The_Ball(new Player_Chance().normal_Chance());
        player.mental_Features.setPositioning(new Player_Chance().low_Chance());
        player.mental_Features.setTeamwork(new Player_Chance().normal_Chance());
        player.mental_Features.setVision(new Player_Chance().high_Chance());
        player.mental_Features.setWork_Rate(new Player_Chance().normal_Chance());
        //Physical
        player.physical_Features.setAcceleration(new Player_Chance().normal_Chance());
        player.physical_Features.setAgility(new Player_Chance().normal_Chance());
        player.physical_Features.setBalance(new Player_Chance().high_Chance());
        player.physical_Features.setJumping_Reach(new Player_Chance().normal_Chance());
        player.physical_Features.setNatural_Fitness(new Player_Chance().high_Chance());
        player.physical_Features.setPace(new Player_Chance().high_Chance());
        player.physical_Features.setStamina(new Player_Chance().normal_Chance());
        player.physical_Features.setStrength(new Player_Chance().high_Chance());
        player.calculate();
        return player;

    }

    public static Defender Create(Defender player){
        //Technical
        player.technical_Features.setCorners(new Player_Chance().low_Chance());
        player.technical_Features.setCrossing(new Player_Chance().low_Chance());
        player.technical_Features.setDribbling(new Player_Chance().low_Chance());
        player.technical_Features.setFinishing(new Player_Chance().low_Chance());
        player.technical_Features.setFirst_Touch(new Player_Chance().high_Chance());
        player.technical_Features.setFree_Kick_Taking(new Player_Chance().low_Chance());
        player.technical_Features.setHeading(new Player_Chance().high_Chance());
        player.technical_Features.setLong_Shots(new Player_Chance().low_Chance());
        player.technical_Features.setLong_Throws(new Player_Chance().low_Chance());
        player.technical_Features.setMarking(new Player_Chance().high_Chance());
        player.technical_Features.setPassing(new Player_Chance().normal_Chance());
        player.technical_Features.setPenalty_taking(new Player_Chance().low_Chance());
        player.technical_Features.setTackling(new Player_Chance().high_Chance());
        player.technical_Features.setTechnique(new Player_Chance().normal_Chance());
        //Mental
        player.mental_Features.setAggression(new Player_Chance().normal_Chance());
        player.mental_Features.setAnticipation(new Player_Chance().high_Chance());
        player.mental_Features.setBravery(new Player_Chance().high_Chance());
        player.mental_Features.setComposure(new Player_Chance().normal_Chance());
        player.mental_Features.setConcentration(new Player_Chance().normal_Chance());
        player.mental_Features.setDecisions(new Player_Chance().normal_Chance());
        player.mental_Features.setDetermination(new Player_Chance().normal_Chance());
        player.mental_Features.setFlair(new Player_Chance().low_Chance());
        player.mental_Features.setLeadership(new Player_Chance().high_Chance());
        player.mental_Features.setOff_The_Ball(new Player_Chance().low_Chance());
        player.mental_Features.setPositioning(new Player_Chance().high_Chance());
        player.mental_Features.setTeamwork(new Player_Chance().normal_Chance());
        player.mental_Features.setVision(new Player_Chance().normal_Chance());
        player.mental_Features.setWork_Rate(new Player_Chance().normal_Chance());
        //Physical
        player.physical_Features.setAcceleration(new Player_Chance().normal_Chance());
        player.physical_Features.setAgility(new Player_Chance().normal_Chance());
        player.physical_Features.setBalance(new Player_Chance().high_Chance());
        player.physical_Features.setJumping_Reach(new Player_Chance().high_Chance());
        player.physical_Features.setNatural_Fitness(new Player_Chance().normal_Chance());
        player.physical_Features.setPace(new Player_Chance().normal_Chance());
        player.physical_Features.setStamina(new Player_Chance().high_Chance());
        player.physical_Features.setStrength(new Player_Chance().high_Chance());
        player.calculate();
        return player;
    }
}
