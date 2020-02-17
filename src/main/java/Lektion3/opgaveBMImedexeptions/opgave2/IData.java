package Lektion3.opgaveBMImedexeptions.opgave2;

public interface IData {
    String getNavn(String cpr) throws DataExeption;
    double getVaegt(String cpr) throws DataExeption;
    double getHoejde(String cpr) throws DataExeption;
}
