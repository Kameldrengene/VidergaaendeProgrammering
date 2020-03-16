package Lektion5.CopyFileUsingByteStream;

import java.io.*;

public class FileHandler {
    static File file;
    static FileInputStream fileInputStream;
    static FileOutputStream fileOutputStream;
    public FileHandler(){

    }

    public static void copy(String source , String destination) throws Exception{
        file = new File(source);
        File exist = new File(destination);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        if (exist.exists()){
            System.out.println("Skal filen overskrives ? \n" + "1. Ja \n" + " 2. Nej\n");
        }

        if (bufferedReader.readLine().equals("Ja")){
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(exist);
            int i;
            while ((i=fileInputStream.read())!=-1){
                fileOutputStream.write(i);
            }
            if (fileInputStream!=null)
                fileOutputStream.close();
            if (fileOutputStream!=null)
                fileOutputStream.close();
        }
        else
            return;

    }

}
