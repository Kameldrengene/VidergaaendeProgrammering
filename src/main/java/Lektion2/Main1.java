package Lektion2;

public class Main1 {
    public static void main(String[] args) {
        IData data = new DemoData();
        IUI ui = new TUI(data);
        while (true){
            ui.showMenu();
        }
    }

//    public static void main(String[] args) {
//        DemoData demoData = new DemoData();
//        for(int i = 0; i < demoData.getAllIngredients().length;i++){
//            System.out.println(demoData.getAllIngredients()[i]);
//        }
//
//    }
}
