package Lektion6;

public class HelloThread extends Thread {
    
    public static void main(String args[]) {
        (new HelloThread()).start();
    }
}

