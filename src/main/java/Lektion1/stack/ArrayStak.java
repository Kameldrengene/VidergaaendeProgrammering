package main.java.Lektion1.stack;

public class ArrayStak implements Stak {

    String a[]= new String[0];
    int len;
    String temp[];

    public void push(String e){
        temp = new String[a.length+1];
        for (int i = 0; i < a.length ; i++) {
            temp[i] = a[i];
        }
        temp[a.length] = e;
        a = temp;

    }
    public String pop(){
        if (!isEmpty()) {
            temp = new String[a.length - 1];
            String str = a[a.length - 1];
            for (int i = 0; i < a.length - 1; i++) {
                temp[i] = a[i];
            }
            a = temp;


            return str;
        }
        return null;
    }

    public boolean isEmpty()
    {
        if (a.length == 0)
            return true;
        else
            return false;
    }
    public boolean isFull(){
     return false;
    }
    public void show(){
        String str = "";
        int len = a.length-1;
        for (int i = 0; i < len; i++) {
            str = str + pop() + " ";
        }
        str = str + pop();
        System.out.println(str);

    }
}
