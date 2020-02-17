package Lektion3.opgaveBMImedexeptions.opgave2;

public interface IFunktionalitet {
    // beregn BMI udfra personens CPR-nr
    double getBMI(String cpr) throws DataExeption;
    // returnér en tekst der beskriver BMI intervallet
    String getTextualBMI(String cpr) throws DataExeption;
    // returnér person navn udfra CPR-nr
    String getNavn(String cpr);
}
