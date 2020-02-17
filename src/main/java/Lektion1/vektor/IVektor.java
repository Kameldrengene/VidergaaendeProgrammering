package Lektion1.vektor;

interface IVektor {
    String toString();
    IVektor times(int x);
    IVektor add(IVektor v);
    boolean equals(IVektor v);
    int getX();
    int getY();
}
