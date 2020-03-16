package Lektion1.stack;

public class LinkedStak implements Stak{
    Item ptr;
    public LinkedStak(){
    ptr = null;
    }

    public void push(String e){
        if(ptr == null){
            ptr = new Item(e,null);
        }else{
            ptr = new Item(e,ptr);
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
        Item temp = ptr;
        while (temp.ptr != null){
            System.out.println(temp.input);
            temp=temp.ptr;
        }
        System.out.println(temp.input);
        System.out.println("---End---");
    }
}
