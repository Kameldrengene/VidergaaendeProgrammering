package Lektion5.readdirectories;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] files = null;
        System.out.println("Indtast mappe; ");
        try {
            files = readdir.readdir(bufferedReader.readLine());
        }catch (Exception e){
            System.out.println("Mappen findes ikke");
        }
        for (int i = 0; i < files.length ; i++) {
            System.out.println(files[i]);
        }
    }
}
