package Lektion2.Trelags;

import java.util.Scanner;

public class View {
    
    IFunktionalitet funk;
    Scanner scan = new Scanner(System.in);
    
    public View(IFunktionalitet funk){
        this.funk = funk;
    }
    
    public void run(){
        System.out.println("Type CRP: ");
        String cpr = scan.nextLine();
        
        double BMI = funk.getBMI(cpr);
        System.out.println("BMI: " + BMI);
        System.out.println();
        
    }
    
}
