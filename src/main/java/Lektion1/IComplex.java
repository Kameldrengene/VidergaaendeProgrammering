package Lektion1;

public interface IComplex {
    String toString();
    double abs();
    double phase();
    IComplex plus(IComplex b);
    IComplex minus(IComplex b);
    IComplex times(IComplex b);
    IComplex scale(double alpha);
    IComplex conjugate();
    IComplex reciprocal();
    double re();
    double im();
    IComplex divides(IComplex b);
    IComplex exp();
    IComplex sin();
    IComplex cos();
    IComplex tan();
    //IComplex plus(IComplex a, IComplex b);
    boolean equals(Object x);
    int hashCode();



}