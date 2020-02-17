package Lektion3.treLags;

import Lektion3.treLags.Data.Data;
import Lektion3.treLags.Funk.Funk;
import Lektion3.treLags.UI.TUI;

public class Main {
    public static void main(String[] args) {
        new TUI(new Funk(new Data())).showMenu();
    }
}
