package Lektion6;

public class Game {
    public void start(){
        Tennis p1 = new Tennis("Coraline",true);
        Tennis p2 = new Tennis("Serena",false);
        p1.setOpponent(p2);
        p2.setOpponent(p1);
        p1.start();
        p2.start();
        }
    }

