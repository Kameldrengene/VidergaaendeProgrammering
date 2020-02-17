package Lektion3.treLags.Data;


public interface IData {
    String getNavn(String cpr) throws DataException;

    double getVaegt(String cpr) throws DataException;

    double getHoejde(String cpr) throws DataException;

    class DataException extends Exception {
        public DataException() {
            super();
        }
    }
}

