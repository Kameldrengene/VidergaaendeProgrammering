package Lektion1.Vektor.src;

public interface IVektor {
    String toString();
    IVektor times(int x);
    IVektor add(IVektor b);
    boolean equals(IVektor a);
}
