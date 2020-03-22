package Lektion6;

public class TennisSpiller extends Thread {

    String navn;
    boolean harBold;
    TennisSpiller Modstander;

    public TennisSpiller(String navn, boolean harBold, TennisSpiller modstander) {
        this.navn = navn;
        this.harBold = harBold;
        Modstander = modstander;
    }

    public void setHarBold(boolean harBold){
        this.harBold = harBold;
    }

    public void setModstander(TennisSpiller modstander) {
        Modstander = modstander;
    }
    public void ModtagBold(){
        harBold = true;

    }

    public void run(){
        while (true) {
            while (!harBold)
                Sleeper.nap();

            Sleeper.sleepRandom(2.0);

            if (Math.random() > 0.20) {
                System.out.println(this + "return's the ball");
                harBold = false;
                Modstander.ModtagBold();
            } else {
                System.out.println(this + "missed the ball");
                System.out.println("game is finished");
                System.out.println(Modstander.navn + " wins");
                System.out.println(this.navn + "lost");
                System.exit(0);
            }
        }
    }

    @Override
    public String toString() {
        return "TennisSpiller{" +
                "navn='" + navn + '\'' +
                ", harBold=" + harBold +
                ", Modstander=" + Modstander +
                '}';
    }
}
