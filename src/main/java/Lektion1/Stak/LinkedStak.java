package Lektion1.Stak;

public class LinkedStak {
    
    private String[] stak;
    private int size;
    private int counter = 0;
    
    public LinkedStak(int size){
        stak =  new String[size];
        this.size = size;
    }
    
    void push(String e){
        
        if(size == 0 || counter == stak.length){ System.out.println("Can't add"); return;}
        
        stak[counter++] = e;
        
    }
    
    String pop(){
        return "test";
    }
    
    boolean isEmpty(){
        return true;
    }
    
    boolean isFull(){
        return true;
    }
    
    void show(){
    
    }
    
 
    
}
