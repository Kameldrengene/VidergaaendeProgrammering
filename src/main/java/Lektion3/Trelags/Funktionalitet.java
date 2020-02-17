package Lektion3.Trelags;

public class Funktionalitet implements IFunktionalitet {
    
    IData data;
    
    public Funktionalitet(IData data){
        this.data = data;
    }
    
    @Override
    public double getBMI(String cpr) throws IData.DataException {
        
        return data.getVaegt(cpr)/Math.pow(data.getHoejde(cpr),2);
        
    }
    
    @Override
    public String getTextualBMI(String cpr) throws IData.DataException {
        
        double BMI = getBMI(cpr);
        String out = null;
        
        if(BMI < 18.5)
            out = "Du vejer for lidt";
        else if (BMI <= 18.5 && BMI < 25)
            out = "Din vægt er passende";
        else if (BMI <= 25 && BMI <= 30)
            out = "Du er overvægtig";
        else
            out = "Du er svært overvægtig";
        
        return out;
    }
    
    @Override
    public String getNavn(String cpr) throws IData.DataException {
            return data.getNavn(cpr);
    }
}
