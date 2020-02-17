package Lektion3.Trelags;

public interface IFunktionalitet {
    // beregn BMI udfra personens CPR-nr
    double getBMI(String cpr) throws IData.DataException;
    // returnér en tekst der beskriver BMI intervallet
    String getTextualBMI(String cpr) throws IData.DataException;
    // returnér person navn udfra CPR-nr
    String getNavn(String cpr) throws IData.DataException;
}



