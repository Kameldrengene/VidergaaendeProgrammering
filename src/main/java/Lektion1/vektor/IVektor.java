package Lektion1.vektor;

interface IVektor {
    String toString();
    void times(int x);
    void add(IVektor vek_a);
    boolean equals(IVektor vek_a);
}
