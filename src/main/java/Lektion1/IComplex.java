package Lektion1;

interface IComplex {
    String toString();
    double abs();
    double phase();
    Complex plus(Complex b);
    Complex minus(Complex b);
    Complex times(Complex b);
    Complex scale(double alpha);
    Complex conjugate();
    Complex reciprocal();
    public double re();
    public double im();
    Complex divides(Complex b);
    Complex exp();
    Complex sin();
    Complex cos();
    Complex tan();
    //Complex plus(Complex a, Complex b);
    boolean equals(Object x);
    int hashCode();



}