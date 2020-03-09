package Lektion6;

import java.util.Random;

public class TennisSpiller extends Thread{
    
    private String navn;
    private boolean harBold = false;
    TennisSpiller modstander;
    
    public TennisSpiller(String navn){
        this.navn = navn;
    }
    
    public void setModstander(TennisSpiller modstander) {
        this.modstander = modstander;
    }
    
    public void setHarBold(boolean status){
        harBold = status;
    }
    
    @Override
    public synchronized void run(){
        
        do{
            if(harBold){
                this.setHarBold(false);
                if(retunerBold()){
                    System.out.println(navn + " returnerer bolden");
                    SetModstander();
                } else
                    modstander.interrupt();
                    break;
            }
    
            try {
                wait();
            } catch (InterruptedException e) {
            
            }
            
        } while(harBold);
    }
    
    public void SetModstander(){
        modstander.modtagBold();
        modstander.interrupt();
    }
    
    public void modtagBold(){
        harBold = true;
    }
    
    private boolean retunerBold(){
        Random rand = new Random();
        int result = rand.nextInt(100) + 1;
        
        Sleeper.sleepRandom(2);
        
        if(result > 20){
            System.out.println(navn + " tabte");
            return false;
        }
        else
            return true;
    }
}
