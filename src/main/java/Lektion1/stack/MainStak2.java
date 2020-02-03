package Lektion1.stack;

public class MainStak2 {
    public static void main(String[] args) {
        ArrayStak arrayStak = new ArrayStak(10);
        arrayStak.push("Dette");
        arrayStak.push("Er");
        arrayStak.push("En");
        arrayStak.push("Mærkelig");
        arrayStak.push("Sætning");
        arrayStak.show();
    }
}
