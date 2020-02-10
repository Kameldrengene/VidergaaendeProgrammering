package Lektion2.toLags;

import Lektion2.toLags.Data.DemoData;
import Lektion2.toLags.Data.IData;
import Lektion2.toLags.UI.IUI;
import Lektion2.toLags.UI.TUI;

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
