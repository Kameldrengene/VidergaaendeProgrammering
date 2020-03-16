package Lektion4;

public interface IVektor {
    String toString();
    IVektor times(int x);
    IVektor add(IVektor b);
    boolean equals(IVektor a);
}
