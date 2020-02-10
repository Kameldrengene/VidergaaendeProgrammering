package Lektion2.treLags.Funk;

import Lektion2.treLags.Data.IData;

public class Funk implements IFunk {
    private IData data;

    public Funk(IData data) {
        this.data = data;


    }

    @Override
    public double getBMI(String cpr) {
        double height = data.getHoejde(cpr);
        double weight = data.getVaegt(cpr);
        return (weight/(height*height));
    }

    @Override
    public String getTextualBMI(String cpr) {
        double bmi = getBMI(cpr);
        String bmiStr = "Vejer for lidt";
        if(bmi >= 18.5 && bmi < 25){
            bmiStr = "Din vægt er passende";
        }
        if(bmi >= 25 && bmi <=30){
            bmiStr = "Du er overvægtig";
        }
        if(bmi > 30){
            bmiStr = "Du er svært overvægtig";
        }
        return bmiStr;
    }

    @Override
    public String getNavn(String cpr) {
        return data.getNavn(cpr);
    }
}
