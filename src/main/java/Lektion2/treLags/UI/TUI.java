package Lektion2.treLags.UI;

import Lektion2.treLags.Funk.IFunk;

import java.util.Scanner;

public class TUI {
    private IFunk funk;

    public TUI(IFunk funk){
        this.funk = funk;
    }

    public void showMenu() {
        System.out.println();
        System.out.println("Indtast CPR");
        String cpr = getCPR();
        System.out.println();
        showData(cpr);
    }

    public void showData(String cpr){
        System.out.println(funk.getNavn(cpr) + " har en BMI på: " + funk.getBMI(cpr) + " = " + funk.getTextualBMI(cpr));
    }


    private String getCPR(){
        Scanner input = new Scanner(System.in);
        String cpr = input.nextLine();
        return cpr;
    }
}
