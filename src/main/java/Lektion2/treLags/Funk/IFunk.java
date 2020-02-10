package Lektion2.treLags.Funk;

public interface IFunk {
    // beregn BMI udfra personens CPR-nr
    double getBMI(String cpr);
    // returnér en tekst der beskriver BMI intervallet
    String getTextualBMI(String cpr);
    // returnér person navn udfra CPR-nr
    String getNavn(String cpr);
}

