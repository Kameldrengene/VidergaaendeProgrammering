package Lektion3.opgaveBMImedexeptions.opgave2;

public class Main {
    public static void main(String[] args) {
        IData iData = new Data();
        IFunktionalitet iFunktionalitet = new Funktionalitet(iData);
        UI ui = new UI(iFunktionalitet);
        ui.run();
    }



}
