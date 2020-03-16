package Lektion5.Serialisering;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serieMain {
    public static void main(String[] args) {
        Complex c = new Complex(2.4 ,4.5);
        try {
            FileOutputStream out = new FileOutputStream("/home/volkan/IdeaProjects/VidergaaendeProgrammering/src/main/java/Lektion5/Serialisering/c");
            ObjectOutputStream obj = new ObjectOutputStream(out);
            obj.writeObject(c);
            obj.close();
            out.close();
        }catch (Exception e){

        }
        try{
            FileInputStream in = new FileInputStream("/home/volkan/IdeaProjects/VidergaaendeProgrammering/src/main/java/Lektion5/Serialisering/c");
            ObjectInputStream objin = new ObjectInputStream(in);
            Complex complex = null;
            complex = (Complex) objin.readObject();
            System.out.println(complex.toString());
            in.close();
            objin.close();
        }catch (Exception e){

        }

    }
}
