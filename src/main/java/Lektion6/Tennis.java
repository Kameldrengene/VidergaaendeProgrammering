package Lektion6;

public class Tennis extends Thread{
    String playerName;
    Tennis opponent;
    boolean hasBall = false;
    int chance = 0;

    public Tennis(String name, boolean hasBall){
        this.playerName = name;
        this.hasBall = hasBall;
    }

    public void setOpponent(Tennis oppenent){
        this.opponent = oppenent;
    }

    public void setHasBall() {
        this.hasBall = true;
    }



    public Tennis getOpponent() {
        return opponent;
    }

    public boolean isHasBall() {
        return hasBall;
    }

    public void run(){

        if(this.hasBall) {
            try {
                this.sleep(2000);
            } catch (InterruptedException e) {
               // this.run();
                e.printStackTrace();
            }
                if (returnChance()) {
                    System.out.println(this.playerName+" returnerer bolden");
                    this.opponent.setHasBall();
                    this.hasBall=false;
                    this.opponent.interrupt();
                    this.run();
                } else {
                    System.out.println(this.playerName + "Tabt bolden");
                    this.hasBall=false;
                    opponent.hasBall=false;
                    this.interrupt();
                    opponent.interrupt();
                }

        }
        else {
            try {
                this.sleep(3000);
            } catch (InterruptedException e) {
                this.run();
            }
        }
    }

    public boolean returnChance(){
        this.chance = (int)(Math.random()*100);
        if (chance >= 10) {
            return true;
        }
        else {
            return false;
        }
    }
}
