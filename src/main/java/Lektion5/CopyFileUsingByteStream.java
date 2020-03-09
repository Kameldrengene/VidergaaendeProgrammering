package Lektion5;

import java.io.*;

public class CopyFileUsingByteStream {
    
    public static void main(String[] args) {
    
        File src = new File("/Users/mikkeldanielsen/Desktop/fra.txt");
        File dest = new File("/Users/mikkeldanielsen/Desktop/til.txt");
        
        try{
    
            FileReader in = new FileReader(src);
            FileWriter out = new FileWriter(dest);
            
//           FileInputStream in = new FileInputStream(src);
//           FileOutputStream out = new FileOutputStream(dest);
    
            
            int c;
            while( (c = in.read()) != -1)
                System.out.println(c);
                out.write(c);
//
            
        } catch (Exception e){
            System.out.println("ups");
        
        }
        
        
        
    }


}
