package Lektion5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileUsingByteStream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("provide destination path");
        String dest = input.nextLine();
        System.out.println("provide destination path");
        String source = input.nextLine();
        try {
            copy(dest,source);
        }catch (IOException e){
            System.out.println(e);
        }

    }

    public static void copy(String destfile, String sourcefile) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        File dest = new File("C:\\" + destfile +".txt");

        File source = new File("C:\\" + sourcefile +".txt");
        try {

            in = new FileInputStream(sourcefile);
            out = new FileOutputStream(destfile);
            int c;
            while ((c=in.read())!=1)
                out.write(c);

        }finally {
            if (in != null) in.close();
            if (out != null)out.close();
        }
    }
}
