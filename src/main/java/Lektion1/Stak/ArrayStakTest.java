package Lektion1.Stak;

public class ArrayStakTest {
    
    @org.junit.Test
    public void pushShow() {
    
        ArrayStak stak = new ArrayStak();
        
        stak.push("Dette");
        stak.push("er");
        stak.push("en");
        stak.push("mærkelig");
        stak.push("sætning");
        
        stak.show();
        
    }
    
    
    @org.junit.Test
    public void pop() {
    }
    
    @org.junit.Test
    public void isEmpty() {
    }
    
    @org.junit.Test
    public void isFull() {
    }
    
    
}