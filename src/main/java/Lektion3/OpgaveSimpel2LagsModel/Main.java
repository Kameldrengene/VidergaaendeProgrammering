package Lektion3.OpgaveSimpel2LagsModel;

public class Main {
    public static void main(String[] args) {
        IData data = new DemoData();
        IUI ui = new TUI(data);
        while (true){
            ui.showMenu();
        }

    }
}
