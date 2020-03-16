package Lektion5;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class ReadDir {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        File file = null;
        String[] paths;

        try{
            // create new file object
            System.out.println("Indstast destination: ");
            file = new File(bufferedReader.readLine());

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths)
            {
                // prints filename and directory name
                System.out.println(path);
            }
            bufferedReader.close();
        }catch(Exception e){
            System.out.println("Filen findes ikke");
        }


    }
}

