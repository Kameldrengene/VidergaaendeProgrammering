package Lektion1.stack;

public class MainStak1 {
    public static void main(String[] args) {
        LinkedStak linkedStak = new LinkedStak();
        linkedStak.push("Dette");
        linkedStak.push("Er");
        linkedStak.push("En");
        linkedStak.push("Mærkelig");
        linkedStak.push("Sætning");
        linkedStak.show();
    }
}
