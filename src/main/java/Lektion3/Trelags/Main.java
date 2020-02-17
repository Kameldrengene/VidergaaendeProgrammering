package Lektion3.Trelags;

public class Main {
    public static void main(String[] args) {
        IData data = new Data();
        IFunktionalitet funk = new Funktionalitet(data);
        View ui = new View(funk);
        
        while (true){
            ui.run();
        }
    }
    
}
