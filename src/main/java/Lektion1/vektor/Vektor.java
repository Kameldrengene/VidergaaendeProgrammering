package Lektion1.vektor;

public class Vektor implements IVektor, Comparable<IVector>{
    private final int a, b;

    public Vektor(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return "(" + this.a + "," + this.b+")";
    }

    public IVektor times(int times) {
        int x, y;
        x = this.a * times;
        y = this.b * times;
        IVektor temp = new Vektor(x, y);
        return (IVektor) temp;
    }

    public IVektor add(IVektor v) {
        int x, y;
        x = this.a + ((Vektor) v).getA();
        y = this.b + ((Vektor) v).getB();
        IVektor temp = new Vektor(x, y);
        return (IVektor) temp;
    }

    public boolean equals(IVektor v) {
        return (this.a == ((Vektor)v).getA() && this.b == ((Vektor)v).getB());
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
