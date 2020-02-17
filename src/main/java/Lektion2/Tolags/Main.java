package Lektion2.Tolags;

public class Main {
    
    public static void main(String[] args) {
        IData data = new DemoData();
  
        IView ui = new View(data);
        while (true){
            ui.showMenu();
        }
    

        
    }
    
}
