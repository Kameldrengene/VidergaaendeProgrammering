package Lektion2;

public class Main1 {
    public static void main(String[] args) {
        IData data = new DemoData();
        IUI ui = new TUI(data);
        while (true){
            ui.showMenu();
        }
    }
}
