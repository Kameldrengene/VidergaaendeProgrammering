package Lektion6;

public class SpilTennis {
    
    public static void main(String[] args) {
        TennisSpiller p1 = new TennisSpiller("Mikkel");
        TennisSpiller p2 = new TennisSpiller("Volkan");
        
        p1.setModstander(p2);
        p2.setModstander(p1);
        
        p1.setHarBold(true);
        p2.setHarBold(false);
        
        p1.start();
        p2.start();
        
    }
    
   
    
    
}
