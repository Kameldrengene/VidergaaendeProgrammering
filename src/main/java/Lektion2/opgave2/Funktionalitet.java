package Lektion2.opgave2;

public class Funktionalitet implements IFunktionalitet {
    private IData iData;
    public Funktionalitet(IData data){
        this.iData = data;
    }

    @Override
    public double getBMI(String cpr) {
        double bmi = iData.getVaegt(cpr)/(Math.pow(iData.getHoejde(cpr),2));

        return bmi;
    }

    @Override
    public String getTextualBMI(String cpr) {
        double bmi = getBMI(cpr);
        if (bmi<18.5)
            return "Du vejer for lidt";
        else if (bmi>=18.5 && bmi <25)
            return "Din vægt er passende";
        else if (bmi>=25 && bmi <= 30)
            return "Du er overvægtig";
        else if (bmi>30)
            return "Du er svært overvægtig";

        return "";
    }

    @Override
    public String getNavn(String cpr) {
        String navn = iData.getNavn(cpr);
        return navn;
    }
}
