package Lektion3.treLags.UI;

import Lektion3.treLags.Data.IData;
import Lektion3.treLags.Funk.IFunk;

import java.util.Scanner;

public class TUI {
    private IFunk funk;

    public TUI(IFunk funk) {
        this.funk = funk;
    }

    public void showMenu() {
        System.out.println();
        System.out.println("Indtast CPR");
        String cpr = getCPR();
        System.out.println();
        showData(cpr);
    }

    public void showData(String cpr) {
        try {
            System.out.println(funk.getNavn(cpr) + " har en BMI på: " + funk.getBMI(cpr) + " = " + funk.getTextualBMI(cpr));
        } catch (IData.DataException e){
            System.out.println("Der findes ikke en person i systemet med dette CPR nummer");
        }
    }



    private String getCPR() {
        Scanner input = new Scanner(System.in);
        String cpr = input.nextLine();
        return cpr;
    }
}
