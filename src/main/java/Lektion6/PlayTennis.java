package Lektion6;

public class PlayTennis {
    public static void main(String[] args) {
        TennisSpiller pl1 = new TennisSpiller("Talha",true,null);
        TennisSpiller pl2 = new TennisSpiller("mikkel",false,null);
        pl1.setModstander(pl2);
        pl2.setModstander(pl1);
        pl1.start();
        pl2.start();


    }
}
