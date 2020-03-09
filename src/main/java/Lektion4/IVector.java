package Lektion4;

public interface IVector {
    
    void times(int k);
    void add(IVector v);
    boolean equal(IVector v);
    String toString();
    int[] getXY();
    
}
