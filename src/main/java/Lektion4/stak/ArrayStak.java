package Lektion4.stak;

import java.util.ArrayList;
import java.util.List;


public class ArrayStak<E> implements Stak<E> {

    List<E> arrray;

    public ArrayStak(){
    arrray = new ArrayList<>();
    }


    @Override
    public void push(E data) {
        arrray.add(data);
    }

    @Override
    public E pop() {
        E popped = arrray.get(arrray.size()-1);

        arrray.remove(arrray.size()-1);

        return popped;
    }


    @Override
    public boolean isEmpty() {
       return arrray.isEmpty();


    }

    @Override
    public boolean isFull() {

        return false;
    }

    @Override
    public void show() {
        for (int i = 0; i <arrray.size() ; i++) {
            System.out.println(arrray.get(i));
        }

    }

    public static void main(String[] args) {
        ArrayStak <Integer> arrayStak = new ArrayStak <Integer>();
        arrayStak.push(2);
        arrayStak.push(5);
        arrayStak.show();

        System.out.println(arrayStak.isEmpty());

        ArrayStak<String> arrayStak1 = new ArrayStak<>();

        arrayStak1.push("dette");
        arrayStak1.push("er");
        arrayStak1.push("er");
        arrayStak1.push("klogt");
        arrayStak1.show();
        System.out.println("--------------------");
        arrayStak1.pop();

        arrayStak1.show();

    }
}
