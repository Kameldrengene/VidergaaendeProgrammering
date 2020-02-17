package Lektion3.Trelags;

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
        
        try{
            double BMI = funk.getBMI(cpr);
            System.out.println("BMI: " + BMI);
        } catch (IData.DataException e){
            System.out.println("CPR matcher ikke nogen i systemet, prøv igen");
        
        }
        
        System.out.println();
        
    }
    
}
