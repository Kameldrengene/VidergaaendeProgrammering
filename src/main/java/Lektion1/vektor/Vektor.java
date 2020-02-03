package Lektion1.vektor;

public class Vektor implements IVektor {
    private int a,b;

    public Vektor(int a, int b){
        this.a = a;
        this.b = b;
    }
    public String toString(){
        return "a: " + a + " b: " + b;
    }
    public void times(int x){
        a=a*x;
        b=b*x;
    }
    public void add(IVektor vek_a){
        a+=((Vektor)vek_a).getA();
        b+=((Vektor)vek_a).getB();
    }
    public boolean equals(IVektor vek_a){
        return (vek_a.toString().equals(this.toString()));
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
}
