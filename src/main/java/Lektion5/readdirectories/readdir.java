package Lektion5.readdirectories;

import java.io.File;

public class readdir {
    public static String[] readdir;
    public readdir(){
    }
    public static String[] readdir(String str){

        try {
            File file = new File(str);
            readdir = file.list();
        }catch (Exception e){
            readdir[0] = "Mappen eksisterer ikke";
        }

        return readdir;
    }
}
