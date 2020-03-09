package Lektion5;

import java.io.*;

public class Serialisering {
    
    public static void main(String[] args) {
        
        Complex c1 = new Complex(1.0,2.0);
        
        
        Complex c2 = new Complex(2.0,2.0);
        Complex c3 = new Complex(3.0,2.0);
        
        try{
            FileOutputStream out = new FileOutputStream("/users/mikkeldanielsen/desktop/gem");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            
            objOut.writeObject(c1);
            
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    
        try{
            FileInputStream in = new FileInputStream("/users/mikkeldanielsen/desktop/gem");
            ObjectInputStream objIn = new ObjectInputStream(in);

            Complex temp = (Complex) objIn.readObject();
            System.out.println(temp);



        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    
    
        Thread thread = new Thread();
    }
    
}
