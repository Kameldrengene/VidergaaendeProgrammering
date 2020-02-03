package Lektion1.stack;

public class LinkedStak implements Stak{
    Object ptr;
    public LinkedStak(){
    ptr = null;
    }

    public void push(String e){
        if(ptr == null){
            ptr = new Object(e,null);
        }else{
            ptr = new Object(e,ptr);
        }
    }
    public String pop(){
        String out = ptr.input;
        ptr = ptr.ptr;
        return out;
    }

    public boolean isEmpty(){
        return (ptr == null);
    }
    public boolean isFull(){
        return false;
    }
    public void show(){
        if (ptr == null){
            System.out.println("---End---");
            return;
        }
        Object temp = ptr;
        while (temp.ptr != null){
            System.out.println(temp.input);
            temp=temp.ptr;
        }
        System.out.println(temp.input);
        System.out.println("---End---");
    }
}
