package Lektion1.Stak;

public class ArrayStak implements IStak {
    
    
    
    private String[] stak = new String[0];
    
    public void push(String e){
    
        String[] temp = new String[stak.length + 1];
    
        for (int i = 0; i < stak.length; i++) {
            temp[i] = stak[i];
        }
        
        temp[temp.length - 1] = e;
        stak = temp;
        
    }
    
    public String pop(){
        
        if(isEmpty()){
            return "Nothing to pop; stak is empty.";
        } else {
    
            String out = stak[stak.length - 1];
            String[] temp = new String[stak.length - 1];
    
            for (int i = 0; i < stak.length - 1; i++) {
                temp[i] = stak[i];
            }
    
            stak = temp;
            return out;
            
        }
    }
    
    public boolean isEmpty(){
        if(stak.length == 0){return true;} else {return false;}
    }
    
    public boolean isFull(){
        return false;
    }
    
    public void show(){
    
        for (int i = stak.length - 1; i >= 0 ; i--) {
            System.out.print(stak[i]);
            System.out.print(" ");
        }

    }
    
    public static void main(String[] args) {
        ArrayStak stak = new ArrayStak();
        stak.push("test");
        stak.push("test2");
        stak.show();
        stak.pop();
        stak.pop();
        String out = stak.pop();
        System.out.println(out);
        
    }
    
}
