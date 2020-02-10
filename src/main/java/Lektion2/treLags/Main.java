package Lektion2.treLags;

import Lektion2.treLags.Data.Data;
import Lektion2.treLags.Funk.Funk;
import Lektion2.treLags.UI.TUI;

public class Main {
    public static void main(String[] args) {
        new TUI(new Funk(new Data())).showMenu();
    }
}
