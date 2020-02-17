package Lektion2.opgave2;


import java.util.Scanner;

public class UI {

    private IFunktionalitet iFunktionalitet;
    Scanner scan;
    String cpr;
    public UI(IFunktionalitet iFunktionalitet){
        this.iFunktionalitet = iFunktionalitet;
        scan = new Scanner(System.in);
    }

    public void run(){
        cpr = "";
        while (!cpr.equals("stop")) {
            System.out.println("Indtast cpr nr for se BMI: ");
            cpr = scan.nextLine();
            if (cpr.equals("stop"))
                break;
            System.out.println("Din BMI er: " + iFunktionalitet.getBMI(cpr) + " Din tilstand: " + iFunktionalitet.getTextualBMI(cpr));
        }
    }



}
