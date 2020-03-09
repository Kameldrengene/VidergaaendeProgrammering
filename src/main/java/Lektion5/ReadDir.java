package Lektion5;

import java.io.File;
import java.util.Scanner;

public class ReadDir {
    
    
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        try{
    
            System.out.println("Input path: ");
            String sti = scan.nextLine();
            
            String[] paths = readdir(sti);
    
            // for each name in the path array
            for(String path:paths)
            {
                // prints filename and directory name
                System.out.println(path);
            }
            
           
        }catch(Exception e){
            // if any error occurs
            System.out.println("Filen eksisterer ikke");
            
        }
    }
    
    public static String[] readdir(String sti) throws Exception{
        
        File file = null;
        String[] paths;
        
        // create new file object
        file = new File(sti);
    
        // array of files and directory
        paths = file.list();
    
        return paths;
        
    }
    
}

