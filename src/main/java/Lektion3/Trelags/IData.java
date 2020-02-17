package Lektion3.Trelags;

public interface IData {
    
    //Returner personens navn
    public String getNavn(String cpr) throws DataException;
    
    //Returner personens vægt
    public double getVaegt(String cpr) throws DataException;
    
    //Returner personens højde
    public double getHoejde(String cpr) throws DataException;
    
    public class DataException extends Exception{
       
        public DataException(String message){
            super(message);
        }
        
    }
    
}
